package com.orangeRHM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeRHM.elements.LoginPageElements;

public class LoginPage {
	
	WebDriver driver;
	LoginPageElements elements;
	
	/**
	 * constructor
	 */
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		elements = new LoginPageElements(this.driver);
		
	}

	//métodos
	/**
	 * introducir nombre de usuario
	 * @param username
	 */
	public void setUsername(String username) {
		elements.inputUsername.sendKeys(username);
	}
	
	/**
	 * introducir contraseña
	 * @param password
	 */
	public void setPassword(String password) {
		elements.inputPassword.sendKeys(password);
	}
	
	/**
	 * comprobar si está activado
	 * @return true si está activado, false si no
	 */
	public boolean loginButtonIsEnabled() {
		return elements.btnLogin.isEnabled();
	}
	
	/**
	 * click en el botón de login
	 */
	public void clickLoginButton() {
		elements.btnLogin.click();
	}
	
}
