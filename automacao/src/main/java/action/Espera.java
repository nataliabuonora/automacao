package action;

import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverContext;


public interface Espera {
	
	default void esperarPaginaCarregar(int timeout)
	{
		 Wait<WebDriver> wait = new WebDriverWait(DriverContext.getDriver(), timeout);
		    wait.until(new Function<WebDriver, Boolean>() {
		        public Boolean apply(WebDriver driver) {
		            System.out.println("Current Window State       : "
		                + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
		            return String
		                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
		                .equals("complete");
		        }
		    });}

}
