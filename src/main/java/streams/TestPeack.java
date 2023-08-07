package streams;

import java.util.ArrayList;
import java.util.List;

public class TestPeack {

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

//		Check for even numbers
//		Interested in only 3 elements
//		find square 
//		print it on the console one by one -new line

		System.out.println("starting");

		list.stream().skip(4).peek(i -> System.out.println("filter-received ::	" + i)).filter(i -> i % 2 == 0).limit(3)
				.peek(i -> System.out.println("Map -received ::" + i)).map(i -> i * i)
				.forEach(i -> System.out.println(i));
		System.out.println("ending");

	}

}
