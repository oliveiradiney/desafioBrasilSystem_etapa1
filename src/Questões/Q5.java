package Quest�es;

import java.util.Scanner;

//Leia um n�mero inteiro que representa um c�digo de DDD para discagem interurbana. 
//Em seguida, informe � qual cidade o DDD pertence
public class Q5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ddd;
		System.out.println("Digite o DDD");
		ddd = input.nextInt();
		
		switch (ddd) {
			 case 61:
			     System.out.println("Bras�lia.");
			     break;
			 case 71:
			     System.out.println("Salvador.");
			     break;
			 case 11:
			     System.out.println("S�o Paulo.");
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
			     System.out.println("C�digo de DDD n�o cadastrado.");
			     break;
			 }
		}
	}


