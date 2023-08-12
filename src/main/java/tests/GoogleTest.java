package tests;

import static supplier.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {

	private WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver = getDriver(browser);

	}

//	do not allow blank links
//	do not allow list containing s
//	convert link text to uppercase
//	print in the console

	@Test
	public void googleTest() {
		this.driver.get("https://google.com/");

		/*
		 * this.driver.findElements(By.tagName("a")).stream().filter(e ->
		 * e.getText().trim().length() > 0) .filter(e ->
		 * !e.getText().toLowerCase().contains("s")).map(e -> e.getText().toUpperCase())
		 * .forEach(e -> System.out.println(e));
		 */

//		refactor ----Reference  

		this.driver.findElements(By.tagName("a")).stream().map(WebElement::getText).map(String::trim)
				.filter(e -> e.length() > 0).filter(e -> !e.toLowerCase().contains("s")).map(String::toUpperCase)
				.forEach(System.out::println);

	}

	@AfterTest
	public void quit() {
		this.driver.quit();
	}

}
