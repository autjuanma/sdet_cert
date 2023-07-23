package com.debaura.sdet_cert.suppiers;

import java.util.concurrent.Callable;

import com.google.common.base.Supplier;

public class TestMainCallable {

	public static void main(String[] args) throws Exception {

		Supplier<Double> random1 = () -> Math.random();
		Callable<Double> random2 = () -> Math.random();

		System.out.println(random1.get());
		System.out.println(random2.call());
		
		test(random2);

	}

	private static void test(Callable<Double> callabe) throws Exception {
		System.out.println(callabe.call());

	}

}
