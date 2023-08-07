package com.debaura.sdet_cert.webtest;

import java.util.Scanner;

public class NameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your name: ");
		String name = sc.next();
		System.out.println(name);
		String latestCharacter = name.substring(name.length() - 3);
		System.out.println("las ultimas 3 letras son: " + latestCharacter);
		sc.close();
	}

}
