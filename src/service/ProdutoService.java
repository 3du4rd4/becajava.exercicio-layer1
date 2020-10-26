package service;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoService {
	public  Produto GetProduto(int indice) {
		
		ProdutoRepository repository = new ProdutoRepository();
        Produto result = repository.GetProduto(indice);
	
        return result;
	}
	public void SetProduto(Produto produto) {
		ProdutoRepository repository = new ProdutoRepository();
		
		produto.Imposto = produto.Valor * 0.18;	
		produto.valorAtualizado =  produto.Imposto + produto.Valor;		
		
		repository.SetProduto(produto);
	}

}
	

