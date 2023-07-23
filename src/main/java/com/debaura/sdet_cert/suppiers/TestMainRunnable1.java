package com.debaura.sdet_cert.suppiers;

import static java.util.concurrent.TimeUnit.SECONDS;

import com.google.common.util.concurrent.Uninterruptibles;

public class TestMainRunnable1 {

	public static void main(String[] args) {
		Uninterruptibles.sleepUninterruptibly(2, SECONDS);
		Runnable r = () ->System.out.println("Hello world");
		new Thread(r).start();
		System.out.println("Hi");

	}

}
