
public class Initialized {
	private int x; // = 5; --> 명시적 초기화		//member변수여서 접근하려면 주소필요
	private String name; // = "Fred";
	
	public Initialized() {}			//기본 생성자 (디폴트 생성자)
																		
	public Initialized(int x, String name) {		//생성자 통한 초기화  //기본생성자가 아닌 일반 생성자
		this.x = x;   this.name = name;			
	}
	public Initialized(int x) {			//생성자의 오버로딩  //parameter달라서 가능
		this.x = x;
	}
	public Initialized(String name) {		//생성자의 오버로딩
		this.name = name;
	}
	
	public static void main(String[] args) {
		Initialized in = new Initialized("한지민");			//언제든지 member변수 값 바꿀 수 있음
		System.out.println(in.x);
		System.out.println(in.name);
		
	}
}
