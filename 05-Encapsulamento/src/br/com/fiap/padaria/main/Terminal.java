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
		
		
		System.out.println("| Id    : "+produto.getId());
		System.out.println("| Nome  : "+produto.getNome());
		System.out.println("| Custo : "+produto.getPrecoCusto());
		System.out.println("| Preco : "+produto.getPrecoVenda());

		//			  (º º)
		//			  \ | /
		//			   \|/
		//				|
		//				|
		//			   / \
		//		      /   \
		//	--------------------------------			  
		
		produto.atualizarEstoque(10);
		System.out.println("| Lucro : " + produto.calcularLucro());
		System.out.println("| Qtd   : " + produto.getQuantidade());
	}

}
