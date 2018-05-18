package PageObject.automacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecretPage extends PaginaBase{

	public SecretPage(WebDriver driver) {
	super(driver);
	}
	
	
	public MePage clicarMe() {
		driver.findElement(By.linkText("SIGN IN")).click();
		return new MePage(driver);
		
	}


}


