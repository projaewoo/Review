
public class ExceptionDemo6 {
	public static void main(String[] args) {
		Test t = null;	//Exception의 자손 : korea //따라서 try-catch로 예외처리해야함.
		try {
			t = new Test(101, 990);			//예외발생하면 생성 안하고 t = null상태에서 catch로 감.
		} catch (EnglishException | KoreaException e) {	//먼저 들어온 korea만 예외처리	//korea가 checked, 따라서 가장 우선적으로 처리
			System.out.println(e.getMessage());
		}
		System.out.println(t);
	}
}
