package br.com.facebook.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableBiMap.Builder;

public class FacebookPage extends BasePage{

	
   Actions action = new Actions(driver);
   WebDriverWait wait = new WebDriverWait(driver, 10);
		
	
	public FacebookPage(WebDriver driver) {
		super(driver);
		
	}
	


	public void acessarPaginaInicial() throws InterruptedException {

	   Thread.sleep(3000);
	   
	   action.sendKeys(Keys.ESCAPE).build().perform();
	   WebElement campoPesquisa = driver.findElement(By.xpath("//div[@class=\"_li\"]//a[@class='_19eb']"));
	   campoPesquisa.click();
		
	   
}
		
	public void abreCriarPublicacao() throws InterruptedException {		
	
		Thread.sleep(3000);
		WebElement envitest = driver.findElement(By.xpath(".//*[text()[contains(.,\"Criar publicação\")]]"));
		envitest.click();
		Thread.sleep(3000);
				
}
		
	public void pesquisar() throws InterruptedException {	
		driver.findElement(By.className("_1frb")).sendKeys("Bruno Rodrigues");
		Thread.sleep(500);
		driver.findElement(By.className("_1frb")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		
		}
	
	public void entrarNoPerfilDeOutro() throws InterruptedException {	
		
		//Actions actions2 = new Actions(driver);
	
				
		action.click(driver.findElement(By.xpath("//*[@id=\'xt_uniq_3\']/div/div[1]/a"))).build().perform();
		WebElement clickPerfil = driver.findElement(By.linkText("Bruno Rodrigues"));
		clickPerfil.click();
	
		String nome = clickPerfil.getText();
	
		assertTrue(nome.contains ("Bruno"));
	
				
		}
	
		
	public void inserirPublicacaoProprioPerfil() throws InterruptedException {	
			
		action.moveToElement (driver.findElement(By.xpath("//div[@class=\'_5rpb\']/div[1]/div")));
		action.click();
		action.sendKeys("Teste Automatizado");
		action.build().perform();
		
		WebElement publicar = driver.findElement(By.xpath("//div[@class='_45wg _69yt']"));
		publicar.click();
		
		String textoPublicacao = driver.findElement(By.xpath("//*[text()='Teste Automatizado']")).getText();
		assertTrue(textoPublicacao.contains("Teste Automatizado"));
		
		
	}
		
	public void inserirPublicacaoOutroPerfil() throws InterruptedException {	
		
		inserirTextoPublicacao();
		
		WebElement publicar = driver.findElement(By.xpath("//*[contains(@class,'_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft')]"));
		publicar.click();
		
		String textoPublicacao = driver.findElement(By.xpath("//*[text()='Teste Automatizado']")).getText();
		assertTrue(textoPublicacao.contains("Teste Automatizado"));
		
		
	}
	
	public void inserirTextoPublicacao() throws InterruptedException {	
		
		
		action.moveToElement (driver.findElement(By.xpath("//div[@class=\'_5rpb\']/div[1]/div")));
		action.click();
		action.sendKeys("Teste Automatizado");
		action.build().perform();
				
		
	}	
	
	public void enviarMensagemChat() throws InterruptedException{
		
		
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//div[@id=\'fbDockChatBuddylistNub\']/a")));
		
		//action.moveToElement(driver.findElement(By.xpath("//div[@class='uiToggle _50-v fbNub _rz3 _ur5']/a")));
		Thread.sleep(3000);
		action.click();
		
	
	}
	
	
}
