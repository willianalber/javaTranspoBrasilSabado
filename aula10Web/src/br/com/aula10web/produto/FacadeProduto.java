package br.com.aula10web.produto;

import java.util.List;

//Classe controladora

public class FacadeProduto {
	
	private RepositorioProduto repositorio = new RepositorioProduto();

	public List<Produto> carregarProdutos() {
		
		return repositorio.buscarTodos();
	}
	

}
