package br.ce.waquino.page;

import br.ce.waquino.core.BasePage;
import br.ce.waquino.core.DriverFactory;	


	public class LoginPage extends BasePage {
		
		public void acessarTelaInicial(){
			DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/");
		}
		
		public void setEmail(String email) {
			escrever("email", email);
		}
		
		public void setSenha(String senha) {
			escrever("senha", senha);
		}
		
		public void entrar(){
			clicarBotaoPorTexto("Entrar");
		}
		
		//este substitui os 3 iniciais. simplifica o login da pagina. 
		public void logar(String email, String senha) { 
			setEmail(email);
			setSenha(senha);
			entrar();
		}

	}


