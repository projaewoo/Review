import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo1 {
	public static void main(String[] args) {
		int [] array = input(); //�迭�� �ּҰ� �Ѿ���ϱ� �迭�� �ּҷ� ����
		output(array);		//output�� int�迭 �����Ƿ� int�迭�� �Ѱ���
	}
	static int [] input() {			//��ȯŸ�� : ������ (�������� �ּҸ� ��ȯ�ؼ�)
		Scanner scan = new Scanner(System.in);		//Scanner�� �ʿ��� ������ �����ص� ��
		int [] array = new int[7];
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print("���� >> ");		array[i] = scan.nextInt();
		}
		return array;			//������ ��ȯŸ�� = �ּҸ� ��ȯ
	}	//int�迭�� �����ּҰ� return�� //������ ��ȯŸ��
	static void output(int [] array) {
		System.out.println(Arrays.toString(array));
	}
}
