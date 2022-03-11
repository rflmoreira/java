package introducao;

import java.util.Scanner;

/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/

public class ex4 {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		a=ler.nextInt();
		System.out.println("Digite um número: ");
		b=ler.nextInt();
		System.out.println("Digite um número: ");
		c=ler.nextInt();
		
		if(a>0 && b>0 && c>0) {
			
			double r= Math.pow(a+b, 2);
			double s= Math.pow(b+c, 2);
			double d= (r+s)/2;
			
			System.out.println("O valor de R foi: "+ r + "\nO valor de S foi: "
			+ s + "\nO valor de D foi: " + d);
		}else {
			System.out.println("Digite apenas números positivos"); 
		}
		
		ler.close();
		
	}

}
