
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();		//member변수여서 생성
		int a = 40, b = 50;			//argument(인자, 인수)  (지역변수)
		int result = md.calcSum(a, b);		//member method는 주소를 통해 접근  //반환값을 result가 받음
		System.out.println(a + "부터 " + b + "까지의 합은 = " + result);
		a = 1; b = 30;
		result = md.calcSum(1, 30);				//Call By Value (값에 의한 호출)
		System.out.println(a + "부터 " + b + "까지의 합은 = " + result);
		a = 50; b = 100;
		result = md.calcSum(50, 100);
		System.out.println(a + "부터 " + b + "까지의 합은 = " + result);
	}						//int start, int end = parameter (매개변수) (=메서드 내에서 지역변수)
	 int calcSum(int start, int end) {	//member method		//max가 50, 30, 100을 받음 = 값 복사
		int sum = 0;
		for(int i = start ; i <=  end ; i++) {
			sum += i;
		}
		//System.out.println(start + "부터 " + end + "까지의 합은 = " + sum);
		//return;;  //빈손으로 복귀
		return sum;		//sum 정수이므로 method의 반환타입을 int로
	}	
}