package br.ce.waquino.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.waquino.core.BaseTest;
import br.ce.waquino.page.ContasPage;
import br.ce.waquino.page.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta("Conta com movimentacao");
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	
		
	}
}
