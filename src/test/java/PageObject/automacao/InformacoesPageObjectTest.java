package PageObject.automacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class InformacoesPageObjectTest {
		private WebDriver driver;
	
	
		
	@Before
	public void setUp() {
	driver = PaginaBase.createChrome();
	
	}
	
	
	@Test
	public void testAdicionarUmaInformacaoDoUsuario() {
		new LoginPage(driver).clickSign().fazerLogin("julio0001", "123456").clicarMe().clicarMoreDataAbout();
		
		
		
	}
	
	
	
	@After
	public void tearDown() {
	driver.quit();
		
		

		
		
	}
	

}
