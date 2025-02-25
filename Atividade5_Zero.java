package atividades_24_02_2025;

import java.util.Scanner;

public class Atividade5_Zero {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		Double Numero;
		
		System.out.println("Este código irá classificar um número dentre três critérios, sendo positivo, negativo ou igual a zero.");
		System.out.println("Digite o número em questão.");
		Numero = stdin.nextDouble();
		
		if (Numero>0) {
			System.out.println("O número é positivo!");  }
		else if (Numero <0) {
			System.out.println("O número é negativo!");  }
		else {
		    System.out.println("O número é igual a zero!");	}
		
		stdin.close();
		
	}

}
