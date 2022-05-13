package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Created by cadqe13@gmail.com on 2022-05-13
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
@Getter
@Setter
@ToString
public class HelloLombok {

	private String name;
	private int age;


	public static void main(String[] args) {

		HelloLombok helloLombok = new HelloLombok();
		helloLombok.setName("asd");
		helloLombok.setAge(123);

		System.out.println("helloLombok = " + helloLombok);
	}
}
