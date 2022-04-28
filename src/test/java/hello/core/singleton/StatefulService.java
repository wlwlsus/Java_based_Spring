package hello.core.singleton;

/**
 * Created by cadqe13@gmail.com on 2022-04-29
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
public class StatefulService {

	private int price; // 상태를 유지하는 필드

	public int order(String name, int price) {
		System.out.println("name = " + name + ", price = " + price);
//		this.price = price; // 여기가 문제!
		return price;
	}

	public int getPrice() {
		return price;
	}
}
