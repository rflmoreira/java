package condicional;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

	import java.util.*;
public class ex4 {
	public static void main(String[] args) {
		int numero1;
		double raiz, potencia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		numero1 = ler.nextInt();
		
		if(numero1%2 == 0) {
			raiz = Math.sqrt(numero1);
			System.out.println("O número inserido é par. Sua raiz é: " + raiz);
		}else {
			potencia = Math.pow(numero1, 2);
			System.out.println("O número inserido é ímpar. Sua potência é: " + potencia);
		}
		
		ler.close();
	}
}