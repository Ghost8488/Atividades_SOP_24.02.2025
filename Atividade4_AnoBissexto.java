package atividades_24_02_2025;

import java.util.Scanner;

public class Atividade4_AnoBissexto {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		int Ano;
		
		System.out.println("Olá, esse programa serve para verificaer se um ano é ou não um ano bissexto.");
		System.out.println("Dito isso, me diga um ano para ser verificado: ");
		  Ano = stdin.nextInt();
		  
		  if (Ano%400 == 0) {
			  System.out.println("O ano é bissexto!");  }
		  else if (Ano%4 == 0 && Ano%100 != 0) {
			  System.out.println("O ano é bissexto!");  }
		  else {
			  System.out.println("O ano não é bissexto!");  }
		  
		  stdin.close();
		
	}

}
