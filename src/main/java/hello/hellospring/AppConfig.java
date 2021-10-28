package hello.hellospring;

import hello.hellospring.discount.DiscountPolicy;
import hello.hellospring.discount.RateDiscountPolicy;
import hello.hellospring.member.MemberRepository;
import hello.hellospring.member.MemberService;
import hello.hellospring.member.MemberServiceImpl;
import hello.hellospring.member.MemoryMemberRepository;
import hello.hellospring.order.OrderService;
import hello.hellospring.order.OrderServiceImpl;
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
