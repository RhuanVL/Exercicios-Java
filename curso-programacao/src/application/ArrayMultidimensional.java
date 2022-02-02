package application;

import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		Random random = new Random(); //classe para gerar n�meros multidimensional
		
		int[][] M = new int[4][4]; //declara��o de uma matriz multimensional
		
		int menor = Integer.MIN_VALUE; //vari�vel que guarda o menor valor
		int linha = 0, coluna = 0; //posi��o inicial da linha e da coluna
		
		//para: vari�vel i = 0, at� i menor que o tamanho da matriz (array multimencional), acrescentamos 1 ao valor de i a cada loop. 
		for(int i = 0; i < M.length; i++) { //navegando na matriz
			//para: vari�vel j = 0, at� i menor que o tamanho da linha, acrescentamos 1 ao valor de i a cada loop.
			for(int j = 0; j < M[i].length; j++) { //navegando na linha (array unimensional)
				M[i][j] = random.nextInt(9); //atribuindo um n�mero aleat�riamente a posi��o do elemento.
				
				if(M[i][j] < menor) {
					menor = M[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		System.out.println("Menor: " + menor);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
		
		System.out.println("\nMatriz");
		for(int[] linhaM : M) {
			for(int colunaM : linhaM) {
				System.out.println(colunaM + " ");
			}
			System.out.println();
		}
	}

}
