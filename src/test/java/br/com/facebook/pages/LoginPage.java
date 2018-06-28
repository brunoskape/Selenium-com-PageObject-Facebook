package br.com.facebook.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	
	public LoginPage digitarUsuario(String username) {
	    driver.findElement(By.id("email")).sendKeys(username);
	   
	    return this;  
		}
	
	
	
	public LoginPage digitarSenha(String senha) {

		driver.findElement(By.id("pass")).sendKeys(senha);
	
		return this;
	}

	
	
	
	public FacebookPage fazerLogin(String username,String password) {
		digitarUsuario(username);
		digitarSenha(password);
		
		
		return new FacebookPage(driver);
	}
}
