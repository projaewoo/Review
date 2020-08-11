/*
 * static 4���� ���
 * 1. static����
 * 2. static�޼ҵ�
 * 3. static�ʱ�ȭ���
 * 4. static class
 */
		
public class StaticDemo {
	public static void main(String[] args) {
		Student [] array = new Student[3];
		for(int i = 0 ; i < array.length; i++) {array[i] = new Student();}
		for(Student s : array) System.out.println(s);		//s.toString()ȣ��.	//toString() = public member method
		Student.print();																					//���� �ּҷ� ����.
	}
}
class Student {
	public int count;		//member����		//��ü���� �������
	public static int su;		//static����		//�������� (��� ��ü�� ������)
	public Student() {		//������
		count++;
		su++;
	}
	public static void print() {			//static method (Ŭ���� �̸����� ����)
		System.out.println("Hello");
	}
	@Override
	public String toString() {			//member method  (�ּҷ� ����)
		return String.format("count = %d, su = %d", this.count, su);
	}
}