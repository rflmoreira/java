package repeticao;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

import java.util.*;

public class ex5 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um n�mero inteiro: ");
			num = ler.nextInt();
			if(num != 0) {
				contador++;
				soma += num;
			}
		}while(num > 0);
		System.out.println("A soma dos n�meros inteiros �: " + soma);
	}
}
