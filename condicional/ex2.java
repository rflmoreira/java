package condicional;

/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

	import java.util.*;
public class ex2 {
	public static void main (String[] args)
	{
		int num1, num2, num3;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		num1 = ler.nextInt();
		System.out.println("Insira um valor: ");
		num2 = ler.nextInt();
		System.out.println("Insira um valor: ");
		num3 = ler.nextInt();
		
		int ordemCrescente[] = {num1,num2,num3};
		Arrays.sort(ordemCrescente);
		
		System.out.println("A ordem crescente dos n�meros �: " + ordemCrescente[0] + " | " + ordemCrescente[1] + " | " + ordemCrescente[2]);
		
		ler.close();
	}
}