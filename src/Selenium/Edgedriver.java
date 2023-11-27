package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgedriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.get("https://www.cricbuzz.com/");
		System.out.println("the url is :" +driver1.getCurrentUrl());
		System.out.println(" the curent page title is :" +driver1.getTitle());
		driver1.close();
		
		
		
		
		
		
	}
}
