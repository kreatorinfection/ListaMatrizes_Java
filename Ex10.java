package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        int tamanho = 5;
		        int[][] matriz = new int[tamanho][tamanho];
		        int soma = 0;

		        
		        System.out.println("preencha a matriz:");
		        for (int i = 0; i < tamanho; i++) {
		            for (int j = 0; j < tamanho; j++) {
		                System.out.printf("elemento: ", i, j);
		                matriz[i][j] = scanner.nextInt();
		            }
		        }

		        
		        for (int i = 0; i < tamanho; i++) {
		            soma += matriz[i][i]; 
		        }

		        
		        System.out.println("matriz digitada:");
		        for (int i = 0; i < tamanho; i++) {
		            for (int j = 0; j < tamanho; j++) {
		             
		                if (i == j) {
		                    System.out.print("["+ matriz[i][j] +"]");
		                } else {
		                    System.out.print(matriz[i][j] );
		                }
		            }
		            System.out.println();
		        }

		        System.out.println("\na soma diagonal eh: " + soma);
		        
		        scanner.close();
		    
		

	}

}
