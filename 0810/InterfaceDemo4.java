import java.util.Arrays;

/*
 * Interface활용
 */

public class InterfaceDemo4 {
	public static void main(String[] args) {
//		String [] array = {"Hello", "이미자", "World", "Java", "서울시 강남구 역삼동"};
		Student [] array = {
				new Student("김철수", 286, 95.5),
				new Student("이영희", 295, 98.5),
				new Student("한지민", 275, 91.3)
			};
		
		
//		//Bubble Sort
		for(int i = 0 ; i < array.length -1 ; i++) {					//String클래스 : Comparable의 자식이어서 String도 sorting가능.
			for(int j = 0 ; j < array.length -1 ; j++) {			//compareTo() : String의 앞글자의 차이를 int로 출력
				if(array[j].compareTo(array[j+1]) > 0) {	//j번쨰 문자열이 더 크다면		//문자열은 >, < 연산자 X
					Student temp = array[j];							//오름차순 >
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
				
	}
}
