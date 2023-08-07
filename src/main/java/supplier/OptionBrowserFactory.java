package supplier;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionBrowserFactory {

	public static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--remote-allow-origins=*");

		return options;
	}

	public static FirefoxOptions getFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--width=1920");
		options.addArguments("--height=1080");
		return options;
	}

}
