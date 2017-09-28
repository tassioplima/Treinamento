package funcionalidades;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.BuscarProdPage;
import util.Navegation;

public class BuscarProdFuncionalidade {
	WebDriver driver;
	BuscarProdPage buscarProdPage;

	public BuscarProdFuncionalidade() {
		driver = Navegation.getChromeDriver();
		buscarProdPage = new BuscarProdPage(driver);
	}

	public void realizaBusca(String produto) {
		try {
			buscarProdPage.setCampoBuscar(produto);
			buscarProdPage.clickBotaoBuscar();
			driver.wait(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void imprimindoResultadosGrid(int numeroLinha) {
		List<WebElement> listaElementos = buscarProdPage.getGridResultadosBusca();
		int cont = 1;
		System.out.println("**********Resultados da grid**********\n");
		for (WebElement webElement : listaElementos) {
			System.out.println("Titulo: " + buscarProdPage.getTituloProduto(webElement).getText() + "\n");

			WebElement precoProduto = buscarProdPage.getValorProduto(webElement);
				if (precoProduto != null) {
				System.out.println("O Valor é : " + precoProduto.getAttribute("innerText") + "\n");
			}

				if (cont == numeroLinha) {
				break;
			}
			cont++;
		}
	}

	public void realizaPaginacao(String pag) {
		try {
			buscarProdPage.clickPaginacao(pag);
			driver.wait(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
	}

}
