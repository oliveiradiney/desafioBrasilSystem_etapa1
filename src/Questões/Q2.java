package Questões;

import java.util.Scanner;


/*Escreva um algoritmo que aceita uma string e retorne os caracteres na ordem inversa*/


public class Q2 {
	public static  void inverte(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("Digite uma palavra: ");
		str = input.nextLine();
		inverte(str);
	}	
}
