package repeticao;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

import java.util.*;

public class ex3 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, idadeMenor = 0, idadeMaior = 0; 
		
		while(idade!= -99){
			if(idade < 21) {
				idadeMenor++;
			}
			if(idade > 50) {
				idadeMaior++;
			}
			System.out.println("\nQual sua idade? - para sair digite -99 ");
			idade = ler.nextInt();
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", idadeMenor);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", idadeMaior);
	}
}
