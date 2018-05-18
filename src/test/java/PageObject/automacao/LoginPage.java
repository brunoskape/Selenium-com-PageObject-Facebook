package PageObject.automacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PaginaBase{
	
	public LoginPage(WebDriver driver) {
	super(driver);

	}
	

	public LoginFormPage clickSign() {
		driver.findElement(By.linkText("Sign in")).click();
		
		return new LoginFormPage(driver);
		
		
	}
	
	
}
