package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

  @Test
  @DisplayName("스프링 없는 순수한 DI 컨테이너")
  void pureContainer() {
    AppConfig appConfig = new AppConfig();

    MemberService memberService = appConfig.provideMemberService();

    MemberService memberService2 = appConfig.provideMemberService();

    System.out.println("m1= " + memberService);
    System.out.println("m2= " + memberService2);
  }
}
