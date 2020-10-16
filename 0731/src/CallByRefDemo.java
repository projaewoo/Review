
public class CallByRefDemo {
	public static void main(String[] args) {
		String str = "Hello";
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("수정 전");
		System.out.println("str = " + str + ", sb =" + sb.toString());
		change(str, sb);		//Call By Reference //주소가 넘어가서
		System.out.println("수정 후");
		System.out.println("str = " + str + ", sb =" + sb.toString());
	}
	static void change(String str, StringBuffer sb) {
		str += ", World";			//String이어서 +로 뒤에 붙임
		sb.append(", World");		//뒤에 붙이는 메소드
		System.out.println("함수에서");
		System.out.println("str = " + str + ", sb =" + sb.toString());
	}
}
