package tests;

import java.util.function.Function;

public class FunctionTestMain0002 {

	public static void main(String[] args) {

		Function<Integer, Integer> plus2 = (i) -> i + 2;
		Function<Integer, Integer> square = (i) -> i * 2;

		System.out.println(
				//10 					//100
				plus2.compose(square).apply(8)

		);

	}

}
