/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class LiteralDemo2 {
	public static void main(String[] args) {
		System.out.printf("%c", 'A');
		System.out.printf("%c", 66);
		System.out.printf("%c", '\n');	//new line
		System.out.printf("%c", 'C');
		System.out.printf("%c", '\b');	//back space
		System.out.printf("%c", 'C' + 1);	//백스페이스 때문에 커서 있는 곳의 값에 덮어씌움. //cmd에서 정확한 값 나옴
		System.out.printf("%c", '\t');	//tab
		System.out.printf("%c", 'E');
		System.out.printf("%c", '김');
		System.out.printf("%c", '김');
		System.out.printf("%c", '김');
	}
}
