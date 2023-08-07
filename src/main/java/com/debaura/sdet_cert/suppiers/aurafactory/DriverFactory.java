package com.debaura.sdet_cert.suppiers.aurafactory;

import static com.debaura.sdet_cert.suppiers.aurafactory.OptionsFact.getChromeOptions;
import static com.debaura.sdet_cert.suppiers.aurafactory.OptionsFact.getFirefoxOptions2;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Supplier;

public class DriverFactory {

	public static WebDriver getDriver(String browser) {
		return MAP.get(browser).get();
	}

	static WebDriver driver;

	private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();

	public static final Supplier<WebDriver> chromesupplier = () -> {
		driver = new ChromeDriver(getChromeOptions());
		return driver;
	};

	public static final Supplier<WebDriver> torsupplier = () -> {
		driver = new FirefoxDriver(getFirefoxOptions2());
		return driver;
	};

	private static final Supplier<WebDriver> firefoxsupplier = () -> {
		driver = new FirefoxDriver(OptionsFact.getFirefoxOptions());
		return driver;
	};

	static {
		MAP.put("chrome", chromesupplier);
		MAP.put("firefox", firefoxsupplier);
		MAP.put("tor", torsupplier);
	}

}
