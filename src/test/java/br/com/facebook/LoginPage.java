package br.com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.automacao.SecretPage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	
	public LoginPage digitarUsuario(String username) {
	    driver.findElement(By.id("email")).sendKeys("testefacecia@gmail.com");
		
		return this;
		}
	
	
	
	public LoginPage digitarSenha(String senha) {

		driver.findElement(By.id("pass")).sendKeys("qw135790");
	
		return this;
	}

	
	
	
	public FacebookPage fazerLogin(String username,String password) {
		digitarUsuario(username);
		digitarSenha(password);
		
		
		return new FacebookPage(driver);
	}
}
