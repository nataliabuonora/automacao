package action;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.DriverContext;


public interface WebDriver {
	
	default void abrirUrl(String url) {
		org.openqa.selenium.WebDriver driver = DriverContext.getDriver();
		if (driver == null) {
			switch (System.getProperty("navegador")) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver2.exe");
				driver = new ChromeDriver();
				break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			default:
				Assert.fail("Navegador inv�lido!");
				break;
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			DriverContext.setDriver(driver);
		} else {
			driver.get(url);
			DriverContext.setDriver(driver);
		}
	}


	

	}

