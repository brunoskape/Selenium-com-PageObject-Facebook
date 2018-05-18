package br.com.facebook;

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
		new LoginPage(driver).fazerLogin("testefacecia@gmail.com", "w135790").clicarLogar();
				
		
	}
	
	
}
