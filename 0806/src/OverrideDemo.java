import java.util.Date;

public class OverrideDemo {
	public static void main(String[] args) {
		//Integer in = new Integer();		//Integer은 기본 생성자 없음
		Integer in = new Integer(100);
		System.out.println(in.toString());			//다 Object들의 자식의 메소드
																	//자식 클래스에 맞게 재정의	//Override는 재정의 안되서 자식 클래스가 마음대로 재정의 가능
		System.out.println(in);				//toString은 생략 가능 //toString 재정의한 클래스의 주소 저장한 참조변수만 호출해도 toString메소드 호출
		
		
		Demo d = new Demo();
		System.out.println(d.toString());		//다 Object들의 자식의 메소드
																//Demo에서 Override안해서 Object의 toString() 출력
		System.out.println(d);
		
		
		Date now = new Date();
		System.out.println(now.toString());		//다 Object들의 자식의 메소드
		System.out.println(now);
	}
}
class Demo extends Object {
	String name = "한지민";
	@Override
	public String toString() {			//Override (재정의)
		//return "이름은 " + this.name + "입니다.";
		return String.format("이름은 %s 입니다.%n", this.name);
	}
}