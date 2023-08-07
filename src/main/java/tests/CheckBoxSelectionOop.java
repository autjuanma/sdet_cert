package tests;

import static com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly;
import static java.util.concurrent.TimeUnit.SECONDS;
import static supplier.DriverFactory.getDriver;

import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.TableDemoPage;

public class CheckBoxSelectionOop {

	private WebDriver driver;
	private TableDemoPage tableDemoPage;

//	Predicate<List<WebElement>> allMale = (l) -> l.get(1).getText().equalsIgnoreCase("male");
//	Predicate<List<WebElement>> allFemale = (l) -> l.get(1).getText().equalsIgnoreCase("female");

	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver = getDriver(browser);
		this.tableDemoPage = new TableDemoPage(driver);
	}

	@Test(dataProvider = "criteriaProvider")
	public void tableRowTest(Predicate<List<WebElement>> predicate) {
		tableDemoPage.goTo();
		tableDemoPage.selectRows(predicate);
		sleepUninterruptibly(1, SECONDS);
	}

	@DataProvider(name = "criteriaProvider")
	public Object[] tableData() {
		Predicate<List<WebElement>> allMale = (l) -> l.get(1).getText().equalsIgnoreCase("male");
		Predicate<List<WebElement>> allFemale = (l) -> l.get(1).getText().equalsIgnoreCase("female");
		Predicate<List<WebElement>> allGender = allMale.or(allFemale);
		Predicate<List<WebElement>> allAU = (l) -> l.get(2).getText().equalsIgnoreCase("AU");
		Predicate<List<WebElement>> allFemaleAU = allFemale.and(allAU);
		return new Object[] { /* allMale, allFemale, allGender, */ allAU, allFemaleAU };
	}

	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}

}
