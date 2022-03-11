package repeticao;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

import java.util.*;

public class ex2 {
	public static void main (String [] args)
	{
		Scanner ler = new Scanner(System.in);
		int n, numPar = 0, numImpar = 0; 
		
		for (n=0; n<=10; n++) {
			System.out.println("Insira 10 números inteiros: ");
			n = ler.nextInt();
			
			if(n % 2 ==0) {
				numPar++;
			}
			
			if(n % 2 == 1) {
				numImpar++;
			}			
		}
		System.out.println("Foram digitados " + numPar + " números pares e " + numImpar + " número ímpares");
		
	}
}
