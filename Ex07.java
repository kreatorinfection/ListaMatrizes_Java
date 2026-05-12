package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex07 {

	  public static void main(String[] args) {

	        Scanner receba = new Scanner(System.in);

	        int[][] matriz = new int[6][3];
	        int maior, menor;

	
	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print("digite o valor [" + i + "][" + j + "]: ");
	                matriz[i][j] = receba.nextInt();
	            }
	        }

	           maior = matriz[0][0];
	        menor = matriz[0][0];

	   
	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 3; j++) {

	                if (matriz[i][j] > maior) {
	                    maior = matriz[i][j];
	                }

	                if (matriz[i][j] < menor) {
	                    menor = matriz[i][j];
	                }
	            }
	        }

	     
	        System.out.println("maior : " + maior);
	        System.out.println("menor: " + menor);

	        receba.close();
	    }
	}
