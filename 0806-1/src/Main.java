import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//��ö��, 24, �濵 / �̿���, 34, �ɸ� / ������, 28, �İ�
		
		//�л� �Է�
		Student [] array = new Student[3];
		for(int i = 0 ; i < array.length; i++) {
			String name, major;
			int age;
			System.out.print("�л� �̸� : ");		name = scan.next();
			System.out.print("���� : ");		age = scan.nextInt();
			System.out.print("�л� ���� : ");		major = scan.next();
			array[i] = new Student(name, age, major);
			System.out.println();
		}
		//�л� ���
		for(int i = 0 ; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
