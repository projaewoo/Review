/*
�ۼ��� : �����
�ۼ����� : 7�� 23�� ����
�ۼ��Ͻ� : 7�� 23��
�ۼ�ȯ�� : Windows
*/

public class Exam {
	public static void main(String[] args) {
		
		//1�� ����. 1���� 100���� �� 7�� ��� ���
		for(int i = 1 ; i < 101 ; i++) {
			if(i % 7 ==0)
			System.out.print(i + " ");
		}


		System.out.println();
		System.out.println("------------");
		//2�� ����. 1�� ������ �� �ٿ� 3���� ���
		int count = 0;
		for(int i = 1 ; i < 101 ; i++) {
			if(i % 7 ==0) {
			System.out.print(i + " ");
			count++;
			if(count % 3 == 0) System.out.println();
			}
		}


		System.out.println();
		System.out.println("------------");
		//3�� ����. ���ĺ� �����ڵ�� ���!!!
		int counts = 0;
		char unicode = '\0';


		for(int i = 65 ; i <= 122 ; i++) {

			for(count = 0 ; count < 5 ; count++) {
				System.out.print((char)i + " ");
				i++;
			}
			System.out.println();
			i += 32;
			//i = 102  --> 'f'
			//count = 5

			for(count = 0 ; count < 5 ; count++) {
				System.out.print((char)i + " ");
				i++;
			}
			System.out.println();
			i -= 32;
			// i = 107 
			//count = 5

			for(count = 0 ; count < 5 ; count++) {		//K L M N O
				System.out.print((char)i + " ");
				i++;
			}
			System.out.println();
			i += 32;
			//i = 80
			
			for(count = 0 ; count < 5 ; count++) {		//p q r s t
				System.out.print((char)i + " ");
				i++;
			}
			System.out.println();
			i -= 32;
			// i = 117

			for(count = 0 ; count < 5 ; count++) {		//U V W X Y
				System.out.print((char)i + " ");
				i++;
			}
			System.out.println();
			i += 32;
			// i = 90

			System.out.println((char)i);
		}
		
		
	}
}