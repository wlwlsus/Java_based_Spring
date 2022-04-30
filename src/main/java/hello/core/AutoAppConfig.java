package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//				basePackages = "hello.core",
				excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

	// 수동 빈 자동 빈 등록, 충돌 테스트
//	@Bean(name = "memoryMemberRepository")
//	public MemberRepository memberRepository() {
//		return new MemoryMemberRepository();
//	}
}
