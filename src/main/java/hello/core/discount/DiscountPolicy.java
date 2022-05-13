package hello.core.discount;

import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("fixDiscountPolicy")
public interface DiscountPolicy {
	/**
	 * @return 할인 대상 금액
	 */
	int discount(Member member, int price);
}
