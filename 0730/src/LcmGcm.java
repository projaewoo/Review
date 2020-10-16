import java.util.Scanner;

public class LcmGcm {
	public static void main(String[] args) {
		//���� 2�� �Է¹޴� �κ�
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° �� : ");		int a = scan.nextInt();
		System.out.print("�ι�° �� : ");		int b = scan.nextInt();    //����, �μ�, argument
		int gcm = calcGcm(a, b);			//Call By Value
		int lcm = calcLcm(a, b, gcm);	//Call By Value
		printResult(a, b, gcm, lcm);		//void���� ���� ���������� ���� �ʿ� ����
	}													//Call By Value
	
	//�ִ������� ���ϴ� �κ�			//���� Ŭ�������� static main���� static�޼ҵ� ȣ���Ҷ�  �ּ�x, Ŭ�����̸����� ȣ��x // �̸������� ȣ��
	static int calcGcm(int a, int b) {		//parameter
		int gcm = 0;
		for(int i = 2 ; i <= a ; i++) {		
			if(a % i == 0 && b % i ==0)  gcm = i;		//�� �� �������� �ִ��
		}
		return gcm;
	}
	//�ּҰ������ ���ϴ� �κ�
	static int calcLcm(int a, int b, int gcm) {
		return a / gcm * b / gcm * gcm;			//LCM = abG
	}
	//���� 2���� �ִ������� �ּҰ������ ����ϴ� �κ�
	static void printResult(int a, int b, int gcm, int lcm) {
		System.out.printf("%d�� %d�� �ִ������� %d�̰�, �ּҰ������ %d�Դϴ�.\n",
									      a,    b,                     gcm,                  lcm);
	}
}
