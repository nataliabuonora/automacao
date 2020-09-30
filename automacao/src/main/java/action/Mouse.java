package action;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverContext;


public interface Mouse {

	default void clicar(By elemento) {
		WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		DriverContext.getDriver().findElement(elemento).click();
	}
	
}
