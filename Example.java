package seleniumcourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver/chromedriver.exe");
		
		//C:\Seleniumdemo\Drivers\Chromedriver
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@class='wp-categories-link maxheight']").click();
		
	
	}

}
