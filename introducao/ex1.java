package introducao;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

public class ex1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total; 


		System.out.print("Digite os ano: ");
		anos = ler.nextInt();
		
		System.out.print("Digite os mes: ");
		meses = ler.nextInt();

		System.out.print("Digite os dia: ");
		dias = ler.nextInt();
		
		total = anos * 365 + meses * 30 + dias;
		System.out.print("Idade total em dias = "+total+"\n");
		
		
	}
}
