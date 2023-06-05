package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1,"Henrique Kriguer","henriquekriguer@gmail.com" );
		Pessoa p2 = new Pessoa(2,"Simone de Castro","simone@uol.com.br");
		Pessoa p3 = new Pessoa(3,"Francisco José", "franca@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
