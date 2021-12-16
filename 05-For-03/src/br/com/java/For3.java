package br.com.java;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros X e Y. 
		// A seguir, calcule e mostre a soma
		// dos números impares entre eles;
		
		Scanner teclado = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Digite o primeiro valor: ");
		x = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		y = teclado.nextInt();
		
		int min, max;
		
		if (x < y) {
			
			min = x;
			max = y;
			
		} else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		
		for(int i = min + 1; i < max; i++) {
			
			if (i % 2 != 0) {
				
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		teclado.close();
	}

}
