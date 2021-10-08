package com.orangeRHM.lib;

import org.openqa.selenium.WebDriver;

/**
 * App library
 * inicializa Page Library y Flow Library
 * @author Laia
 *
 */
public class AppLib {
	
	private WebDriver driver;
	private PageLib pageLib;
	private FlowLib flowLib;
	
	/**
	 * constructor
	 * @param driver
	 */
	public AppLib(WebDriver driver) {

		this.driver = driver;
		pageLib = new PageLib(this.driver);
		flowLib = new FlowLib(this.driver);
		
	}

	/**
	 * getters
	 */
	public PageLib getPageLib() {
		return pageLib;
	}
	
	public FlowLib getFlowLib() {
		return flowLib;
	}
}
