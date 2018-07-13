package br.com.facebook.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	
	public void digitarUsuario(String username) {
	    driver.findElement(By.id("email")).sendKeys(username);
	   
	      
		}
	
	
	
	public void digitarSenha(String senha) {

		driver.findElement(By.id("pass")).sendKeys(senha);
	
		
	}

		
	
	public void fazerLogin(String username,String password) {
		digitarUsuario(username);
		digitarSenha(password);
		
				
	}
	
	

	public FacebookPage clicarLogar() {
	    driver.findElement(By.id("loginbutton")).click();
	    String nome = driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[1]/div[1]/div/a/span/span")).getText();
	    assertTrue(nome.contains ("Bruno"));
		return new FacebookPage(driver);
}
	
	
}
