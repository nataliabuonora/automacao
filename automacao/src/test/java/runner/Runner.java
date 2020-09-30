package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import interaction.Interaction;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import util.DriverContext;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/compra.feature" }, glue = { "" }, plugin = { "pretty",
		"html:target/report/html" }, monochrome = true, tags = { "@Automacao" }, strict = true)
public class Runner {

	static WebDriver driver;
	Interaction i = new Interaction();

	@BeforeClass
	public static void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		DriverContext.getDriver().get("https://www.kalunga.com.br/");
	}


	@AfterClass
	public static void afterClass() {
		DriverContext.getDriver().quit();
	}

}
