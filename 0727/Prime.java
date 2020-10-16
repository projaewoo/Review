/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

//2 ~ i ~ 200
//2 ~ j ~ i : i를 계속 나눠서 소수인지 판단
//소수이면 i보다 1 작은 값이 j가 될때까지도 안나눠짐
//소수가 아니라면 

public class Prime {
	public static void main(String[] args) {
		int prime = 2;
		for(int i = 2 ; i <= 200 ; i++) {
			for(int j = 2 ; j <= i ; j++) {
				
			}
			System.out.print(prime + "  ");
		}

	}
}
