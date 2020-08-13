
public class AssertionDemo {
	public static void main(String[] args) {
		int i, sum = 0;
		for(i = 1 ; i < 101; i++) {	//i의 값을 보고 다 돌았는지 판단
			sum = i;							
		}								
//		if(i <= 100) System.out.println("100번 반복 여부 확인할것");	//유저, 개발자 둘 다 체크가능
		//개발자만 체크하는 방법
		//기본적으로 assert체크 X (기본적으로 default값)
		//실행할때, -ea옵션 줘야 assert체크함. //cmd에서 java -ea AssertionDemo	//Run Configuration -> VM Arguments에 -ea적기
		assert i > 100 : "100번 반복 여부 확인할 것";	//i>100 아닐때 뒤의 문장 찍고, 프로그램 종료. (9행 실행x)
		//잘못해서 sum = i;로 잘못하면
		assert sum > 100 : "누적 검사 필요";
		System.out.println("sum = " + sum);		//i > 100일때 출력
	}
}
