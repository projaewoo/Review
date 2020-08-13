//사용자 정의 Exception
														//Checked Exception = try-catch 안쓰면 컴파일에러
public class KoreaException extends Exception {	//1. Exception의 자식 = Checked = try-catch 사용해야함 = 필수적인 내용
	public KoreaException(String message) {		//2. parameter : string
		super(message);
	}
}
