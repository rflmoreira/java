package condicional;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

	import java.util.*;
public class ex4 {
	public static void main(String[] args) {
		int numero1;
		double raiz, potencia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		numero1 = ler.nextInt();
		
		if(numero1%2 == 0) {
			raiz = Math.sqrt(numero1);
			System.out.println("O n�mero inserido � par. Sua raiz �: " + raiz);
		}else {
			potencia = Math.pow(numero1, 2);
			System.out.println("O n�mero inserido � �mpar. Sua pot�ncia �: " + potencia);
		}
		
		ler.close();
	}
}