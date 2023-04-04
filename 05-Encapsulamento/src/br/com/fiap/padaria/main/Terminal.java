package br.com.fiap.padaria.main;
import br.com.fiap.padaria.model.Produtos;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produtos produto = new Produtos();
	
		produto.setId(5);
		produto.setNome("Livro de Java");
		produto.setPrecoCusto(50);
		produto.setPrecoVenda(150);
		
		
		System.out.println(produto.getId());
		System.out.println(produto.getNome());
		System.out.println(produto.getPrecoCusto());
		System.out.println(produto.getPrecoVenda());

		//			  (º º)
		//			  \ | /
		//			   \|/
		//				|
		//				|
		//			   / \
		//		      /   \
		//	--------------------------------			  
		//produto.calcularLucro(); 
	}

}
