//어떤 것이 제일 먼저 메모리에 올라옴??

public class StaticDemo1 {
//	private static int count = getCount();				//a방법.1등(static변수), a방법.3등(count에 100넘겨줌)
	
//	private static int getCount() {						//a방법.2등(static변수가 getCount()호출)
//		System.out.println("나는 static메소드");
//		return 100;
//	}
	
	//자바에서 static초기화 방법
	private static int count;								//b방법.1등
	static {														//b방법.2등 -> main호출
		System.out.println("나는 static블록");
		count = 100;
	}
	
	public static void main(String[] args) {			//a방법.4등   //b방법.3등
		System.out.println("나는 메인 메소드");
		System.out.println("count = " + count);
	}
	
	
	
}
