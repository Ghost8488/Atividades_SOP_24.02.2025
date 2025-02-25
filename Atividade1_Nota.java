package atividades_24_02_2025;

import java.util.Scanner;

public class Atividade1_Nota {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		Double Nota;
		
		 System.out.println("Olá, esse programa irá te dizer se você foi ou não aprovado.");
		 System.out.println("Para isso preciso que você me informe sua nota: ");
		 Nota = stdin.nextDouble();
		 
		  if (Nota >=7) {
			  System.out.println("Prabéns, você foi aprovado!");  
		  }
		  
		  else if (Nota <7) {
			  System.out.println("Lamento, você foi reprovado");
		  }
			  
		  stdin.close();

	}

}
