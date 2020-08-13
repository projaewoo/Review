
public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
//		Student chulsu = new Student(80);	//ERROR //던진 exception을 안받아서 오류 //catch안써서 오류
//		System.out.println(chulsu);
		
		//"5" --> 5
//		int su = Integer.parseInt("hello");		//parseInt()는 throws NumberFormatException. (=부모님이 RuntimedException =Unchecked =try-catch안써도 됨)
//		System.out.printf("su = %d", su);
		
		//try-catch방법
//		Student chulsu;		//선언
//		try {												//STdudent에서 Excpetion던점 = checked -> try-catch사용해야함
//			chulsu = new Student(110);
//			System.out.println(chulsu);
//		}catch(Exception ex) {			//Student생성자에서 던진 Exception을 받음.
//			System.out.println(ex);
//		}
		
		//main이 던지는 방법(책임 전가)		//main도 안받고 던짐 (JVM에게)
//		Student chulsu = new Student(101);
//		System.out.println(chulsu);
		
		//koreanException과 연동
		Student chulsu = null;
		try {
			chulsu = new Student(110);
		} catch (KoreaException ex) {			//korea = checked = 꼭 koreaException으로 받아줘야함 //unchecked도 써주면 좋긴 좋음 
			System.out.println(ex.getMessage());		//KoreaException -> Exception -> Throwable인터페이스 (여기에 getMessage()메소드 포함됨)
		}																	//따라서 KoreaException의 할아버지 인터페이스의 메소드를 사용.
		System.out.println(chulsu);
	}
}
class Student {
//	private int kor, eng;
//	//member변수 : 생성자 통해서 초기화							//Exception 여러개 사용가능.
//	public Student(int kor, int eng) throws ClassCastException, NullPointerException, ArithmeticException{			//이 메소드에서 Exception던진다는 표현		//나중에 이 Exception처리해야함.		//이 Exception -> checked면 반드시 try-catch써야함		
//		if(kor < 0 || kor > 100) throw new ClassCastException("잘못된 국어점수입니다.\n확인후 다시 입력해주세요.");															//unchecked면 굳이 try-catch안써도 됨.
//		else if(this == null) throw new NullPointerException("내가 Null입니다.");
//		else if(kor == 0) throw new ArithmeticException("0이 되면 안됩니다.");
//		else this.kor = kor;
//	}

	//KoreanException과 연동
	private int kor;
	
	public Student(int kor) throws KoreaException{		//checked여서 꼭 throws 표기해줘야함. //unchecked는 굳이 표기안해도 되긴 함
		if(kor < 0 || kor > 100) throw new KoreaException("국어점수는 0부터 100점까지 입니다.");		//문자열을 message가 받고, 부모가 받아서 getMessage로 찍음
//		if(eng < 0 || eng > 100) throw new EnglishException("영어점수는 0부터 100점까지입니다.");
		this.kor = kor;
//		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return String.format("국어점수 = %d", this.kor);
	}
	
}