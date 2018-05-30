package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.VoltarTask;


public class VoltarTestCase {
	private WebDriver driver;
	private VoltarTask voltar;
	
	
	
	@Before
	public void SetUp() {
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();
		this.driver.get("https://www.grupogreencard.com.br/sysweb/site/loginEstabelecimento");
		this.voltar = new VoltarTask(driver);	
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
		//this.driver.quit();
		
	}
	
}