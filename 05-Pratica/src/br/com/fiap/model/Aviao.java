package br.com.fiap.model;

public class Aviao {

	private String modelo, prefixo;
	private int quantidadeLugares, anoFabricacao, quantidadeTurbinas;
	private Cor cor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}

	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}
