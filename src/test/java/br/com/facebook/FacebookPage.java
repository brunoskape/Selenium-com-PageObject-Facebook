package br.com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage extends BasePage{

	public FacebookPage(WebDriver driver) {
		super(driver);
		
	}
	

	public FacebookPage clicarLogar() {
	    driver.findElement(By.id("loginbutton")).click();

		return this;
}

}
