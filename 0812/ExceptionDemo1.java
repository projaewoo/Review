import java.util.Scanner;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���������� �Է����ּ��� : ");
		try {
			int kor = scan.nextInt();
			if(kor < 0 || kor > 100) throw	new RuntimeException("���������� 0���� 100�� ���̿��� �մϴ�.");	//instance���� ���� ������
			System.out.println("Kor = " + kor);
		}catch(RuntimeException ex) {		//throw�� runtime�ν��Ͻ��� ex�� �޾Ƽ�, ex�� RuntimeException �ν��Ͻ��� ����Ŵ.
			//JOptionPane.showMessageDialog(null, ex.getMessage());
			System.out.println(ex.getMessage());
		}
	}
}
