package action;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverContext;


public interface Teclado {
	default void escrever(By elemento,String texto)
	{
		WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		DriverContext.getDriver().findElement(elemento).clear();
		DriverContext.getDriver().findElement(elemento).sendKeys(texto);
		
	}

}
