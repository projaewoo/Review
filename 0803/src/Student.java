
public class Student {
//	private int kor;  //�ܺ�Ŭ���������� kor ������  //���� ��������
//	public int getKor() {		//kor���� ��ȯ
//		if(kor >= 0 && kor <= 100)
//			return kor;
//		else return -1;
//	}								//int kor�� �ϸ� ���� //kor = kor���� ��� ���� parameter���� ���� ����
//	public void setKor(int kor) {		//kor���� ����
//		if(kor >= 0 && kor <= 100) this.kor = kor;   //this.kor : 3���� �������  
//		else kor = -1;  												//RValue�� kor : 9���� ��������
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
		this.name = name;		//this.name = 16���� member ���� name //name = 23���� parameter�� name (��������)
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
