				
class Friend {		//package 접근 지정자 : Main만 들어오면 됨	//같은 패키지만 접근 가능
	private String name, tel, relation;

	Friend(String name, String tel, String relation) {		//생성자  : 외부에서 호출 못하게 package접근 지정자로
		this.name = name;
		this.tel = tel;
		this.relation = relation;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", name, tel, relation);
	}

	String getName() {		//외부에서 호출 못하게 package접근 지정자로
		return name;
	}
	
	
}
