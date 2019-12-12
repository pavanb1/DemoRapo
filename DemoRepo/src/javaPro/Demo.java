package javaPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\SeleniumWebDriverThree\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Login amazon
		
		driver.get("https://www.amazon.in");
		

	}

}
