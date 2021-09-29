package driverStrategy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {
	
	private static DriverSingleton instance=null;
	private static WebDriver driver;
	
	private DriverSingleton(String driver) {
		instantiate(driver);
	}
	public static WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy=DriverStrategyImplement.chooseStrategy(strategy);
		driver=driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
			
	}
	public static DriverSingleton getInstance(String driver) {
		if(instance==null) {
			instance= new DriverSingleton(driver);
		}
		
		return instance;
	}
	public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
