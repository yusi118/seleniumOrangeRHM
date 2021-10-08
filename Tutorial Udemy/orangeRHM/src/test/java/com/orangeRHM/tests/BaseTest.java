package com.orangeRHM.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangeRHM.lib.AppLib;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;


/**
 * acciones a realizar en todos los test
 * @author Laia
 *
 */
public class BaseTest {
	
		WebDriver driver;
		private AppLib app;

		@Before
		public void setUp() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/WebDriver/chromedriver.exe");
	
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			app = new AppLib(driver);
		
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
		}
		
		@After
		public void tearDown() {
			
			driver.close();
		
		}
		
		//getter
		public AppLib getApp() {
			return this.app;
		}
		
}
