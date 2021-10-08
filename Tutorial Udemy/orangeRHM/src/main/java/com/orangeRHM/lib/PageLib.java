package com.orangeRHM.lib;

import org.openqa.selenium.WebDriver;

import com.orangeRHM.pages.HomeDashboardPage;
import com.orangeRHM.pages.LoginPage;

/**
 * Page Library
 * Inicializa las clases intermediarias de las páginas (Page Object Model)
 */
public class PageLib {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private HomeDashboardPage homePage;
	//declarar aquí más páginas
	
	/**
	 * constructor
	 * @param driver
	 */
	public PageLib(WebDriver driver) {
		this.driver = driver;
		loginPage = new LoginPage(this.driver);
		homePage = new HomeDashboardPage(this.driver);
		//inicializar a aquí las páginas
	}
	
	/**
	 * getters de las paginas
	 */
	public LoginPage getLoginPage() {
		return loginPage;
	}
	
	public HomeDashboardPage getHomePage() {
		return homePage;
	}
	
	//añadir getters de las páginas
	
}
