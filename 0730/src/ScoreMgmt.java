import java.util.Arrays;

public class ScoreMgmt {
	public static void main(String[] args) {
		int [] answers = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};  //���� �迭
		int [][] array = {
				{1, 2, 2, 4, 2, 2, 3, 4, 1, 2},
				{1, 2, 3, 4, 1, 1, 1, 4, 1, 1},
				{1, 2, 3, 4, 1, 2, 3, 4, 1, 2},
				{1, 3, 3, 3, 3, 3, 3, 3, 1, 2},
				{1, 2, 3, 4, 1, 2, 3, 1, 1, 2}				
								};    //�л� ����� �迭
		char [][] results = new char[5][11];		//������ ��ҿ� ����
		
		System.out.println("[ ���� ]");
		System.out.println(Arrays.toString(answers));
		System.out.println("[ �л��� ���� ��� ]");
		for(int i = 0; i < array.length; i++) {
			System.out.print("�л�" + (i+1) + " : " );
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		//ä��
		for(int i = 0; i < array.length; i++) {		//�л� ��
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == answers[j]) {
					results[i][j] = 'O';
					results[i][10] += 10;
				}else {
					results[i][j] = 'X';
				}
			}
		}
		System.out.println("[ ä�� ��� ]");
		for(int i = 0; i < array.length; i++) {
			System.out.print("�л�" + (i+1) + " : ");
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.print(results[i][j] + " " );   //o x o x o x o x o x 
			}
			System.out.println("(" + (int)( results[i][10] ) + "��)");
		}
		
	}
}
