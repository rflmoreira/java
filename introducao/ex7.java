package introducao;

import java.util.Scanner;

//Um sistema de equa��es lineares

public class ex7 {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		a=ler.nextInt();
		System.out.println("Digite um n�mero: ");
		b=ler.nextInt();
		System.out.println("Digite um n�mero: ");
		c=ler.nextInt();
		System.out.println("Digite um n�mero: ");
		d=ler.nextInt();
		System.out.println("Digite um n�mero: ");
		e=ler.nextInt();
		System.out.println("Digite um n�mero: ");
		f=ler.nextInt();
		
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("Valor x: " + x + "\nValor de y: "+y);
	}

}
