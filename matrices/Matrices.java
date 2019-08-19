package week1.day5.assignment5.matrices;

public class Matrices {
	public static int[][] product (int[][] m1, int[][] m2) {
		int[][] result = new int[m1.length][m1[0].length];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				result[i][j] = m1[i][j] * m2[i][j];
			}
		}
		return result;
	}
	
	public static int[][] sum (int[][] m1, int[][] m2) {
		int[][] result = new int[m1.length][m1[0].length];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;
	}
	
	public static int[][] difference (int[][] m1, int[][] m2) {
		int[][] result = new int[m1.length][m1[0].length];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				result[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return result;
	}
	
	public static int[][] transpose (int[][] m1) {
		int[][] result = new int[m1[0].length][m1.length];
		
		for (int i = 0; i < m1[0].length; i++) {
			for (int j = 0; j < m1.length; j++) {
				result[i][j] = m1[j][i];
			}
		}
		return result;
	}
	
	public static void printMatrix (int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
