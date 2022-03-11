package introducao;

import java.util.Scanner;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class ex3 {
	
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int segundos, minutos, horas, totalSegundos, sobraHoras, sobraMinutos;
		System.out.print("Calcular Tempo de Evento");
		System.out.print("\nInforme o tempo em segundos: ");
		totalSegundos = ler.nextInt();
		
		horas= totalSegundos/3600;
		sobraHoras= totalSegundos - (horas * 3600);
		minutos= sobraHoras/60;
		segundos= sobraHoras - (minutos * 60);
		
		System.out.println("Tempo do Evento: " + horas + "h" + minutos + "min" + segundos + "seg");
		
	}

}
