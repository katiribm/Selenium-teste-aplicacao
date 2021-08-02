package br.ce.waquino.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.waquino.tests.ContaTest;
import br.ce.waquino.tests.MovimentacaoTest;
import br.ce.waquino.tests.RemoverMovimentacaoContaTest;
import br.ce.waquino.tests.ResumoTest;
import br.ce.waquino.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
}
