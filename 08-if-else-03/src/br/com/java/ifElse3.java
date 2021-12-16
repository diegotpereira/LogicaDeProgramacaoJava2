package br.com.java;

import java.util.Locale;
import java.util.Scanner;

public class ifElse3 {

	public static void main(String[] args) {
		// Leia 3 valores de ponto flutuante e 
		// efetue o c�culo das raizes da equa��o
		// de Baskara. Se n�o for poss�vel calcular
		// as raizes, mostre a mensagem coresspondente
		// "impossivel calcular", caso haja uma divis�o 
		// por 0 ou raiz de numero negativo.
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = 0;
		teclado.nextDouble();
	    
		System.out.println("Digite o valor de b: ");
		double b = 0;
		teclado.nextDouble();
		
		System.out.println("Digite o valor de a: ");
		double c = 0;
		teclado.nextDouble();
		
		double delta;
		
		delta = b * b - 4.0 * a * c;
		
		if (a == 0.0 || delta < 0.0) {
			
			System.out.println("Imposs�vel calcular");
		} else {
			
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		teclado.close();
	}

}
