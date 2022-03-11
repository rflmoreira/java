package repeticao;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

import java.util.*;

public class ex6 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0, contador = 0;
		
		do {
			System.out.println("Digite um número inteiro: ");
			num = ler.nextInt();
			if(num %3 == 0) {
				contador++;
				soma = num + soma;
			}
		}while(num > 0);
		
		System.out.println("A média dos números múltiplos de 3 é: " + soma/contador);

	}
}
