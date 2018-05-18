package br.com.facebook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RunnerTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = BasePage.createChrome();	
		
	}

	
	@Test
	public void testlogar() {
		new LoginPage(driver).fazerLogin("testefacecia@gmail.com", "qw135790").clicarLogar();
		
		
	}
	
//	@Test
	//public void pesquisar() {
		//new FacebookPage(driver).pesquisar();
		
//	}
	
}
