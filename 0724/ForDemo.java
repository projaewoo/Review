/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ForDemo {
	public static void main(String[] args) {
		int count = 0, line = 1;
		for(int i = 65 ; i <= 90 ; i++) {  //z = 90
			if(line % 2 == 0) {				//������ ¦�����̶��
				System.out.printf("%-5c", (char)(i + 32)); //�ҹ���
			} else {   //������ Ȧ�����̶��
				System.out.printf("%-5c", (char)i);   //- : ��������  //�빮�ڿ� �ҹ��� �� ���� = 32 //�ҹ��� �������� (char)(i + 32)
			}
			count++;				//if�� ���� ���� ��� count++
			if(count % 5 == 0) {			//5�� ���ڸ��� �� �ٲ�.
				System.out.println();	//count�� 5�� ����϶�, �� �ٲ�	
				line++;
			}
		}
	}
}
