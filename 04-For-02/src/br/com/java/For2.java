package br.com.java;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		// Leia 1 valor inteiro N(2 < N < 1000).
		// A seguir, mostre a tabuada de N
		
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		
		for(int i = 0; i < 10; i++) {
			
			int produto = i * N;
			
			System.out.println(i + " x " + N + " = " + produto);
			
		}
		
		
		teclado.close();
	}

}
