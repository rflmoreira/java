package condicional;

/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
categoria ela se encontra:*/

	import java.util.*;
public class ex3 {
		public static void main (String arg[])
		{
			Scanner ler = new Scanner (System.in);
			int idade;
			System.out.printf("Digite a sua idade: ");
			
			idade = ler.nextInt();
			
			if(idade>10 && idade<14) 
			{
				System.out.println("Voc� est� na categoria Infantil.");
			}
			else if (idade>15 && idade<17) 
			{
				System.out.println("Voc� est� na categoria Juvenil.");
			}
			else if (idade>18 && idade<25) 
			{
				System.out.println("Voc� est� na categoria Adulto.");
			}
			else 
			{
				System.out.println("Sua idade n�o � v�lida.");
			}
		}
}