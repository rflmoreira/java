package introducao;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

public class ex8 {

	public static void main(String[] args) {
		
	double custoAoConsumidor, custoDeFabrica; 
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Qual o valor de fabrica do veículo? ");
	custoDeFabrica=ler.nextDouble();
	
	double imposto= custoDeFabrica*0.45;
	double perDistribuidor= custoDeFabrica*0.28;
	
	custoAoConsumidor= custoDeFabrica+imposto+perDistribuidor;
	
	System.out.println("O custo total deste veículo será de: "
			+custoAoConsumidor + " reais.");
	

	}

}
