package br.com.fiap.padaria.model;

public class Produtos {
	private int id, quantidade;
	
	private String nome;
	
	private double precoCusto;

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
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}


	
}
