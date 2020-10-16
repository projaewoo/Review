/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

//GUI통한 입력
import javax.swing.JOptionPane;
public class ArrayDemo1 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "나이를 입력하세요.");
		System.out.println("귀하의 나이는 " + age + "살이군요");
	}
}
