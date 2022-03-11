package condicional;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/

	import java.util.*;
public class ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira 3 valores: ");
		int numX = ler.nextInt();
		int numY = ler.nextInt();
		int numZ = ler.nextInt();
		int maior;
		int menor;
		
		maior = Math.max(numY, Math.max(numZ, numX));
		menor = Math.min(numY, Math.min(numZ, numX));
		
		System.out.println("O número maior é: " + maior + "\nO número menor é: " + menor);
			
	}
}