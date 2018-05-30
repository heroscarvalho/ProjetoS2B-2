package tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import appobject.VoltarAppObject;

public class VoltarTask {
	private VoltarAppObject voltarAppObject;
	
	public VoltarTask(WebDriver driver) {
		this.voltarAppObject = new VoltarAppObject(driver);	
	}
		
	public void PreencherLogin(String cnpj, String codigodeacesso) {
		this.voltarAppObject.getCNPJTextField().sendKeys(cnpj);
		this.voltarAppObject.getCodigoDeAcessoTextField().sendKeys(codigodeacesso);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void Logar() {
		this.voltarAppObject.getAcessarButton().click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void ExtratoDoPeriodo() {
		this.voltarAppObject.getExtratoDoPeriodoButton().click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void ClickEscolhaSeuExtrato() {
		this.voltarAppObject.getClickEscolhaSeuExtratoButton().click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void ClickExtrato() {
		this.voltarAppObject.getClickExtratoButton().click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void ClickDetalheDaGuia() {
		this.voltarAppObject.getClickDetalheDaGuiaButton().click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void ClickVoltar() {
		this.voltarAppObject.getClickVoltarButton().click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}





