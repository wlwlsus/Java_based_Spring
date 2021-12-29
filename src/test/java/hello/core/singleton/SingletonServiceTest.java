package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SingletonServiceTest {


    @Test
    @DisplayName("싱글톤 패턴 적용 객체 사용")
    public void SingletonServiceTestMethod() {
        SingletonService s1 = SingletonService.getInstance();
        SingletonService s2 = SingletonService.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.logic());
        assertThat(s1).isSameAs(s2);
    }
}