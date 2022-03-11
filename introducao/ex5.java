package introducao;

import java.util.Scanner;

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

public class ex5 {
	public static void main(String args[])
	{
		double n1, n2, n3, peso2, peso3, peso5, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1=ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2=ler.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3=ler.nextDouble();
		
		peso2 = n1 * 0.2;
		peso3 = n2 * 0.3;
		peso5 = n3 * 0.5;
		
		media = (peso2 + peso3 + peso5);
		System.out.println("Sua média foi: " + media);
		
	}

}
