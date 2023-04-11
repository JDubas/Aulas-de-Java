package br.com.fiap.bicicleta.view;

import br.com.fiap.bicicleta.model.Bicicleta;
import br.com.fiap.bicicleta.model.Fabricante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fabricante fabricante = new Fabricante("caloi","384983354891");
		Bicicleta bicicleta = new Bicicleta(27,"rapida",7.5f,fabricante);
		

//		fabricante.setNome("Caloi");
//		fabricante.setCnpj("3849839884");

//		bicicleta.setAro(27);
//		bicicleta.setModelo("Rapida");
//		bicicleta.setPeso(7.5f);
//		bicicleta.setFabricante(fabricante);

		System.out.println(bicicleta.retornarDetalhes());

	}

}
