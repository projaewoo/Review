
public class EncapDemo1 {
	public static void main(String[] args) {
		Student chulsu = new Student();
//		System.out.println(chulsu);
//		chulsu.print();
		chulsu.setKor(100);
		int kor = chulsu.getKor();
		if(kor > 0) System.out.println("국어점수 = " + kor);
		else System.out.println("잘못된 국어점수");
	}
}