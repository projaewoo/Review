/*
작성자 : wjdwodn0828@naver.com
작성목적 : literal 연습
작성일시 : 2020.7.17
작성환경 : Windows 10, OpenJDK 14.0.2, EditPlus 5.3
*/
/*
	Literal
	1. 정수형 Literal : + -기호, 24(10진수), 24L, 0234(8진수), 0xABCD(16진수), 0b0111001(2진수)
	2. 실수형 Literal : + -기호, 3.14(실수데이터 이중정밀도 데이터 8byte), 3.14f(단일정밀도 데이터 4byte), 3.14e-2(지수형 데이터), 
	3. 문자형 Literal : 'A'(문자데이터), '\n'(escape sequence, 특수문자)
	4. 문자열형 Literal : "A", "강남구 역삼동 한독빌딩"
	5. Boolean형 Literal : true, false
*/
public class LiteralDemo {
	public static void main(String[] args) {
		//출력형식(출력 format)
		//System.out.printf("출력형식", 출력대상)
		/*System.out.printf("%d\n", -24);
		System.out.printf("%o\n", -24);
		System.out.printf("%x\n", -24);
		System.out.println(Integer.toBinaryString(-24));
		System.out.println("----------------------------");
		System.out.printf("%d\n", -0244);
		System.out.printf("%o\n", -0244);
		System.out.printf("%x\n", -0244);
		System.out.println(Integer.toBinaryString(-0244));
		System.out.println("----------------------------");
		System.out.printf("%d\n", -0xCAFE);
		System.out.printf("%o\n", -0xCAFE);
		System.out.printf("%x\n", -0xCAFE);
		System.out.println(Integer.toBinaryString(-0xCAFE)); */
		
		/*System.out.printf("%d\n", 0b0001111);
		System.out.printf("%o\n", 0b0001111);
		System.out.printf("%x\n", 0b0001111);
		System.out.printf(Integer.toBinaryString(0b0001111));*/
		//System.out.println(Integer.toBinaryString(-24));
		//System.out.println(Long.toBinaryString(-24L));

		System.out.printf("%o\n", 24);
		System.out.printf("%#o\n", 24);
		System.out.println(Integer.toOctalString(24));

	}
}
