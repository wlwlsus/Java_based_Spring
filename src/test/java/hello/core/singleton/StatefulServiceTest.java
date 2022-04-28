package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by cadqe13@gmail.com on 2022-04-29
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
class StatefulServiceTest {

	@Test
	void statefulServiceSingleton() {

		ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
		StatefulService statefulService1 = ac.getBean(StatefulService.class);
		StatefulService statefulService2 = ac.getBean(StatefulService.class);

		int p1 = statefulService1.order("userA", 10000);
		int p2 = statefulService2.order("userB", 20000);

//		int price = statefulService1.getPrice();

		System.out.println("price = " + p1);

//		assertThat(statefulService1.getPrice()).isEqualTo(20000);
	}

	static class TestConfig {
		@Bean
		public StatefulService statefulService() {
			return new StatefulService();
		}
	}

}