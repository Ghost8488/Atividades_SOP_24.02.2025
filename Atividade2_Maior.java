package atividades_24_02_2025;

import java.util.Scanner;

public class Atividade2_Maior {

	public static void main(String[] args) {
		
         Scanner stdin = new Scanner(System.in);
        
        double N1, N2;
        
        System.out.println("Esse programa dirá qual, dentre dois númeors, é o maior.");
        System.out.println("Bom, vamos começar! ");
        System.out.println();
        System.out.println("Digite o primeiro número: ");
           N1 = stdin.nextDouble();
        
        System.out.println();
        System.out.println("Agora digite o segundo número: ");
           N2 = stdin.nextDouble();
        
        if (N1 > N2) {
            System.out.print("O maior número é: " + N1);
        }
        else if (N2 > N1) {
            System.out.print("O maior número é: " + N2);
        }
        else {
            System.out.print("Os números são de igual valor!");
        }
        
         stdin.close();

	}

}
