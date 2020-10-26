package layer;

import java.util.Scanner;

import model.Produto;
import service.ProdutoService;

public class Main {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	ProdutoService produtoService = new ProdutoService();
	System.out.println("Digite a posição do produto:");	
	Produto produto = produtoService.GetProduto(leitor.nextInt());	
	System.out.println("Produto " + produto.Nome + " Valor com reajuste: " + produto.valorAtualizado);
	
	leitor.close();
	
	}
	
	
		
}
