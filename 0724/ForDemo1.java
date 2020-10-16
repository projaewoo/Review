/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class ForDemo1 {
	public static void main(String[] args) {
		int i = 1;									//main의 지역변수(i)가 for벗어나도 i 살아있음
		for( /*int i = 1 */; i < 11 ; /* i++ */) {			//for을 벗어나면 i 없어짐 // i : for문의 지역변수
			System.out.printf("%5d", i);		//5칸 확보해서 저절로 띄어쓰기
			i++;					//증감치가 for문 안에 있어도 됨
		}
		System.out.println("\ni = " + i);

		//x는 1부터 100까지 3씩 증가하고, y는 100부터 2씩 감소.
		//언젠가 x와 y는 교차될 것이다.
		//교차될 때의 x와 y의 값은?
		int x, y;		//선언
		for(x = 1, y = 100 ; x < 101 ; x += 3, y -= 2) {	//초기식에 int x, y선언하면 for문 벗어나면 없어짐. 따라서 초기치를 for밖에서 선언
			if(x > y) break;  //x > y일때 for를 벗어난다는 뜻
		}
		System.out.printf("x = %d, y = %d\n", x, y);

	}
}
