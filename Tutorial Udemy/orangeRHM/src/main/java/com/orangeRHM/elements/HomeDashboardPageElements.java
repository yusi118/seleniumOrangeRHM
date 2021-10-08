package com.orangeRHM.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDashboardPageElements {
	
	WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Dashboard']")
	public WebElement title;
	
	public HomeDashboardPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
