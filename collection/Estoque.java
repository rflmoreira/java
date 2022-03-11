package collection;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
		public static void main(String[] args) {
			
			List<String> itens = new ArrayList<>();//Criação da lista
			//Adiciona a lista
			itens.add("computador");               
	        itens.add("mouse");
	        itens.add("teclado");
	        itens.add("fone");
	        itens.add("webcam");

	        itens.remove(2);               //Remove da lista
	        itens.add(2, "monitor");      //Atualiza a lista
	        System.out.println(itens);   //Apresenta a lista completa
		}
}
