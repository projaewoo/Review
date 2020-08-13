
public class Test {
	private int kor, eng;
											//KoreaException = 필수 예외 = 메소드 선언부에 표기해줘야함.	//English도 던진다고 표기해주긴 해야함
	public Test(int kor, int eng) throws KoreaException, EnglishException {
		if(kor < 0 || kor > 100) 
			throw new KoreaException("잘못된 국어점수");
		if(eng < 0 || eng > 100)
			throw new EnglishException("잘못된 영어점수");
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "Test [kor=" + kor + ", eng=" + eng + "]";
	}
}
