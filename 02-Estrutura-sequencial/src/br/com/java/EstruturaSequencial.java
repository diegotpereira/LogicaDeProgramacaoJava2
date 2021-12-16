package br.com.java;

import java.util.Locale;

public class EstruturaSequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enunciado imagem
		String produto1 = "Computador";
		String produto2 = "Mesa de escrit�rio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produto:");
		System.out.printf("%s, com pre�o de R$ %.2f%n" , produto1, preco1);
		System.out.printf("%s, com pre�o de R$ %.2f%n" , produto2, preco2);
		
		System.out.println();
		
		System.out.printf("Registro: %d anos de idade, c�digo %d e g�nero: " + genero + "%n", idade, codigo);
		
		System.out.println();
		
		System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
		System.out.printf("Em linhas (tr�s casas decimais): %.3f%n", medida);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Casa decimal dos EUA: %.3f%n", medida);
		
	}

}
