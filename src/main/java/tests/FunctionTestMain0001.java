package tests;

import java.util.function.Function;

public class FunctionTestMain0001 {

	public static void main(String[] args) {
		Function<String, Integer> strLen = (s) -> s.length();
		Function<Integer, Integer> square = (i) -> i * i;

		System.out.println(strLen.andThen(square).apply("Hello, I'm the best")

		);
	}

}
