package introducao;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

public class ex2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, total; 

		System.out.print("Digite a quantidade de dias: ");
		total = ler.nextInt();
		
		anos= total/365;
		total= total%365;
		meses= total/30;
		total= total%30;
		
		dias= total;

		System.out.print("A idade é: = "+anos+"\n");
		System.out.print("A quantidade de meses é: = "+meses+"\n");
		System.out.print("A quantidade de dias é: = "+dias+"\n");

		
		
	}

}
