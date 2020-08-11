
public class InterfaceDemo2 implements Father, Mother{
	@Override
	public void father() {System.out.println("Called by Father");}
	public void mother() {System.out.println("Called by Mother");}
	public void grandFather() {System.out.println("Called by GrandFather");}
	public void grandMother() {System.out.println("Called by GrandMother");}
	
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather();		//다형성 //선언 : 할아버지, 실제 : 손자	//할아버지 주소로 할아버지 메소드만 접근가능
		//gf.grandMother();		//ERROR	//재정의되지 않은 메소드는 사용X
		
		//GrandMother gm = new GrandMother(); 	//ERROR 	//interface여서
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMother gm = id;				//interface생성
		gm.grandMother();
		
		Father fa = new InterfaceDemo2();
		fa.grandMother();
		fa.grandFather();		//Interface형 주소는 본인의 추상메소드를 재정의한 메소드만 접근가능.		
		fa.father();				//상속받은 interface형 주소 : 상속한 interface의 메소드도 접근가능.
		
		System.out.println(Father.PI);		//public static final상수여서 충돌X
		System.out.println(Mother.PI);
		
		Mother [] array = new Mother[2];		//interface인 Mother의 자식이 들어올 수 있는 배열
		array[0] = id;										//선언 : 부모형, 실제 : 자식형
		array[1] = new InterfaceDemo2();		//선언 : 부모형, 실제 : 자식형
		for(Mother m : array) {			//선언 : 부모형, 실제 : 자식형
			m.mother();
		}
		
	}
}
