package PageObject.automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaBase {
	
	protected WebDriver driver;
	public static WebDriver createChrome() {
		
		
		//Configuração driver do chrome
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://juliodelima.com.br/taskit/");
		
		
		return driver;
		
	}
	
	public PaginaBase (WebDriver driver) {
		this.driver = driver;
		
	}
	

}
