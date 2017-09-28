package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import funcionalidades.PagIniFuncionalidade;

public class PagIniStep {
	static PagIniFuncionalidade pagIniFuncionalidade = new PagIniFuncionalidade();

	@Dado("^que estou na pagina inicial$")
	public void queEstouNaPaginaInicial() throws Throwable {
		pagIniFuncionalidade.goToLogin();
	}

	@Entao("^e exibida o site OLX$")
	public void eExibidaOSiteOLX() throws Throwable {
		pagIniFuncionalidade.isPaginaInicial();
	}
}
