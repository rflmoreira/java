package condicional;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

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
		
		System.out.println("O n�mero maior �: " + maior + "\nO n�mero menor �: " + menor);
			
	}
}