package week1.day5.assignment5.matrices;

import java.util.Scanner;

public class MatrixMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int m1rows, m1columns;
		int m2rows, m2columns;
		
		int[][] m1, m2;
		
		boolean proceed = true;
		
		while(proceed) {
			
			System.out.println("Matrix 1 dimensions? Rows, Columns -- 2 Integers");
			m1rows = in.nextInt();
			m1columns = in.nextInt();
			
			m1 = new int[m1rows][m1columns];
			
			System.out.println("Type in matrix");
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[0].length; j++) {
					m1[i][j] = in.nextInt();
				}
			}
			
			System.out.println("Matrix 2 dimensions? Rows, Columns -- 2 Integers -- NOTE we expect same size matrices");
			m2rows = in.nextInt();
			m2columns = in.nextInt();
			
			m2 = new int[m2rows][m2columns];
			
			System.out.println("Type in matrix");
			for (int i = 0; i < m2.length; i++) {
				for (int j = 0; j < m2[0].length; j++) {
					m2[i][j] = in.nextInt();
				}
			}
			
			System.out.println("Sum:");
			Matrices.printMatrix(Matrices.sum(m1, m2));
			
			System.out.println("Difference:");
			Matrices.printMatrix(Matrices.difference(m1, m2));
			
			System.out.println("Product:");
			Matrices.printMatrix(Matrices.product(m1, m2));
			
			
			
			System.out.println("Transpose 1:");
			Matrices.printMatrix(Matrices.transpose(m1));
			
			System.out.println("Transpose 2:");
			Matrices.printMatrix(Matrices.transpose(m2));
			
			System.out.println("Type Q to quit, or any other letter to continue");
			if (in.next().equalsIgnoreCase("Q"))
				break;
		}
		System.out.println("Goodbye!\n");
		in.close();
	}
}
