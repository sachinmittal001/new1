package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {

	//	System.setProperty("webdriver.chrome.driver", "/opt/WebDriver/bin/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/opt/WebDriver/bin/geckodriver");
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/?client=safari");

	}

}
