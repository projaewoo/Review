import java.util.Scanner;

public class ReturnDemo {
	public static void main(String[] args) {
		//Ű�� �����Ը� �Է¹޴� �κ�
		Scanner scan = new Scanner(System.in);
		System.out.print("Ű : ");		double height = scan.nextDouble();
		System.out.print("������ : "); double weight = scan.nextDouble();
		ReturnDemo rd = new ReturnDemo();
		double bmi = rd.calcBmi(height * 0.01 , weight);		//call by value
		rd.printLevel(bmi);
	}
	//BMI���� ����ϴ� �κ�, prototype(Ʋ)
	double calcBmi(double height, double weight) {	
		//�̹� height�� ������ meter �������
		double bmi = weight / (height * height);
		return bmi;
	}
	//BMI������ ���� 6�ܰ� ������ ����ϴ� �κ�
	void printLevel(double bmi) {
		System.out.println("bmi = " + bmi);
		if(bmi >= 40) System.out.println("�� ��");
		else if(bmi >= 35 && bmi < 40) System.out.println("�ߵ ��");
		else if(bmi >= 30 && bmi < 35) System.out.println("�浵 ��");
		else if(bmi >= 25 && bmi < 30) System.out.println("��ü��");
		else if(bmi >- 18.5 && bmi < 25) System.out.println("����");
		else if(bmi < 18.5) System.out.println("��ü��");
		return;		//return�ڿ� �ƹ��͵� ������ void
		//System.out.println("Hello");  //return �ؿ��� � ���嵵 ��� �Ұ�
	}
}
