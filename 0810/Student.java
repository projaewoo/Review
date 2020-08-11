
public class Student implements Comparable<Student>{		//compareTo()사용할 수 있게 해줌
	private String name;															//Student형을 비교한다는 의미
	private int tot;
	private double avg;
	
	public Student(String name, int tot, double avg) {
		this.name = name;
		this.tot = tot;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", tot=" + tot + ", avg=" + avg + "]";
	}

	@Override
	public int compareTo(Student o) {
		//return this.tot - o.tot;			//tot를 기준으로 sort //양수 = 오름차순(this.tot가 크고, 자리를 바꾸므로 오름차순 됨), 음수 = 내림차순
		//return this.name.compareTo(o.name);		//이름을 기준으로 sort		//string이므로 compareTo()로 비교.
		return (int)(this.avg - o.avg);			//평균을 기준으로 sort
	}
	
}
