package test;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.facebook.pages.BasePage;
import br.com.facebook.pages.FacebookPage;
import br.com.facebook.pages.LoginPage;

public class RunnerTest {
	
    private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = BasePage.createChrome();
		new LoginPage(driver).fazerLogin("treinoselenium@outlook.com", "treinamento1");
		new LoginPage(driver).clicarLogar();
		
	}

	
	@Test
	public void inserirPubliacaoProprioPerfil() throws InterruptedException {
		new FacebookPage(driver).acessarPaginaInicial();
		new FacebookPage(driver).abreCriarPublicacao();
		new FacebookPage(driver).inserirPublicacaoProprioPerfil();
	}
	
	@Test
	public void entrarPerfil() throws InterruptedException {
		new FacebookPage(driver).pesquisar();
		new FacebookPage(driver).entrarNoPerfilDeOutro();
		
	}
	
	@Test
	public void inserirPublicacaoPerfilDeOutro() throws InterruptedException {
		new FacebookPage(driver).pesquisar();
		new FacebookPage(driver).entrarNoPerfilDeOutro();
		new FacebookPage(driver).inserirPublicacaoOutroPerfil();
		
	}
	
	@Test
	public void pesquisarNome() throws InterruptedException {
		new FacebookPage(driver).pesquisar();
		
    }
	
 
  @Test 
	public void mensagemChat() throws InterruptedException {
		new FacebookPage(driver).enviarMensagemChat();
	  
	}

}
