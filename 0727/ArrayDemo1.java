/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

/*
	�迭�� �ʱ�ȭ
	1. ���� ---> byte, short, int, long --> 0
	2. �Ǽ� ---> float, double ---> 0.00~
	3. �Ҹ��� --> boolean --> false
	4. ���� --> char --> null��(='\0', '\u0000'(=�ƽ�Ű 0) )
	5. ������ ( ex)String) )--> �ּ� -->null���� (=null)
*/
public class ArrayDemo1 {
	public static void main(String[] args) {
		String [] array = new String[4];
		for(int i = 0; i < 4; i++) {
			System.out.printf("array[%d] = %s\n", i, array[i]);
		}
	}
}
