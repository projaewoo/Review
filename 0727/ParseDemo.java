/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ParseDemo {
	public static void main(String[] args) {
		//String str = "128";	//string�̾ ����
		//int su = Integer.parseInt(str, 16);	//����128�� 16���� ���� 128��
		//System.out.printf("su = %x\n", su);
		int su = 128;
		//String str = "" + su;		//"128" //stringƯ���� ���ʸ� string�̸� �������� string���� ��ȯ
		//String str = String.valueOf(su);		//"128"	
		String str = Integer.toString(su, 16);		//16������ �ٲ㼭 ���ڿ���
		System.out.printf("str = %s\n", str);
	}
}
