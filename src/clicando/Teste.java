package clicando;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/dev/workspaces/workspaceselenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		WebElement login = driver.findElement(By.name("identifier"));
		login.sendKeys("lucas.branco@aluno.faculdadeimpacta.com.br");
		
		WebElement botao1 = driver.findElement(By.className("RveJvd"));
		botao1.click();
		
		Thread.sleep(1000);		
		
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("19001220");
		
		WebElement botao2 = driver.findElement(By.className("RveJvd"));
		botao2.click();
	}

}
