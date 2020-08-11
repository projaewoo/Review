
public class Student implements Comparable<Student>{		//compareTo()����� �� �ְ� ����
	private String name;															//Student���� ���Ѵٴ� �ǹ�
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
		//return this.tot - o.tot;			//tot�� �������� sort //��� = ��������(this.tot�� ũ��, �ڸ��� �ٲٹǷ� �������� ��), ���� = ��������
		//return this.name.compareTo(o.name);		//�̸��� �������� sort		//string�̹Ƿ� compareTo()�� ��.
		return (int)(this.avg - o.avg);			//����� �������� sort
	}
	
}
