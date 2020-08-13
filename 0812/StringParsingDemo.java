import java.io.File;
import java.util.Scanner;

/*
 * 문자열 파싱
	1. String class의 split()
	2. java.util.StringTokenizer class
	3. java.util.Scanner class
 */
public class StringParsingDemo {
	public static void main(String[] args) throws Exception{
		String str = "        2    422-5123   박은지    1084   ";
//		split() 방법
		//단점 : 정규식 알아야함. 		//장점 : 자동으로 배열 생성, 자동 초기화.
//		String [] array= str.trim().split("\\s+");			// 정규식 \s+ : 한칸 이상의 스페이스바	// '\'하나만 만나면 자바는 특수문자로 이해 따라서 "\\" 두개 사용.
//							//trim() : 2 앞의 공백,  1084 뒤의 공백 자름		//split : String클래스의 member메소드 -> 주소로 접근
//		System.out.println(array.length);
		
		
		//StringTokenizer클래스 방법
		//장점 : 정규식 몰라도 알아서 잘라줌	//단점 :  배열 직접 생성, 직접 초기화
//		StringTokenizer st = new StringTokenizer(str.trim());
//		String [] array = new String [st.countTokens()];	//tokenizer가 자르는 수 = 토큰 갯수
//		int index = 0;		//초기화
//		while(st.hasMoreTokens()) {		//trim으로 커서 2 앞에 있음 -> 다음 토큰 있으면 (2있음) -> true -> 
//			array[index] = st.nextToken();	//-> 토큰(2, 422-5123, 박은지, ...)을 배열에 넣어야함
//			index++;
//		}
//		System.out.println(array[1]);
		
		
		//Scanner클래스 방법
		//단점 : 정규표현식 알아야함, 배열 직접 생성, 초기화	//장점 : 각자에 맞는 Data type으로 읽을 수 있음, File처리에 특화되어 있음
//		Scanner scan = new Scanner(str.trim());		//"2     422-5123    박은지   1084"
//		Scanner other = scan.useDelimiter("\\s+");	//Delimiter : 구분자		//other : 잘라진 문자열
//		System.out.println(other.nextInt());		//Data type으로 읽을 수 있음
//		System.out.println(other.next());			//422-5123 : string
//		System.out.println(other.next());			//박은지 : string
//		System.out.println(other.nextInt());		//1084 : int
		
		//배열 만들기
//		String [] array = new String[100];
//		int index = 0;
//		while(other.hasNext()) {			//other의 다음 토큰이 있음? -> true or false
//			array[index] = other.next();		//다음 토큰을 배열의 index번째에 넣음
//			index++;
//		}
//		for(int i = 0 ; i < index; i++) {
//			System.out.println(array[i]);
//		}
		
		//파일단위로 읽기
		//Scanner scan = new Scanner("C:/temp/data.txt");	//"C:/temp/data.txt" -> 문자열로 생각. 파일로 인식 X

		File file = new File("C:/temp/data.txt");
		Scanner scan = new Scanner(file);				//파일로 인식
		int sum = 0;
		while(scan.hasNextInt()) {		//while : 끝을 알 수 없을때 사용.	//다음 정수가 있을때까지
			//System.out.println(scan.nextLine());				//한 줄씩 읽음.	(한 줄에 공백으로 토큰 띄어져있는 경우)
			sum += scan.nextInt();
		}
		System.out.println(sum);
	}
}
