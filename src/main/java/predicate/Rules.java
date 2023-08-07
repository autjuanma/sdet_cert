package predicate;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.google.common.base.Predicate;

public class Rules {

	private static Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
	private static Predicate<WebElement> hasS = (e) -> e.getText().toLowerCase().contains("s");

	public static List<Predicate<WebElement>> get() {
		List<Predicate<WebElement>> r = new ArrayList<>();
		r.add(isBlank);
		r.add(hasS);
		return r;
	}
}
