package com.debaura.sdet_cert.suppiers;

import com.google.common.base.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String, Integer> strLen = (s) -> s.length();
		Function<Integer, Integer> square = (i) -> i * i;

		System.out.println(strLen.andThen(square).apply("Hello, I'm the best"));

	}

}
