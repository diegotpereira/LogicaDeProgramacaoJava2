package br.com.java;

import java.util.Scanner;

public class DiaAtual {

	public static void main(String[] args) {
		// Fazer um programa para ler um valor 
		// inteiro de 1 a 7 representando um
		// dia da semana (sendo 1 = domingo,
		// 2 = segunda, e assim por diante).
		// Escrever na tela o dia da semana 
		// correspondente.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para x: ");
		int x = teclado.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
			
		case 2:
			dia = "segunda";		
			break;
		
		case 3:
			dia = "terça";
			break;
		
			
		case 4:
			dia = "quarta";
			break;
		
			
		case 5:
			dia = "quinta";
			break;
		
			
		case 6:
			dia = "sexta";
			break;
		
			
		case 7:
			dia = "sábado";
			break;


		default:
			dia = "valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		teclado.close();
	}

}
