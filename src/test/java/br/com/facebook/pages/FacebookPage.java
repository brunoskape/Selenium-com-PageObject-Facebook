package br.com.facebook.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FacebookPage extends BasePage{

	public FacebookPage(WebDriver driver) {
		super(driver);
		
	}
	

	public FacebookPage clicarLogar() {
	    driver.findElement(By.id("loginbutton")).click();
	    String nome = driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[1]/div[1]/div/a/span/span")).getText();
	    assertTrue(nome.contains ("Bruno"));
		return this;
}

public FacebookPage pesquisar() throws InterruptedException {

	   Thread.sleep(3000);
	   Actions action = new Actions(driver);
	   action.sendKeys(Keys.ESCAPE).build().perform();
		WebElement wb = driver.findElement(By.xpath("//div[@class=\"_li\"]//a[@class='_19eb']"));
		wb.click();
		
		return this;
}
		
		public FacebookPage abreCriarPublicacao() throws InterruptedException {		
	
		Thread.sleep(3000);
		WebElement envitest = driver.findElement(By.xpath(".//*[text()[contains(.,\"Criar publicação\")]]"));
		envitest.click();
		Thread.sleep(3000);
		
		return this;
}
		public FacebookPage inserirPublicacao() throws InterruptedException {	
			
		Actions actions1 = new Actions(driver);
		actions1.moveToElement (driver.findElement(By.xpath("//div[@class=\'_5rpb\']/div[1]/div")));
		actions1.click();
		actions1.sendKeys("Teste Automatizado");
		actions1.build().perform();
		
		WebElement publicar = driver.findElement(By.xpath("//div[@class='_45wg _69yt']"));
		publicar.click();
		
		
		
			
	/*	driver.findElement(By.className("_1frb")).sendKeys("Bruno Rodrigues");
		Thread.sleep(500);
		driver.findElement(By.className("_1frb")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		

		
		
		WebElement test = driver.findElement(By.xpath("//div[@class='_2yev']//a[contains(@href,'bbrunor')]"));
		test.click();
		*/
				
		//driver.findElement(By.xpath("//*[contains(@href,'mariianeprado')]")).click();

	//	String option = "esporte interativo";
		//String locator = "//ul[@id='facebar_typeahead_view_list']" + "/li[contains(normalize-space(.), '" + option
				//+ "')]";

		//driver.findElement(By.xpath(locator)).click();

		
		return this;
		
	}
			
			
	
}
