package br.com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.automacao.SecretPage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	
	public FacebookPage digitarUsuario() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("testefacecia@gmail.com");
		
		return new FacebookPage(driver);
		}
	
	
	
	public FacebookPage digitarSenha() {

		WebElement senha = driver.findElement(By.id("pass"));
		senha.sendKeys("w135790");

		WebElement Btnloga = driver.findElement(By.id("loginbutton"));
		Btnloga.click();
				
		return new FacebookPage(driver);
	}

	
	public FacebookPage clicarSignin() {
		WebElement Btnloga = driver.findElement(By.id("loginbutton"));
		Btnloga.click();
		
		return new FacebookPage(driver);
	}
	
	public FacebookPage fazerLogin(String username,String password) {
		
		
		
		return new FacebookPage(driver);
	}
}
