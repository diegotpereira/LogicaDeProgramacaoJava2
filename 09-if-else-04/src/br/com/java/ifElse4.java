package br.com.java;

import java.util.Scanner;

public class ifElse4 {

	public static void main(String[] args) {
		// Fazer um programa para ler três 
		// números inteiros. Em seguida, 
		// mostrar qual o menor dentre os 
		// três números lidos. Em caso de 
		// empate, mostrar apenas uma vez.
		
		Scanner teclado = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Digite o valor de a: ");
		a = teclado.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = teclado.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c = teclado.nextInt();
		
		if (a < b && a < c) {
			
			System.out.println("Menor = " + a);
			
		} else if (b < c) {
			
			System.out.println("Menor = " + b);
			 
		} else {
			
			System.out.println("Menor = " + c);
		}
		
		teclado.close();

	}

}
