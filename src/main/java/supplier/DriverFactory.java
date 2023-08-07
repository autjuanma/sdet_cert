package supplier;

import static supplier.OptionBrowserFactory.getChromeOptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Supplier;

public class DriverFactory {

	static WebDriver midriver;

	private static final Supplier<WebDriver> chromeSupplier = () -> {
		midriver = new ChromeDriver(getChromeOptions());
		return midriver;
	};

	private static final Supplier<WebDriver> firefoxSupplier = () -> {
		midriver = new FirefoxDriver(OptionBrowserFactory.getFirefoxOptions());
		return midriver;
	};

	private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();

	static {
		MAP.put("chrome", chromeSupplier);
		MAP.put("firefox", firefoxSupplier);
	}

	public static WebDriver getDriver(String browser) {
		return MAP.get(browser).get();
	}

}
