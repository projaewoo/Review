/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
//java ArrayDemo 5 + 2
public class ArrayDemo {
	public static void main(String[] array) {
		if(array.length != 3) {	//이항연산 안했다면
			System.out.println("Invalid Option");
			System.exit(-1);			//강제로 프로그램 종료  //0들어오면 정상종료 //1들어오면 비정상 종료
		}
		int first = Integer.parseInt(array[0]);		//"5" --> 5
		String op = array[1];
		int second = Integer.parseInt(array[2]);		//"2" --> 2
		int result = 0;
		switch(op) {
			case "+" : 
				result = first + second;
				break;
			case "-" : 
				result = first - second;
				break;
			case "x" : 
				result = first * second;
				break;
			case "/" : 
				result = first / second;
				break;
			case "%" : 
				result = first % second;
				break;
			default : 
				System.out.println("Invalid Operator");
				System.exit(-1);
		}
		System.out.printf("%d %s %d = %d%n", first, op, second, result);
	}
}
