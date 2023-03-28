package br.com.fiap.padaria.model;

public class Produtos {

	int id, quantidade;
	
	String nome;
	
	double precoCusto;

	private double precoVenda;
	
	
	
	
	
	double calcularLucro() {
		double lucro =  precoVenda - precoCusto;
		return lucro;
	}
	
	
	
	
	void atualizarEstoque(int qtd) {
		if (qtd > 0) {
			quantidade += qtd;
		}else {
			quantidade -= qtd;
		}
		
		
	}



	
}
