/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class SungjukMgmt {
	public static void main(String[] args) {
		Student chulsu = new Student();
		Student.mat = 100;
		chulsu.kor = 90;	chulsu.eng = 85;
		int total = chulsu.kor + chulsu.eng + Student.mat;
		System.out.println("ö�� ���� = " + total);

		Student younghee = new Student();
		younghee.kor = 95;  younghee.eng = 100;
		total = younghee.kor + younghee.eng + Student.mat;
		System.out.println("���� ���� = " + total);
	}
}
