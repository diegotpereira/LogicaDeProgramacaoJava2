package br.com.java;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Quantas horas? ");
		hora = teclado.nextInt();
		
		if (hora < 12) {
			
			System.out.println("Bom dia");
			
		} else if (hora < 18) {
			
			System.out.println("Boa tarde");
			
		} else {
			
			System.out.println("Boa noite");
		}
		
		teclado.close();
	}

}
