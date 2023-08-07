package streams;

import java.util.ArrayList;
import java.util.List;

public class TestMainStreams {

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

		list.stream().filter(i -> i % 2 == 0).limit(3).map(i -> i * i).forEach(i -> System.out.println(i));

		list.stream().filter(i -> {
			System.out.println("Filtered-received :: " + i);
			return i % 2 == 0;
		}).limit(3).map(i -> {
			System.out.println("map -received :: " + i);
			return i * i;
		}).forEach(i -> System.out.println(i));

	}

}
