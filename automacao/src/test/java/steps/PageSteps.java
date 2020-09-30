package steps;

import interaction.Interaction;

import io.cucumber.java8.En;
import page.Page;

public class PageSteps implements En {

	Interaction i = new Interaction();

	public PageSteps() {

		Given("clico na busca", () -> {
			i.esperarPaginaCarregar(20);
			i.clicar(Page.TXT_PESQUISA);

		});

		And("escrevo o nome do produto {string}", (String produto) -> {
			i.escrever(Page.TXT_DIGITAR, produto);
		});

		And("clico no botao ok", () -> {
			i.clicar(Page.BTN_OK);
		});

		And("clico no botao comprar", () -> {
			i.esperarPaginaCarregar(20);
			i.clicar(Page.BTN_COMPRAR);
		});

		And("entro no carrinho", () -> {
			i.esperarPaginaCarregar(20);
			i.clicar(Page.BTN_CARRINHO);
		});

		And("valido o nome do produto {string}", (String nome) -> {
			i.esperarPaginaCarregar(20);
			i.validar(Page.VLD_NOME, nome);

		});

		Then("valido o preco {string}", (String preco) -> {
			i.esperarPaginaCarregar(20);
			i.validar(Page.VLD_PRECO, preco);
		});

	}

}
