package repeticao;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
1-n�mero de pessoas calmas;
2-n�mero de mulheres nervosas;
3-n�mero de homens agressivos;
4-n�mero de outros calmos;
5-n�mero de pessoas nervosas com mais de 40 anos;
6-n�mero de pessoas calmas com menos de 18 anos.*/

import java.util.*;

public class ex4 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int idadePessoas, sexoPessoas, opcoes, numDados = 1; 
		int pessoaCalma = 0, mulherNervosa = 0, homemAgressivo = 0, outrosCalmos = 0, pessoaCalmaMenor = 0, pessoaNervosaMaior = 0;
		
		System.out.println("Qual sua idade? ");
		idadePessoas = ler.nextInt();
		System.out.println("Qual seu sexo? \n1-Feminino \n2-Masculino e \n3-Outros");
		sexoPessoas = ler.nextInt();
		System.out.println("Como voc� est� hoje? \n1-Calmo; \n2-Nervoso; \n3-Agressivo");
		opcoes = ler.nextInt();
		
		while(numDados < 150){
			if (opcoes == 1) {
				pessoaCalma++;
			}
			if(opcoes == 2 && sexoPessoas == 1) {
				mulherNervosa++;
			}
			if (opcoes == 3 && sexoPessoas == 2) {
				homemAgressivo++;
			}
			if (opcoes == 1 && sexoPessoas == 3) {
				outrosCalmos++;
			}
			if (opcoes == 2 && idadePessoas > 40) {
				pessoaNervosaMaior++;
			}
			if (opcoes == 1 && idadePessoas < 18) {
				pessoaCalmaMenor++;
			}			
			System.out.println("Qual sua idade? ");
			idadePessoas = ler.nextInt();
			System.out.println("Qual seu sexo? \n1-Feminino \n2-Masculino e \n3-Outros");
			sexoPessoas = ler.nextInt();
			System.out.println("Como voc� est� hoje? \n1-Calmo; \n2-Nervoso; \n3-Agressivo");
			opcoes = ler.nextInt();
			numDados++;
			
		}
		System.out.println("O n�mero de pessoas calmas �: " + pessoaCalma);
		System.out.println("O n�mero de mulheres nervosas �: " + mulherNervosa);
		System.out.println("O n�mero de homens agressivos �: " + homemAgressivo);
		System.out.println("O n�mero de outros calmos �: " + outrosCalmos);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + pessoaNervosaMaior);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + pessoaCalmaMenor);
	}
}
