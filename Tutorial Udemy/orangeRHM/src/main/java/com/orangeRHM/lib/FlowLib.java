package com.orangeRHM.lib;

import org.openqa.selenium.WebDriver;
/**
 * Clase de interacción con el driver
 * @author Laia
 *
 */
public class FlowLib {
	
	WebDriver driver;
	
	/**
	 * constructor
	 * @param driver
	 */
	public FlowLib(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * navegar a la página
	 * @param url
	 */
	public void navigateToUrl(String url) {
		this.driver.get(url);
	}
	
	/**
	 * obtener la url
	 * @return url de la página actual
	 */
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
}
