package pracSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath="./drivers/chromedriver.exe";
		System.setProperty("webdriver.crhome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?hl=es");
		
	}

}
