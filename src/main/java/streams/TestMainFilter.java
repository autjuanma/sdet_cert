package streams;

import java.util.ArrayList;
import java.util.List;

public class TestMainFilter {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

//		check for even numbers
//		ensure that number > 5
//		find the square and 2 to that
//		print it on the console one by one - new line	

		System.out.println("starting");

		list.stream().peek(i -> System.out.println("filter-received ::" + i)).filter(i -> i % 2 == 0).filter(i -> i > 5)
				.peek(i -> System.out.println("Map receive :: " + i)).map(i -> i * i).map(i -> i + 2)
				.forEach(i -> System.out.println(i));
		System.out.println("eding");

	}

}
