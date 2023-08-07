package com.debaura.sdet_cert.webtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.debaura.sdet_cert.predicate.Rules;
import com.debaura.sdet_cert.suppiers.aurafactory.DriverFactory;

public class HomeTest {

	private WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("firefox") String browser) {
		this.driver = DriverFactory.getDriver(browser);
	}

	@Test
	public void googleTest() {
		this.driver.get("https://google.com");

		List<WebElement> elements = this.driver.findElements(By.tagName("a"));

		System.out.println("before::" + elements.size());
		Rules.get().forEach(elements::removeIf);
		elements.forEach(e -> System.out.println(e.getText()));

	}

	@AfterTest
	public void quit() {
		this.driver.quit();
	}

}
