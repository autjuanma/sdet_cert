package com.debaura.sdet_cert.suppiers.aurafactory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsFact {

	public static ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-popup-blocking");
		return options;
	}

	public static FirefoxOptions getFirefoxOptions() {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--width=1920");
		options.addArguments("--height=1080");
//		options.addArguments("window-size=1800,900");

		return options;
	}

	public static FirefoxOptions getFirefoxOptions2() {
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(getFirefoxProfile2());
		options.addArguments("--width=1920");
		options.addArguments("--height=1080");

		return options;
	}

	public static FirefoxProfile getFirefoxProfile2() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("extensions.torlauncher.start_tor", false);
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.socks", "127.0.0.1");
		profile.setPreference("extensions.torlauncher.start_tor", false);
		profile.setPreference("extensions.torbutton.block_disk", false);
		profile.setPreference("extensions.torbutton.custom.socks_host", "127.0.0.1");
		profile.setPreference("extensions.torbutton.custom.socks_port", 9150);
//		profile.setPreference("extensions.torbutton.custom.socks_port", 9151);
		profile.setPreference("extensions.torbutton.inserted_button", true);
		profile.setPreference("extensions.torbutton.launch_warning", false);
		profile.setPreference("privacy.spoof_english", 2);
		profile.setPreference("extensions.torbutton.loglevel", 2);
		profile.setPreference("extensions.torbutton.logmethod", 0);
		profile.setPreference("extensions.torbutton.settings_method", "custom");
		profile.setPreference("extensions.torbutton.use_privoxy", false);
		profile.setPreference("extensions.torlauncher.control_port", 9251); // 9251
		profile.setPreference("extensions.torlauncher.loglevel", 2);
		profile.setPreference("extensions.torlauncher.logmethod", 0);
		profile.setPreference("extensions.torlauncher.prompt_at_startup", false);
		profile.setPreference("browser.startup.page", "0");
		profile.setPreference("browser.startup.homepage", "about:newtab");
		profile.setPreference("extensions.torlauncher.prompt_at_startup", 0);
		profile.setPreference("webdriver.load.strategy", "normal");
		profile.setPreference("app.update.enabled", false);
		profile.setPreference("extensions.torbutton.versioncheck_enabled", false);
		profile.setPreference("extensions.torbutton.prompted_language", true);
		profile.setPreference("network.proxy.socks_port", 9150);
		profile.setPreference("network.proxy.socks_version", 5);
//		profile.setPreference("network.proxy.socks_port", 9151);
		profile.setPreference("extensions.torbutton.socks_port", 9150);
		return profile;
	}

}
