

public enum Week {
	SUN(0), MON(100), TUE(101), WED(1000), THU(1001), FRI(10000), SAT(50000);
	private int value;
	
//	//public Week(int value) {		//class 생성자.
//		this.value = value;
//	}
	Week(int value) {			//Enum생성자	//SUN이 스스로 0넣음
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
