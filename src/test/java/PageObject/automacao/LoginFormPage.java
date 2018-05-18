package PageObject.automacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends PaginaBase{
	 
	 
	
	public LoginFormPage(WebDriver driver) {
		super(driver);

		
	}
	
	public LoginFormPage digitarLogin (String email) {
		driver.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("login");
			
		return this;
			
	}
	
	public LoginFormPage digitarSenha (String senha) {
		driver.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("password");
		
		return this;
	}
	
	
	public SecretPage clicarSignin() {
		driver.findElement(By.linkText("SIGN IN")).click();
		
		return new SecretPage(driver);
	}
	
	
	public SecretPage fazerLogin(String login, String senha) {
		digitarLogin(login);
		digitarSenha(senha);
		
		return new SecretPage(driver); 
	}
}
