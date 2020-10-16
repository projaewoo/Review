
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
	
	boolean checkPrime(int su) {  //만일 소수이면 true, 그렇지 않으면 false
		boolean flag = true;		//지역변수는 초기화
		for(int i = 2; i < su ; i++) {
			if(su % i ==0) {
				flag = false;
				break;
			}
		}
		//su % i ==0이 아니면 flag = true;
		return flag;
	}
}
