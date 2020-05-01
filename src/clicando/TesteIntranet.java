package clicando;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteIntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/dev/workspaces/workspaceselenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.br/");
		
		WebElement campoDePesquisa = driver.findElement(By.name("q"));
		campoDePesquisa.sendKeys("magna intranet");
		
		campoDePesquisa.submit();
		
		WebElement botao = driver.findElement(By.className("LC20lb"));
		botao.click();
	
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.name("wps.portlets.userid"));
		login.sendKeys("E-mail");
		
		Thread.sleep(1000);		
		
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("Senha");
		
		WebElement botao3 = driver.findElement(By.className("wploginButtonLogin"));
		botao3.click();
		
		Thread.sleep(1000);
		
		WebElement botao4 = driver.findElement(By.className("icon_email"));
		botao4.click();
		
		Thread.sleep(10000);
		
		WebElement botao5 = driver.findElement(By.className("s-outline-text"));
		botao5.click();
		
		Thread.sleep(7000);
		
		WebElement botao6 = driver.findElement(By.className("T-I"));
		botao6.click();
	}


}





