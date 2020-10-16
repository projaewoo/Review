/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ForDemo4  {
	public static void main(String[] args) {
		String [] fruits = {"사과", "딸기", "포도", "수박", "복숭아"};
		//for(int i = 0 ; i < 5 ; i++) {
		//	System.out.println("fruits[" + i + "] = " + fruits[i]);
		//}
		for(String myvalue: fruits) {
			System.out.println(myvalue);
		}


	}
}
