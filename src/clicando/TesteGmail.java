package clicando;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/dev/workspaces/workspaceselenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.br/");
		
		WebElement campoDePesquisa = driver.findElement(By.name("q"));
		campoDePesquisa.sendKeys("fazer login nas contas do google");
		
		campoDePesquisa.submit();
		
		WebElement botao = driver.findElement(By.className("LC20lb"));
		botao.click();
		
		WebElement botao1 = driver.findElement(By.className("gb_1"));
		botao1.click();
		
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.name("identifier"));
		login.sendKeys("E-mail");
		
		WebElement botao2 = driver.findElement(By.className("RveJvd"));
		botao2.sendKeys(Keys.TAB);
		botao2.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);		
		
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("Senha");
		
		WebElement botao3 = driver.findElement(By.className("RveJvd"));
		botao3.click();
		
		Thread.sleep(1000);
		
		WebElement botao4 = driver.findElement(By.className("gb_We"));
		botao4.click();
		
		Thread.sleep(1000);
		
		WebElement botao5 = driver.findElement(By.className("gb_m"));
		botao5.click();
		
	}


}
