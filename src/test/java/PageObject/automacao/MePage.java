package PageObject.automacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MePage extends PaginaBase{

	public MePage(WebDriver driver) {
	super(driver);
}
	
	public MePage clicarMoreDataAbout() {
		driver.findElement(By.linkText("MORE DATA ABOUT YOU"));
		
		return this;
	}
	
}
