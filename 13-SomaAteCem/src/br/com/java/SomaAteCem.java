package br.com.java;

public class SomaAteCem {

	public static void main(String[] args) {
		// Qual ? a soma de todos os n?meros
		// de 1 at? 100.
		
		int numero;
		int contador;
		
		numero = 0;
		contador = 1;
		
		while (contador <= 100) {
			
			numero = numero + contador;
			contador++;
		}
		
		System.out.println("A resposta ?: " + numero);
	}
}
