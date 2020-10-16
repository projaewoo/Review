/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ParseDemo {
	public static void main(String[] args) {
		//String str = "128";	//string이어서 글자
		//int su = Integer.parseInt(str, 16);	//글자128을 16진수 숫자 128로
		//System.out.printf("su = %x\n", su);
		int su = 128;
		//String str = "" + su;		//"128" //string특성상 한쪽만 string이면 나머지도 string으로 변환
		//String str = String.valueOf(su);		//"128"	
		String str = Integer.toString(su, 16);		//16진수로 바꿔서 문자열로
		System.out.printf("str = %s\n", str);
	}
}
