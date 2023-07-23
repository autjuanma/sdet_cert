package com.debaura.sdet_cert.predicate;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.google.common.base.Predicate;

public class Rules {

//	duda
	private static Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
	private static Predicate<WebElement> hasS = (h) -> h.getText().trim().length() == 0;

	public static List<Predicate<WebElement>> get() {
		List<Predicate<WebElement>> r = new ArrayList<>();
		r.add(isBlank);
		r.add(hasS);
		return r;
	}

}
