/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class OpDemo6 {
	public static void main(String[] args) {
		int score = 59;
		String result =(score < 60) ? "���հ�" : "�հ�";
		System.out.println("result = " + result);

		double avg = 59.5;
		char grade = (avg >= 90) ? 'A' :
									(avg >= 80) ? 'B' :
										(avg >= 70) ? 'C' :
											(avg >= 60) ? 'D' : 'F';
		System.out.println("garde = " + grade);

		int hour = 11;
		System.out.println((hour< 12) ? "����" : "����");
	}
}
