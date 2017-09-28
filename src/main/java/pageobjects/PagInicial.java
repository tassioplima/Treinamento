package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagInicial extends Page {

	public PagInicial(WebDriver driver) {
		super(driver);
	}

	public WebElement getSelecionaEstado(String estado) {
		return getElement(".//li[a = '"+estado+"']//a");
	}
	
	public void clickSelecionaEstado(WebElement elemento) {
		elemento.click();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	

	
}
