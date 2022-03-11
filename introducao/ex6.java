package introducao;

import java.util.Scanner;

/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.*/

public class ex6 {
	
	public static void main(String[] args) {
		
		int x1, x2, y1, y2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Atribua um valor para x1: ");
		x1=ler.nextInt();
		System.out.println("Atribua um valor para y1: ");
		y1=ler.nextInt();
		System.out.println("Atribua um valor para x2: ");
		x2=ler.nextInt();
		System.out.println("Atribua um valor para y2: ");
		y2=ler.nextInt();
		
		int sub1= x2-x1;
		int sub2= y2-y1;
		
		double pot1= Math.pow(sub1, 2);
		double pot2= Math.pow(sub2, 2);
		
		double d= Math.sqrt(pot1+pot2);
		
		System.out.println("Seu resultado é:  "+d);
		
		ler.close();
		
	}
}
