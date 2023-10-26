package lab5;

public class Task1 {

	// add 2 matrices
	public static int[][] add(int[][] a, int[][] b) {

		int[][] res = new int[a.length][b[0].length];
		if (a.length == b.length && a[0].length == b[0].length) {//2 ma tran bang nhau moi cong duoc
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					res[i][j] += a[i][j] + b[i][j];
				}
			}
			return res;
		} else {
			return null;
		}
	}

	// subtract 2 matrices
	public static int[][] subtract(int[][] a, int[][] b) {
		int[][] res = new int[a.length][b[0].length];
		if (a.length == b.length && a[0].length == b[0].length) {//2 ma tran bang nhau moi tru duoc
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					res[i][j] += a[i][j] - b[i][j];
				}
			}
			return res;
		} else {
			return null;
		}
	}

	// multiply 2 matrices
	public static int[][] multily(int[][] a, int[][] b) {
		int[][] res = new int[a.length][b[0].length];
		if (a[0].length == b.length) {// so cot cua ma tran a phai bang so dong cua ma tran b
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					for (int k = 0; k < b.length; k++) {
						res[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			return res;
		}
		return null;
	}

	// tranpose a matrix
	public static int[][] transpose(int[][] a) {
		int[][] res = new int[a[0].length][a.length];
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				res[i][j] += a[j][i];
			}
		}
		return res;
	}

//print matrix
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr1 = { { 7, 2 },
						 { 5, 3 } };
		
		int[][] arr2 = { { 2, 1 },
						 { 3, 1 } };
		
		int[][] arr3 = { { 1, 2 },
						 { 3, 4 },
						 { 5, 6 } };
		
		int[][] arr4 = { { 1, 3, 5 }, 
						 { 2, 4, 6 } };
//		printArray(add(arr1, arr2));
//		printArray(subtract(arr1, arr2));
		printArray(multily(arr3, arr4));
//		printArray(transpose(arr4));
	}
}
