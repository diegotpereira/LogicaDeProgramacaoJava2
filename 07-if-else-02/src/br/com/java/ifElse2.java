package br.com.java;

import java.util.Locale;
import java.util.Scanner;

public class ifElse2 {

	public static void main(String[] args) {
		// Fazer um programa para ler as duas notas
		// que um aluno obteve no primeiro e segundo
		// semestres de uma disciplina anual. Em seguida,
		// mostrar a nota final que o aluno obteve no 
		// ano juntamente com texto explicatiovo. Caso
		// a nota final do aluno seja inferior a 60.00,
		// mostrar a mensagem "REPROVADO", conforme exemplos
		// Todos os valores devem ter uma casa decimal.
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		double nota1;
		double nota2;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("Nota final = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			
			System.out.println("O aluno foi reprovado!");
			 
		} else {
			
			System.out.println("O aluno foi aprovado!");
		}
	}

}
