package introducao;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/

public class ex8 {

	public static void main(String[] args) {
		
	double custoAoConsumidor, custoDeFabrica; 
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Qual o valor de fabrica do ve�culo? ");
	custoDeFabrica=ler.nextDouble();
	
	double imposto= custoDeFabrica*0.45;
	double perDistribuidor= custoDeFabrica*0.28;
	
	custoAoConsumidor= custoDeFabrica+imposto+perDistribuidor;
	
	System.out.println("O custo total deste ve�culo ser� de: "
			+custoAoConsumidor + " reais.");
	

	}

}
