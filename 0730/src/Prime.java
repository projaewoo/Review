
public class Prime {
	public static void main(String[] args) {
		Prime p = new Prime();
		int count = 0;
		for(int i = 2 ; i < 201 ; i++) {
			if(p.checkPrime(i)) {
				System.out.print(i + "\t");
				count++;
				if(count % 5 ==0)   System.out.println();
			}
		}
	}
	
	boolean checkPrime(int su) {  //���� �Ҽ��̸� true, �׷��� ������ false
		boolean flag = true;		//���������� �ʱ�ȭ
		for(int i = 2; i < su ; i++) {
			if(su % i ==0) {
				flag = false;
				break;
			}
		}
		//su % i ==0�� �ƴϸ� flag = true;
		return flag;
	}
}
