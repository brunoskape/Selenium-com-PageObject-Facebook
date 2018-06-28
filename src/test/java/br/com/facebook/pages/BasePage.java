package br.com.facebook.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	public static WebDriver createChrome() {
		
		//Configuração driver do chrome
				System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		        //System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("http://www.facebook.com");
		
		return driver;
	}

	public BasePage(WebDriver driver) {
		this.driver = driver;
			}
	
	
}
