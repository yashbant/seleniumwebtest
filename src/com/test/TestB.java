package com.test;

import org.junit.AfterClass;
import org.testng.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestB {

public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching firefox browser");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testPageTitleSampleB() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
		
		@Test
		public void testSampleOne() {
			System.out.println("Im in test sample one");
		}
		
		@Test
		public void testSampleTwo() {
			System.out.println("Im in test sample two");
		}
		
		@Test
		public void testSampleThree() {
			System.out.println("Im in test sample three");
		}

		@AfterClass
		public void tearDown() {
			if(driver!=null) {
				System.out.println("Closing IE browser");
				driver.quit();
			}
		}
		
	}