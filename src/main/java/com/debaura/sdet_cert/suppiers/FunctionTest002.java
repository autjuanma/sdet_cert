package com.debaura.sdet_cert.suppiers;

import com.google.common.base.Function;

public class FunctionTest002 {

	public static void main(String[] args) {

		Function<Integer, Integer> plus2 = (i) -> i + 2;
		Function<Integer, Integer> square = (i) -> i * 2;
		System.out.println(plus2.compose(square).apply(8));

	}

}
