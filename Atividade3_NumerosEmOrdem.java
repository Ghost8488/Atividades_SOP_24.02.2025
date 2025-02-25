package atividades_24_02_2025;

import java.util.Scanner;

public class Atividade3_NumerosEmOrdem {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		Double N1, N2, N3;
		
		System.out.println("Olá, esse programa serve para dar ordem a três números que você irá me informar");
        System.out.println("Vamos começar! Me diga o primeiro número:");
		      N1 = stdin.nextDouble();
		System.out.println("Digite o segundo número: ");
              N2 = stdin.nextDouble();
        System.out.println("Digite o terceiro número: ");
              N3 = stdin.nextDouble();
              
         if (N1 < N2 && N1 < N3) {
            	  if (N2<N3) { 
            		  System.out.println("A ordem crescente dos números é: "+N1+", "+N2+", "+N3);  }
            	  
            		  else if (N2<N3) {
            			  System.out.println("A ordem crescente dos números é: "+N1+", "+N3+", "+N2);   }
     	  }
         else if (N2 < N1 && N2 < N3) {
             	  if (N1<N3) { 
    	        	  System.out.println("A ordem crescente dos números é: "+N2+", "+N1+", "+N3);  }
    	  
    		          else if (N2<N3) {
    			          System.out.println("A ordem crescente dos números é: "+N2+", "+N3+", "+N1);   }
	     }
         else if (N3 < N1 && N3 < N2) {
       	          if (N1<N2) { 
    		          System.out.println("A ordem crescente dos números é: "+N3+", "+N1+", "+N2);  }
    	  
             	      else if (N2<N1) {
             			  System.out.println("A ordem crescente dos números é: "+N3+", "+N2+", "+N1);   }
       	 }
         else {
        	 System.out.println("O programa só aceita três números diferentes!");   
         }
        	
         
        stdin.close();
	}

}
