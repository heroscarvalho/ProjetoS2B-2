package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class VoltarAppObject {
	private WebDriver driver;
	
	public VoltarAppObject(WebDriver driver) {
		
		this.driver = driver;
}

	//MAPEANDO
	
	public WebElement getCNPJTextField(){             
		return this.driver.findElement(By.id("cnpjJ"));	

	}
	

	public WebElement getCodigoDeAcessoTextField() {
		return this.driver.findElement(By.id("senha"));		
	}
		
	public WebElement getAcessarButton() {
		//return this.driver.findElement(By.className("btn btn-success")); 
		
		//USAR O CODIGO DE CIMA OU ENTÃO USAR O XPATH, IGUAL EXEMPLO A BAIXO
		
		return this.driver.findElement(By.xpath("//*[@id=\"formLogin\"]/div[2]/div[8]/a"));
	
	}
	
	public WebElement getExtratoDoPeriodoButton() {
		return this.driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[4]/a"));
	}
	
	public WebElement getClickEscolhaSeuExtratoButton() {
		return this.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div[2]/input"));
		
	}
	public WebElement getClickExtratoButton() {
		return this.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/form/div[15]/input[1]"));
	}
	
	public WebElement getClickDetalheDaGuiaButton() {
		return this.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/a/img"));
	}
	
	public WebElement getClickVoltarButton() {
		return this.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/h1[2]/a"));
	}
}
