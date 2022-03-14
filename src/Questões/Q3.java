package Questões;

import java.util.Scanner;

/*Receba uma string e imprima metade da mesma. */
public class Q3 {

	public static void main(String[] args) {
		System.out.println("Digite uma palavra");
		Scanner input = new Scanner(System.in);
		String str;
		str=input.next();
		for (int i = 0; i < (str.length() / 2) + 1; i++) {
		     System.out.print(str.charAt(i));
		}
	}

}
