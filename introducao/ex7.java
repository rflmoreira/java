package introducao;

import java.util.Scanner;

//Um sistema de equações lineares

public class ex7 {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		a=ler.nextInt();
		System.out.println("Digite um número: ");
		b=ler.nextInt();
		System.out.println("Digite um número: ");
		c=ler.nextInt();
		System.out.println("Digite um número: ");
		d=ler.nextInt();
		System.out.println("Digite um número: ");
		e=ler.nextInt();
		System.out.println("Digite um número: ");
		f=ler.nextInt();
		
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("Valor x: " + x + "\nValor de y: "+y);
	}

}
