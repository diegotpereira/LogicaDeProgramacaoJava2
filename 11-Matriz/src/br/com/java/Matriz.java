package br.com.java;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// Fazer um programa para ler dois 
		// números inteiros positivos M e N,
		// depois ler uma matriz de M linhas 
		// e N colunas contendo npumeros 
		// inteiros. Em seguida, mostrar
		// na tela a matriz
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		int M = 0;
		int N = 0;
		
		System.out.println("Digite o valor de M: ");
		M = teclado.nextInt();
		
		System.out.println("Digte o valor de N: ");
		N = teclado.nextInt();
		
		int [][] mat = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			
			for(int j = 0; j < N; j++) {
				
				mat[i][j] = teclado.nextInt();
			}
		}
		
		for(int i = 0; i < M; i++) {
			
			for(int j = 0; j < N; j++) {
				
				System.out.print(mat[i][j] + " ");
			}
			
			System.out.println();
		}
		
		teclado.close();
	}

}
