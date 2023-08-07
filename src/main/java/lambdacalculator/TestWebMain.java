package lambdacalculator;

public class TestWebMain {

	public static void main(String[] args) {

		MathOperation add = (a, b) -> a + b;
		MathOperation subtract = (a, b) -> a - b;
		MathOperation multiply = (a, b) -> a * b;
		MathOperation devide = (a, b) -> a / b;

		int onScreenNumber = 0;

		onScreenNumber = calculate(5, add, 2);
		onScreenNumber = calculate(onScreenNumber, subtract, 3);
		onScreenNumber = calculate(onScreenNumber, multiply, 7);
		onScreenNumber = calculate(onScreenNumber, add, 2);
		onScreenNumber = calculate(onScreenNumber, devide, 3);

		System.out.println(onScreenNumber);

	}

	private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
		return mathOperation.operate(onScreenNumber, enteredNumber);

	}

}
