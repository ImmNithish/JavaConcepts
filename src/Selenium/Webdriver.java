package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");// triggering web driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // for maximizing screen
		driver.manage().deleteAllCookies(); // to delete cookies
		driver.get("https://www.cricbuzz.com/"); // to open the page
	
	System.out.println("the current page :" +driver.getTitle());// to check we opened the crt page or not by checking the tittle of the page
	System.out.println("the current url is :"+driver.getCurrentUrl());
	driver.close();
		
	}

}
