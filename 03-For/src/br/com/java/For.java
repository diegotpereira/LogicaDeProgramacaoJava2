package br.com.java;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fazer um programa que lê um valor inteiro
		// N e depois N números inteiros
		// Ao final, mostra a soma dos N números lidos
		Scanner teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		int soma = 0;
		
		for(int i = 0; i < N; i++) {
			
			int x = teclado.nextInt();
			
			soma = soma + x;
		}
		
		
		System.out.println(soma);
		
		teclado.close();

	}

}
