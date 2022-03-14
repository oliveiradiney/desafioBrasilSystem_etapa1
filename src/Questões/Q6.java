package Questões;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.println("Digite um numero para contagem regressiva: ");
		Scanner input = new Scanner(System.in);
		int cont = input.nextInt();
		for(int i=cont; i>=0; i--) {
			System.out.println(cont--);
		}
		System.out.println("KABUM");
	}
}
