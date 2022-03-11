package repeticao;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

import java.util.*;

public class ex5 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um número inteiro: ");
			num = ler.nextInt();
			if(num != 0) {
				contador++;
				soma += num;
			}
		}while(num > 0);
		System.out.println("A soma dos números inteiros é: " + soma);
	}
}
