//Flag Interface

public interface InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo(24);
		//Demo other = d;					//객체 복사. (주소복사)
		//객체 복제 (똑같은 것 2개) = (방이 2개) = 값 복사.
		Demo other = (Demo)d.copy();			//넘어오는게 Object형이므로 Demo형으로 강제 형변환
	}
}											//implements Cloneable : Demo가 cloneable되는걸 알려주는 역할만.
class Demo extends Object implements Cloneable {
	public int age;
	public Demo(int age) {this.age = age;}
	public Object copy() {
		//Demo d = this.clone();			//Object형으로 복제를 해서 ERROR
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {		//복제 실패하면
			System.out.println("복제에 실패했습니다.");
		}			
		return obj;
	}
}