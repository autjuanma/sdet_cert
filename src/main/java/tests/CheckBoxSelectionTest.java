package tests;

import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supplier.DriverFactory;

public class CheckBoxSelectionTest {

	private WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver = DriverFactory.getDriver(browser);

	}

	@Test(dataProvider = "gender")
	public void googleTest(String gender) {
		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-1.html");
//		this.driver.findElements(By.tagName("a")).stream().forEach(WebElement::click);

		this.driver.findElements(By.tagName("tr")).stream().skip(1).map(tr -> tr.findElements(By.tagName("td")))
				.filter(tdList -> tdList.size() ==4)
				.filter(tdList -> tdList.get(1).getText().equalsIgnoreCase(gender)).map(tdList -> tdList.get(3))
				.map(td -> td.findElement(By.tagName("input"))).forEach(WebElement::click);

		sleepUninterruptibly(1, SECONDS);

	}

	@DataProvider(name = "gender")
	public Object[] testData() {
		return new Object[] { "male", "female" };
	}

	@AfterTest
	public void quit() {
		this.driver.quit();
	}

}
