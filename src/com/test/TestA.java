package com.test;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {
	
	 WebDriver driver;
	
	public void setup() {
		System.out.println("**");
		System.out.println("launching chrome browser");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();	
	}
	
	@Test
	public void testPageTitleSampleA() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	@Test
	public void testSampleThree() {
		System.out.println("Im in test sample three");
	}
	
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing firefox browser");
			driver.quit();
		}
	

}
}
