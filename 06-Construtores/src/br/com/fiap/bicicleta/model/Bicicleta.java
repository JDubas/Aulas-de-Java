package br.com.fiap.bicicleta.model;

public class Bicicleta {

	private int aro;
	private String modelo;
	private float peso;
	private Fabricante fabricante;
	
	
	
	public Bicicleta(int aro, String modelo, float peso, Fabricante fabricante) {
		this.aro = aro;
		this.modelo = modelo;
		this.peso = peso;
		this.fabricante = fabricante;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int ano) {
		this.aro = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public String retornarDetalhes() {

		String retorno = "aro: " + aro + " modelo: " + modelo + " peso: " + peso + " Fabricante: " + fabricante.getNome() + " " + fabricante.getCnpj();

		return retorno;
	}

}
