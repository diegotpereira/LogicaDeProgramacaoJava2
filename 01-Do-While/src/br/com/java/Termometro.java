package br.com.java;

import java.util.Locale;
import java.util.Scanner;

public class Termometro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROBLEMA
		// Fazer um programa para ler uma temperatura
		// em Celsius e mostrar o equivalente em Fahrenheit.
		// Perguntar se o usuário dejeja repetir(s/n).
		// Caso o usuário digite "s", repetir o programa.
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		char resp;
		
		do {
			
			System.out.print("Digite a temperatura em Celsius: ");
			double C = teclado.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = teclado.next().charAt(0);
			
		} while(resp != 'n');
		
		teclado.close();
	}

}
