
public abstract class Mammal {		//추상클래스		//7행에 추상메소드 있어서 추상클래스 됨.
	public String name;
	public Mammal(String name) {
		this.name = name;
	}
	public abstract void print();		//추상 메소드 선언.
}

class Lion extends Mammal {		//일반 클래스
	public Lion(String name) {
		super(name);
	}
	@Override
	public void print() {
		System.out.println("나는 자식의 메소드");
	}
}
