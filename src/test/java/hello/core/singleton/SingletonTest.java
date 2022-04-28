package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SingletonTest {

	@Test
	@DisplayName("스프링 없는 순수한 DI 컨테이너")
	void pureContainer() {
		AppConfig appConfig = new AppConfig();

		// 1. 조회 : 호출할 떄 마다 객체를 생성
		MemberService memberService = appConfig.provideMemberService();

		// 2. 조회 : 호출할 떄 마다 객체를 생성
		MemberService memberService2 = appConfig.provideMemberService();

		// 참조 값 다른 것을 확인
		System.out.println("m1= " + memberService);
		System.out.println("m2= " + memberService2);

		// m1 != m2
		assertThat(memberService).isNotSameAs(memberService2);
	}
}
