package br.ce.waquino.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.waquino.core.BaseTest;
import br.ce.waquino.page.HomePage;
import br.ce.waquino.page.MenuPage;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta(){
		menu.acessarTelaPrincipal();
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
	}
}
