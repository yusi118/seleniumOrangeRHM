package com.orangeRHM.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Factory de Login Page
 * @author Laia
 *
 */
public class LoginPageElements {
	
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	public WebElement inputUsername;
	
	@FindBy(id="txtPassword")
	public WebElement inputPassword;
	
	@FindBy(id="btnLogin")
	public WebElement btnLogin;
	
	/**
	 * constructor
	 * @param driver
	 */
	public LoginPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
