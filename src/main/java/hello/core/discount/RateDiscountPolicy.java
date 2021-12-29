package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    @Override
    public int discount(Member member, int price) {
        int discountPercent = 10;
        return (member.getGrade() == Grade.VIP) ? price * discountPercent / 100 : 0;
    }
}
