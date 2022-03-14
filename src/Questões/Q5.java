package Questões;

import java.util.Scanner;

//Leia um número inteiro que representa um código de DDD para discagem interurbana. 
//Em seguida, informe à qual cidade o DDD pertence
public class Q5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ddd;
		System.out.println("Digite o DDD");
		ddd = input.nextInt();
		
		switch (ddd) {
			 case 61:
			     System.out.println("Brasília.");
			     break;
			 case 71:
			     System.out.println("Salvador.");
			     break;
			 case 11:
			     System.out.println("São Paulo.");
			     break;
			 case 21:
			     System.out.println("Rio de Janeiro.");
			     break;
			 case 32:
			     System.out.println("Juiz de Fora.");
			     break;
			 case 19:
			     System.out.println("Campinas");
			     break;
			 default:
			     System.out.println("Código de DDD não cadastrado.");
			     break;
			 }
		}
	}


