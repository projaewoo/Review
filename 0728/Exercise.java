/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
import java.util.Arrays;

public class Exercise {
	public static void main(String[] args) {
		int [] count = new int[26];  //�� ���ĺ� count
		String str = "In the film, Red Riding Hood and the woodcutter together kill the wolf who transmits the dark curse that resembles a virus, and the captain kills Father Solomon, who could have become another horrible wolf. Likewise, we, too, should have the courage to repudiate both the dark legacy and the madness of a tyranny that masquerades as justice. Both plagues have terrorized our society for a long time and caused us to forfeit our right to live without fear. The age of the two antagonizing monsters is over now. The future belongs to the defiant new generation that will destroy the two cursed remnants of the dark past and build a new society with a fresh new vision. ��Red Riding Hood�� serves as a mirror to our grim present reality and shows us how to overcome these troubled times.";
		for(int i = 0; i < str.length() ; i++) {
			char munja = str.charAt(i);		//i�� ����Ű�� �� ����
			if(65 <= munja && munja <= 90)	count[munja - 65]++;	//�빮�� //A�� count�� 0��° �� ����
			else if(97 <= munja && munja <= 122) count[munja - 97]++;  //�ҹ��ڶ��
		}
		for(int i = 0; i < count.length ; i++) {
			System.out.printf("%3c = %5d", (char)(i + 65), count[i]);
			if((i + 1) % 5 ==0) System.out.println();		//i�� 0���� �����ؼ�
		}
		
	}
}