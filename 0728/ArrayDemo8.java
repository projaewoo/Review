/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class ArrayDemo8 {
	public static void main(String[] args) {
		Student chulsu = new Student();		chulsu.name = "��ö��";
		Student younghee = new Student();		younghee.name = "�̿���";
		Student jimin = new Student();				jimin.name = "������";
		Student [] original = {chulsu, younghee, jimin};
		Student [] target = new Student[5];
		//original�迭�� ù �л����� 3���� target�迭�� �����ϱ�
		System.arraycopy(original, 0, target, 0, original.length);  //0x100, 0x200, 0x300, null, null  //�迭�� �� ���� //�迭�� �ּҰ� �־ ��� �ּҺ���
		target = original;		//�ּҺ���  //�� 5�� ������ original�� ��
		for(Student std : target) {
			if(std != null) System.out.println(std.name);			//std�� target�� 5���� ��Ҹ� �� �� �޾Ƽ�
		}  //std != null  : �ּҵ鳢�� �� // null : �ּ�

	}
}