package teste;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Projeto {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Vituuuu\\Desktop\\JavaSelenium\\oedgedriver\\msedgedriver.exe");
		
		WebDriver navegador = new EdgeDriver();
		navegador.get("https://www.magazineluiza.com.br");
		navegador.manage().window().maximize();
				
		WebElement caixaDeBusca = navegador.findElement(By.id("input-search"));
		caixaDeBusca.click();
		caixaDeBusca.sendKeys("Relógio");
		
		WebElement botaoBusca = navegador.findElement(By.id("input-search"));
		botaoBusca.sendKeys(Keys.ENTER);

	}

}
