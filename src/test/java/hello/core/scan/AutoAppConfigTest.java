package hello.core.scan;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by cadqe13@gmail.com on 2022-05-01
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
class AutoAppConfigTest {

	@Test
	void basicScan() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

		MemberService memberService = ac.getBean(MemberService.class);

		Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
	}

}