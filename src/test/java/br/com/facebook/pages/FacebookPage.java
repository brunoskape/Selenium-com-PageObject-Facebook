package br.com.facebook.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import com.google.common.collect.ImmutableBiMap.Builder;

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

	public FacebookPage acessarPaginaInicial() throws InterruptedException {

	   Thread.sleep(3000);
	   Actions action = new Actions(driver);
	   action.sendKeys(Keys.ESCAPE).build().perform();
	   WebElement campoPesquisa = driver.findElement(By.xpath("//div[@class=\"_li\"]//a[@class='_19eb']"));
	   campoPesquisa.click();
		
	   return this;
}
		
	public FacebookPage abreCriarPublicacao() throws InterruptedException {		
	
		Thread.sleep(3000);
		WebElement envitest = driver.findElement(By.xpath(".//*[text()[contains(.,\"Criar publicação\")]]"));
		envitest.click();
		Thread.sleep(3000);
		
		return this;
}
		
	public FacebookPage pesquisar() throws InterruptedException {	
		driver.findElement(By.className("_1frb")).sendKeys("Bruno Rodrigues");
		Thread.sleep(500);
		driver.findElement(By.className("_1frb")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		return this;
		
		}
	
	public FacebookPage entrarNoPerfilDeOutro() throws InterruptedException {	
		
		Actions actions2 = new Actions(driver);
		Thread.sleep(3000);
				
		actions2.click(driver.findElement(By.xpath("//*[@id=\'xt_uniq_3\']/div/div[1]/a"))).build().perform();
		WebElement clickPerfil = driver.findElement(By.linkText("Bruno Rodrigues"));
		clickPerfil.click();
	
		String nome = clickPerfil.getText();
	
		assertTrue(nome.contains ("Bruno"));
	

		
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
		
		String textoPublicacao = driver.findElement(By.xpath("//*[text()='Teste Automatizado']")).getText();
		assertTrue(textoPublicacao.contains("Teste Automatizado"));
		return this;
		
	}
			
		
}