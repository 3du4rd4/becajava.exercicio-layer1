package repository;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoRepository {
public List<Produto> Lista = new ArrayList<Produto>();
	
	
public Produto GetProduto(int indice) {
	
	Produto produto = new Produto();	
	produto.Nome = "Camarão";
	produto.Valor = 150;
	produto.Validade = "26/10/2020";
	Lista.add(produto);
	
	produto = new Produto();
	produto.Nome = "Tilapia";
	produto.Valor = 89;
	produto.Validade ="30/10/2020";
	Lista.add(produto);
	
	produto = new Produto();	
	produto.Nome = "Merluza";
	produto.Valor = 150;
	produto.Validade = "26/10/2020";
	Lista.add(produto);
	
	produto = new Produto();
	produto.Nome = "ovas de salmão";
	produto.Valor = 200;
	produto.Validade ="30/10/2020";
	Lista.add(produto);
	
	produto = new Produto();	
	produto.Nome = "Traira";
	produto.Valor = 75;
	produto.Validade = "26/10/2020";
	Lista.add(produto);
	
			
	
	return Lista.get(indice);
}


public void SetProduto(Produto produto) {
	Lista.add(produto);
}
}