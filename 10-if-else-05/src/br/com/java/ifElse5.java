package br.com.java;

import java.util.Locale;
import java.util.Scanner;

public class ifElse5 {

	public static void main(String[] args) {
		// Uma operadora de telefonia cobra 
		// R$ 50.00 por um plano básico que
		// dá direito 100 minutos de telefone.
		// Cada minuto que exceder a franquia 
		// de 100 minutos custa R$ 2.00. Fazer
		// um programa para ler a quantidade 
		// de minutos que uma pessoa consumiu
		// daí mostrar o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os minutos usados: ");
		int minutos = teclado.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			
			conta += (minutos - 100) * 2.0;
			
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		teclado.close();

	}

}
