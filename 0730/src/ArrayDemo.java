
public class ArrayDemo {
	public static void main(String[] args) {
		int [][] A; 
		int [][] B;
		int [][] plus = new int[2][2];		//0¿∏∑Œ √ ±‚»≠
		int [][] gop = new int[2][2];	
		A = new int[][] {
									{1, 2},
									{3, 4}
									};
		B = new int[][] {
									{5, 6},
									{7, 8}
									};
		//A + B
		for(int i = 0; i < A.length; i++) {
			for(int j = 0 ; j < A[i].length; j++) {
				plus[i][j] = A[i][j] + B[i][j];
			}
		}
		System.out.println("<<«‡∑ƒ¿« µ°º¿>>");
		for(int i = 0; i < plus.length; i++) {
			for(int j = 0; j < plus.length; j++) {
				System.out.print(plus[i][j] + "\t");
			}
			System.out.println();
		}
		
		//A * B
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				for(int k = 0; k < 2; k++) {
					gop[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		System.out.println("<<«‡∑ƒ¿« ∞ˆº¿>>");
		for(int i = 0 ; i < gop.length; i++) {
			for(int j = 0; j < gop.length ; j++) {
				System.out.print(gop[i][j] + "\t");
			}
			System.out.println();
		}
//		A[0][0]*B[0][0] + A[0][1]*B[1][0] = multiple[0][0];
//		A[0][0]*B[0][1] + A[0][1]*B[1][1] = multiple[0][1];
//		A[1][0]*B[0][0] + A[1][1]*B[1][0] = multiple[1][0];
//		A[1][0]*B[0][1] + A[1][1]*B[1][1] = multiple[1][1];
		
	}
}
