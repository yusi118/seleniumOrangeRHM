package com.orangeRHM.tests;

import org.junit.Assert;
import org.junit.Test;


/**
 * Test de la página OrangeHRM
 * https://opensource-demo.orangehrmlive.com/
 */
public class OrangeRHMTest extends BaseTest {
    
	/**
	 * login correcto
	 */
    @Test
    public void loginTest() {

    	//navegar a la pagina
    	//getApp().getFlowLib().navigateToUrl("https://opensource-demo.orangehrmlive.com/");
    	
    	//rellenar usuario y contraseña
    	getApp().getPageLib().getLoginPage().setUsername("Admin");
    	getApp().getPageLib().getLoginPage().setPassword("admin123");
    	
    	//comprobar que el botón está activo
    	boolean loginEnabled = getApp().getPageLib().getLoginPage().loginButtonIsEnabled();
    	Assert.assertTrue(loginEnabled);
    	
    	//click en el botón
    	getApp().getPageLib().getLoginPage().clickLoginButton();
    	
    	//comprobar que esta en home
    	boolean isLogged = getApp().getPageLib().getHomePage().isHomePage();
    	Assert.assertTrue(isLogged);
    	
    }
}
