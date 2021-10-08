package com.orangeRHM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeRHM.elements.HomeDashboardPageElements;

public class HomeDashboardPage {
	
	WebDriver driver;
	HomeDashboardPageElements elements;
	
	/**
	 * constructor
	 * @param driver
	 */
	public HomeDashboardPage(WebDriver driver) {
		
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		elements = new HomeDashboardPageElements(this.driver);
		
	}
	
	//métodos
	public boolean isHomePage() {
		return elements.title.isDisplayed();
	}
	
}
