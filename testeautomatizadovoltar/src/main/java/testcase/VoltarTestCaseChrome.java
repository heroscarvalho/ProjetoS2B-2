package testcase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import tasks.VoltarTaskChrome;


public class VoltarTestCaseChrome {
	private WebDriver driver;
	private VoltarTaskChrome voltar;
	
	
	
	@Before
	public void SetUp() {	
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.grupogreencard.com.br/sysweb/site/loginEstabelecimento");
		this.voltar = new VoltarTaskChrome(driver);	
	}
	
	@Test
	public void testMain() {
		this.voltar.PreencherLogin("20474874000198", "10dhsp");
		this.voltar.Logar();
		this.voltar.ExtratoDoPeriodo();
		this.voltar.ClickEscolhaSeuExtrato();
		this.voltar.ClickExtrato();
		this.voltar.ClickDetalheDaGuia();
		this.voltar.ClickVoltar();
	}	
	

	@After
	public void tearDown() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.driver.quit();
		
	}
	
}