package pctExerciciosMatrizes;

import java.util.Scanner;

public class Ex01B {


	    public static void main(String[] args) {

	        Scanner receba = new Scanner(System.in);

	     
	        String[][] clientes = new String[3][2];

	
	        for (int i = 0; i < 3; i++) {
	            System.out.println("digite o cpf do cliente " + (i + 1) + ": ");
	            clientes[i][0] = receba.nextLine();

	            System.out.println("digite o telefone do cliente " + (i + 1) + ": ");
	            clientes[i][1] = receba.nextLine();

	            System.out.println();
	        }

	
	        for (int i = 0; i < 3; i++) {
	            System.out.println("cpf: " + clientes[i][0]);
	            System.out.println("telefone: " + clientes[i][1]);
	            System.out.println();
	        }

	        receba.close();
	    }
	}