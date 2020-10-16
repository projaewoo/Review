import java.util.Scanner;

public class LcmGcm {
	public static void main(String[] args) {
		//정수 2개 입력받는 부분
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수 : ");		int a = scan.nextInt();
		System.out.print("두번째 수 : ");		int b = scan.nextInt();    //인자, 인수, argument
		int gcm = calcGcm(a, b);			//Call By Value
		int lcm = calcLcm(a, b, gcm);	//Call By Value
		printResult(a, b, gcm, lcm);		//void여서 굳이 지역변수에 넣을 필요 없음
	}													//Call By Value
	
	//최대공약수를 구하는 부분			//동일 클래스여서 static main에서 static메소드 호출할때  주소x, 클래스이름으로 호출x // 이름만으로 호출
	static int calcGcm(int a, int b) {		//parameter
		int gcm = 0;
		for(int i = 2 ; i <= a ; i++) {		
			if(a % i == 0 && b % i ==0)  gcm = i;		//둘 다 나눠지는 최대수
		}
		return gcm;
	}
	//최소공배수를 구하는 부분
	static int calcLcm(int a, int b, int gcm) {
		return a / gcm * b / gcm * gcm;			//LCM = abG
	}
	//정수 2개와 최대공약수와 최소공배수를 출력하는 부분
	static void printResult(int a, int b, int gcm, int lcm) {
		System.out.printf("%d와 %d의 최대공약수는 %d이고, 최소공배수는 %d입니다.\n",
									      a,    b,                     gcm,                  lcm);
	}
}
