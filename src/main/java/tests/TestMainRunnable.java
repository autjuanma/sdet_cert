package tests;

import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.util.concurrent.TimeUnit.SECONDS;

import com.google.common.util.concurrent.Uninterruptibles;

public class TestMainRunnable {

	public static void main(String[] args) {
		sleepUninterruptibly(2, SECONDS);
		Runnable r = () -> System.out.println("hello world");
		new Thread(r).start();
		System.out.println("Hi");
	}

}