package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

    Scanner receba = new Scanner(System.in);

    int[][] matriz = new int[4][3];

 
    for (int lin = 0; lin < 4; lin++) {
        for (int col = 0; col < 3; col++) {

            System.out.print("digite o valor [" + lin + "][" + col + "]: ");
            matriz[lin][col] = receba.nextInt();
        }
    }

    
    System.out.print("\ndigite o valor que você deseja procurar na matriz: ");
    int valor = receba.nextInt();

    boolean encontrado = false;

    
    for (int lin = 0; lin < 4; lin++) {
        for (int col = 0; col < 3; col++) {

            if (matriz[lin][col] == valor) {
                encontrado = true;
            }
        }
    }

    
    if (encontrado) {
        System.out.println("o valor se encontra na matriz");
    } else {
        System.out.println("o valor NÃO se encontra na matriz");
    }

    receba.close();
}
}
