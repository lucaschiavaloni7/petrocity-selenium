package clicando;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAlura {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/dev/workspaces/workspaceselenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.br/");
		
		WebElement campoDePesquisa = driver.findElement(By.name("q"));
		campoDePesquisa.sendKeys("login alura");
		
		campoDePesquisa.submit();
		
		Thread.sleep(1000);
		
		WebElement botao = driver.findElement(By.className("LC20lb"));
		botao.click();
		
		WebElement login = driver.findElement(By.name("username"));
		login.sendKeys("lucaschiavaloni@gmail.com", Keys.TAB, "19001220");
		
			
		
		//WebElement senha = driver.findElement(By.name("password"));
		//send("digite sua senha");
		
		Thread.sleep(1000);
		
		WebElement botao1 = driver.findElement(By.className("btn-login"));
		botao1.click();
		
		Thread.sleep(5000);
		
		WebElement botao2 = driver.findElement(By.className("content-menu-title"));
		botao2.click();
		
		WebElement botao3 = driver.findElement(By.className("header-nav-link"));
		botao3.click();
		
		Thread.sleep(5000);

		WebElement botao4 = driver.findElement(By.className("formacao__title"));
		botao4.click();
	}

}
