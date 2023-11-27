package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxdriver {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.cricbuzz.com/");
	
	System.out.println(" the tittle is :" +driver.getTitle());
	driver.close();
	}

}
