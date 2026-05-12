package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		 Scanner receba = new Scanner(System.in);

	        int[][] matriz = new int[5][2];

	        int soma = 0;
	        int total = 5 * 2;

	     
	        for (int lin = 0; lin < 5; lin++) {
	            for (int col = 0; col < 2; col++) {

	                System.out.print("digite o valor [" + lin + "][" + col + "]: ");
	                matriz[lin][col] = receba.nextInt();

	                soma += matriz[lin][col];
	            }
	            System.out.println(" ");
	        }

	   
	        double media = (double) soma / total;

	        System.out.println("soma: " + soma);
	        System.out.println("media: " + media);

	        receba.close();
	    }
	
	}


