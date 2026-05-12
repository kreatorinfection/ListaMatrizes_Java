package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex08 {
	  public static void main(String[] args) {

	  Scanner receba = new Scanner(System.in);

      int[][] matriz = new int[3][3];
      int[][] transposta = new int[3][3];

      
      System.out.println("digite os elementos da matriz 3x3:");
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print("[" + i + "][" + j + "]: ");
              matriz[i][j] = receba.nextInt();
          }
      }

      
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              transposta[j][i] = matriz[i][j];
          }
      }

      
      System.out.println("\nmatriz original:");
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
      }

     
      System.out.println("\nmatriz invertida:");
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              System.out.print(transposta[i][j] + " ");
          }
          System.out.println();
      }

      receba.close();
  }
}
