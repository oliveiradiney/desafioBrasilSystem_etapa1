package Questões;


import java.util.Scanner;

/*Faça o somatório da sua data de nascimento. */
public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento:");
		String dt_nasc = input.nextLine();
		
		//formatar a barra 
		String formatar = dt_nasc.replaceAll("/", "");
		String vetor[] = formatar.split("");
		
		int somatorio=0;
		
		for(int i=0; i<vetor.length;i++) {
			somatorio = somatorio+Integer.parseInt(vetor[i]);
	    		System.out.print(i<vetor.length - 1? vetor[i] + " + " : vetor[i] + "");
		}
		System.out.print(" = " + somatorio);
	}
}

