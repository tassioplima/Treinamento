package steps;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidades.BuscarProdFuncionalidade;
import funcionalidades.PagIniFuncionalidade;

public class BuscarProdtep {
	PagIniFuncionalidade paginaInicialStep = new PagIniFuncionalidade();
	BuscarProdFuncionalidade buscandoProduto = new BuscarProdFuncionalidade();

	@Dado("^selecionar estado na area de busca$")
	public void selecionarEstadoNaAreaDeBusca(DataTable credencial) throws Throwable {
		for (Map<String, String> map : credencial.asMaps(String.class, String.class)) {
			paginaInicialStep.selecionarEstadoOlx(map.get("Estado"));
		}
	}

	@Quando("^realizar busca de um produto$")
	public void realizarBuscaDeUmProduto(DataTable credencial) throws Throwable {
		for (Map<String, String> map : credencial.asMaps(String.class, String.class)) {
			buscandoProduto.realizaBusca(map.get("Busca"));
		}
	}

	@Entao("^e apresentado resultado da busca do quinto resultado$")
	public void eApresentadoResultadoDaBusca(int quantidade) throws Throwable {
		buscandoProduto.imprimindoResultadosGrid(quantidade);
	}

	@Quando("^realizar paginacao$")
	public void realizarPaginacao(DataTable credencial) throws Throwable {
		for (Map<String, String> map : credencial.asMaps(String.class, String.class)) {
			buscandoProduto.realizaPaginacao(map.get("Pagina"));
		}
	}
}
