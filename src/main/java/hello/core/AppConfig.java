package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    public MemberService provideMemberService() {
//        return new MemberServiceImpl(new MemoryMemberRepository());
//    }
//
//    public OrderService provideOrderService() {
//        return new OrderServiceImpl(
//                new MemoryMemberRepository(),
//                new RateDiscountPolicy()
//        );
//    }

    @Bean
    public MemberService provideMemberService() {
        return new MemberServiceImpl(provideMemberRepository());
    }

    @Bean
    public OrderService provideOrderService() {
        return new OrderServiceImpl(provideMemberRepository(), provideDiscountPolicy());
    }

    @Bean
    public MemberRepository provideMemberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy provideDiscountPolicy() {
        return new RateDiscountPolicy();
    }
}
