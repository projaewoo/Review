/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
//배열 swaping
//int형으로만 비교
public class ArrayDemo9 {
	public static void main(String[] args) {
		Student [] array = {new Student(), new Student(), new Student()};
		//{295, 299, 300}
		array[0].tot = 295;	array[0].name = "김철수";
		array[1].tot = 299;	array[1].name = "이영희";
		array[2].tot = 300;	array[2].name = "한지민";
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length -1; j++) {
				if(array[j].tot < array[j+1].tot) {
					Student temp = array[j];		//주소복사
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(Student s : array) {
			System.out.printf("%s, %d%n", s.name, s.tot);
		}
		/*Student temp = array[0];		//주소복사
		array[0] = array[1];
		array[1] = temp;
		System.out.println(array[0].name);
		System.out.println(array[1].name); */

	}
}
