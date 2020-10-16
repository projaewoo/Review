/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/

public class LabelBreakContinueDemo {
	public static void main(String[] args) {
		/*outer :		//Label  (:이 붙으면 라벨) (switch에서도 사용)
		for(int i = 1 ; i < 101 ; i++) {
			inner :		//Label
			for(int j = 65 ; j < 90 ; j++) {
				//if(i == 10) break; (안에 (inner)가 숨어져 있음)   //i가 10일때만 건너뛰고 다시 i = 11일때 진행
				if(i == 10) break outer;		//i는 10만났을 때 i = 11진행 안하고 아예 끝
				//if(i == 10) continue;  //inner의 for문 j++로 감
				//if(i == 10) continue outer;  //outer의 for문 i++로 감
			}

		}*/

		outer :
			for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if(j==5)
//						break outer;	//i마저 그만둠 //3단 안나옴
//						break;			//j가 5일때 안쪽 for벗어남
//						continue outer;		//2 * 5 되는 순간 출력 안하고, 바깥쪽 i++증감식으로
//						continue;		//j가 5일때만 밑에 출력창 건너뛰고, 가까운 쪽의 j++증감식으로 //2 * 5, 3 * 5, 4 * 5, ... 건너뛰고 계속 진행
					System.out.print(i+"*"+ j +"="+ i*j + "   ");
				} // end of for i
				System.out.println();
		} // end of outer



	}
}
