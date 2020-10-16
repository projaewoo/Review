
public class Student {
//	private int kor;  //외부클래스에서는 kor 못읽음  //나의 국어점수
//	public int getKor() {		//kor점수 반환
//		if(kor >= 0 && kor <= 100)
//			return kor;
//		else return -1;
//	}								//int kor로 하면 오류 //kor = kor에서 어느 쪽이 parameter인지 구분 못함
//	public void setKor(int kor) {		//kor점수 세팅
//		if(kor >= 0 && kor <= 100) this.kor = kor;   //this.kor : 3행의 멤버변수  
//		else kor = -1;  												//RValue의 kor : 9행의 지역변수
//	}
//	public void print() {
//		System.out.println(this);
//	}
	private String name, hakbun;
	private int kor, eng, mat, tot;
	private double avg;
	private char grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;		//this.name = 16행의 member 변수 name //name = 23행의 parameter의 name (지역변수)
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
