package hello.hellospring.discount;

import hello.hellospring.member.Grade;
import hello.hellospring.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int price) {
        int discountPercent = 10;
        return (member.getGrade() == Grade.VIP) ? price * discountPercent / 100 : 0;
    }
}
