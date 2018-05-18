package br.com.facebook;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage extends BasePage{

	public FacebookPage(WebDriver driver) {
		super(driver);
		
	}
	

	public FacebookPage clicarLogar() {
	    driver.findElement(By.id("loginbutton")).click();
	    String nome = driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[1]/div[1]/div/a/span/span")).getText();
	    assertTrue(nome.contains ("Testefacecia"));
		return this;
}

	public FacebookPage pesquisar() {
		
		driver.findElement(By.className("_1frb")).sendKeys("esporte interativo");
		driver.findElement(By.xpath("//li[@id='js_2o']/div/a/div[2]")).click();
		
		return this;
		
	}
			
			
	
}
