/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/

public class LabelBreakContinueDemo {
	public static void main(String[] args) {
		/*outer :		//Label  (:�� ������ ��) (switch������ ���)
		for(int i = 1 ; i < 101 ; i++) {
			inner :		//Label
			for(int j = 65 ; j < 90 ; j++) {
				//if(i == 10) break; (�ȿ� (inner)�� ������ ����)   //i�� 10�϶��� �ǳʶٰ� �ٽ� i = 11�϶� ����
				if(i == 10) break outer;		//i�� 10������ �� i = 11���� ���ϰ� �ƿ� ��
				//if(i == 10) continue;  //inner�� for�� j++�� ��
				//if(i == 10) continue outer;  //outer�� for�� i++�� ��
			}

		}*/

		outer :
			for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5)
//						break outer;	//i���� �׸��� //3�� �ȳ���
//						break;			//j�� 5�϶� ���� for���
//						continue outer;		//2 * 5 �Ǵ� ���� ��� ���ϰ�, �ٱ��� i++����������
//						continue;		//j�� 5�϶��� �ؿ� ���â �ǳʶٰ�, ����� ���� j++���������� //2 * 5, 3 * 5, 4 * 5, ... �ǳʶٰ� ��� ����
					System.out.print(i+"*"+ j +"="+ i*j + "   ");
				} // end of for i
				System.out.println();
		} // end of outer



	}
}
