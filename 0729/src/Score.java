
public class Score {
	public static void main(String[] args) {
		int count = 0;
		int [] score = new int[5];
		int [] answer = {1,  2,  3,  4,  1,  2,  3,  4,  1,  2};
		char [][] arrayCh = new char[5][10];
		int [][] array = {
								{1, 2, 2, 4, 2, 2, 3, 4, 1, 2},
								{1, 2, 3, 4, 1, 1, 1, 4, 1, 1},
								{1, 2, 3, 4, 1, 2, 3, 4, 1, 2},
								{1, 3, 3, 3, 3, 3, 3, 3, 1, 2},
								{1, 2, 3, 4, 1, 2, 3, 1, 1, 2}
								};
		
		System.out.println("[����]");
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		
		System.out.println();
		System.out.println("[ �л��� ���� ��� ]");
		for(int i = 0; i < array.length; i++) {
			System.out.printf("�л� %d : ", (i+1));
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%d\t", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		//ä�� ��� �Է�	
		for(int i = 0; i < arrayCh.length ; i++) {
			for(int j = 0; j < arrayCh[i].length; j++) {
				if(array[i][j] == answer[j]) {
					arrayCh[i][j] = 'O';
					count++;
				}
				else {
					arrayCh[i][j] = 'X';
				}
			}
			score[i] = count * 10;
			count = 0;
		}
		
		//ä�� ��� ���
		System.out.println("[ ä�� ��� ]");
		for(int i = 0; i < arrayCh.length; i++) {
			System.out.printf("�л� %d : ", (i+1));
			for(int j = 0; j < arrayCh[i].length; j++) {
				System.out.printf("%c\t", arrayCh[i][j]);
			}
			System.out.printf("(%d��)",  score[i]);
			System.out.println();
		}
		
	}
}
