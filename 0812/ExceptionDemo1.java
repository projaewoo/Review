import java.util.Scanner;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수를 입력해주세여 : ");
		try {
			int kor = scan.nextInt();
			if(kor < 0 || kor > 100) throw	new RuntimeException("국어점수는 0부터 100점 사이여야 합니다.");	//instance만들어서 예외 던지기
			System.out.println("Kor = " + kor);
		}catch(RuntimeException ex) {		//throw된 runtime인스턴스를 ex가 받아서, ex가 RuntimeException 인스턴스를 가리킴.
			//JOptionPane.showMessageDialog(null, ex.getMessage());
			System.out.println(ex.getMessage());
		}
	}
}
