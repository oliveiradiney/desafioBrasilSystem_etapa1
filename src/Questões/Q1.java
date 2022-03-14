package Questões;

import java.util.Scanner;


/*Crie um algoritmo que receba o nome como entrada e nós dê como saída o nome digitado e o comprimento do mesmo. */

public class Q1 {

;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome: ");
		nome = scanner.next();
		System.out.print(nome + " " + nome.length() + " caracteres" );
		
	}

}
