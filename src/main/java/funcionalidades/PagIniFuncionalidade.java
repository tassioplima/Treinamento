package funcionalidades;

import org.openqa.selenium.WebDriver;

import pageobjects.PagInicial;
import util.Navegation;

public class PagIniFuncionalidade {
	private WebDriver driver;
	private PagInicial pagInicial;
	private String url = "http://www.olx.com.br/";

	public PagIniFuncionalidade() {
		driver = Navegation.getChromeDriver();
		pagInicial = new PagInicial(driver);
	}

	public void goToLogin() {
		driver.get(url);
	}

	public boolean isPaginaInicial() {
		if (pagInicial.getUrl().contains("olx"))
			return true;
		return false;
	}
	
	public void selecionarEstadoOlx(String estado){
		try{
			pagInicial.clickSelecionaEstado(pagInicial.getSelecionaEstado(estado));
		}catch(Exception e){
			System.out.println(e.getMessage());
			driver.quit();			
		}
	}
	
}
