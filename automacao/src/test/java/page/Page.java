package page;

import org.openqa.selenium.By;

public class Page {

	public static By TXT_PESQUISA = By.id("txtBuscaProd");
	public static By TXT_DIGITAR = By.id("txtBuscaProd");
	public static By BTN_OK = By.id("btnPesquisa");
	public static By BTN_COMPRAR = By.xpath("//*[@id='_Produtos']/ul/div[1]/div[3]/div[3]/div/div/div[2]/button[1]");
	public static By BTN_CLOSE = By.id("btClose");
	public static By BTN_CARRINHO = By.id("carrinho");

	public static By VLD_NOME = By.xpath(
			"//*[@id='aspnetForm']/section/div/div[2]/div/div[4]/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/a/small");
	public static By VLD_PRECO = By.xpath(
			"//*[@id='aspnetForm']/section/div/div[2]/div/div[4]/div[2]/div/div[1]/div[2]/div/div/div[4]/div/div[1]/small[2]");
}
