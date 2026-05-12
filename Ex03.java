package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		

		  Scanner receba = new Scanner(System.in);

	        int[][] matriz = new int[3][3];

	        for (int lin = 0; lin < 3; lin++) {
	            for (int col = 0; col < 3; col++) {
	                System.out.print("digite o valor [" + lin + "][" + col + "]: ");
	                matriz[lin][col] = receba.nextInt();
	            }
	        }

	        System.out.println();

	        for (int lin = 0; lin < 3; lin++) {
	            int soma = 0;

	            for (int col = 0; col < 3; col++) {
	                soma += matriz[lin][col];
	            }

	            System.out.println("soma Linha " + (lin + 1) + " = " + soma);
	        }

	        receba.close();
	    }
	}
	
