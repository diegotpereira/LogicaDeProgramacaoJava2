package br.com.java;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// Fazer um programa para ler um número
		// inteiro N e uma matriz quadrada de 
		// ordem N contendo números inteiros. 
		// Em seguida, mostrar a diagonal 
		//principal e a quantidade de valores
		// negativos da matriz.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de N: ");
		int N = teclado.nextInt();
		
		int[][] mat = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				mat[i][j] = teclado.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal:");
		for(int i = 0; i < N; i++) {
			
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		
		int cont = 0;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if (mat[i][j] < 0) {
					
					cont = cont + 1;
				}
			}
		}
		
		System.out.println("Quantidade de negativos = " + cont);
		
		teclado.close();
	}
}
