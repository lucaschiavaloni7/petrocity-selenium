package clicando;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestePetrocity {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/dev/workspaces/workspaceselenium/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://192.168.142.18/empreendimento");

		WebElement campoNome = driver.findElement(By.id("name"));

		campoNome.sendKeys("Lucas");

		Thread.sleep(1000);

		WebElement campoEmail = driver.findElement(By.id("email"));

		campoEmail.sendKeys("E-mail");

		Thread.sleep(1000);

		WebElement campoTelefone = driver.findElement(By.id("telephone"));

		campoTelefone.sendKeys("11111111111");

		Thread.sleep(1000);

		WebElement campoCpf = driver.findElement(By.id("federalRegistration"));

		Thread.sleep(1000);

		campoCpf.sendKeys("36847954796");

		Thread.sleep(1000);

		WebElement campoEstado1 = driver.findElement(By.className("ng-tns-c3-0"));
		
		campoEstado1.click();

		WebElement campoEstado2 = driver.findElement(By.className("ui-dropdown-item"));

		campoEstado2.findElement(By.xpath(
				"/html/body/app-root/app-form-interested/div/div/div/div/div[2]/p-card/div/div/div/div[5]/p-dropdown"
				+ "/div/div[5]/div/ul/p-dropdownitem[8]/li"))
				.click();

		WebElement campoCidade1 = driver.findElement(By.className("ng-tns-c3-1"));

		campoCidade1.click();

		Thread.sleep(1000);

		WebElement campoCidade2 = driver.findElement(By.className("ui-dropdown-item"));

		campoCidade2.click();

		campoCidade2.findElement(By.xpath("//*[@id=\"cities\"]/div/div[5]/div/ul/p-dropdownitem[20]/li")).click();
	
		Thread.sleep(1000);
		
		WebElement enter = driver.findElement(By.className("send-button"));

		enter.click();

	}
}
