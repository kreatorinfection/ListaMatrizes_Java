package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex04C {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);

        int[][] matriz = new int[5][5];

       
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {

                System.out.print("digite o valor [" + lin + "][" + col + "]: ");
                matriz[lin][col] = receba.nextInt();
            }
        }

        System.out.println("\nsoma das linhas:");

        for (int lin = 0; lin < 5; lin++) {
            int somaLinha = 0;

            for (int col = 0; col < 5; col++) {
                somaLinha += matriz[lin][col];
            }

            System.out.println("linha " + lin + " = " + somaLinha);
        }

        receba.close();
    }


	}


