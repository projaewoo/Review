/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ArrayDemo6 {
	public static void main(String[] args) {
		String str = "����� ������ ���ﵿ";
		char [] array = str.toCharArray();		//string�� char�� ���� �ϳ��� ���ڷ� �ν�
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%3c", array[i]);
		}
		array[0] = '��';   array[1] = '��';   array[2] = '��';
		System.out.println();
		str = new String(array);			//���� �ٲٷ��� new���
		System.out.println(str);	
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%3c", array[i]);
		}
	}
}
