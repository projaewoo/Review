
public class Exercise {
	public static void main(String[] args) {
		int n = 1, count = 0;
		String [][] array = new String[9][9];
		//공백에 맞게 빈칸 채우는 코드
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array.length; j++) {
				array[i][j] = "\u0000";
			}
		}
		//
		//남은 칸에 숫자 찍는 코드
		for(int i = 8; i >= 0 ; i--) {
			for(int j = i ; j > 0 ; j--) {
				array[8 - i][j] = Integer.toString(n);
				n++;
				count++;
				if(count % (9 - i) == 0) {
					System.out.println();
					break;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0 ; j < array.length ; j++) {
				System.out.print(array[i][j]);
			}
		}
		
	}
}