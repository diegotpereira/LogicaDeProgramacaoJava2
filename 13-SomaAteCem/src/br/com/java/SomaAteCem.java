package br.com.java;

public class SomaAteCem {

	public static void main(String[] args) {
		// Qual é a soma de todos os números
		// de 1 até 100.
		
		int numero;
		int contador;
		
		numero = 0;
		contador = 1;
		
		while (contador <= 100) {
			
			numero = numero + contador;
			contador++;
		}
		
		System.out.println("A resposta é: " + numero);
	}
}
