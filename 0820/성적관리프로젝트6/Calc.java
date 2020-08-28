import java.util.ArrayList;

public class Calc {
	private ArrayList<Student> list;
	
	Calc(ArrayList<Student> list) {
		this.list = list;
	}
	
	void calc() {		//계산할 학생(입력이 된 학생)//주소복사= 알아서 바뀌므로 void
		for(int i = 0 ; i < this.list.size(); i++) {
			Student s = this.list.get(i);
			int tot = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
			double avg = tot / 4.;
			char grade = (avg >= 90)? 'A' :
									(avg >= 80)? 'B' :
										(avg >= 70)? 'C' :
											(avg >= 60)? 'D' : 'F' ;
			s.setTot(tot);   s.setAvg(avg);    s.setGrade(grade);
		}
	}
}