/*
작성자 : 
작성목적 : 
작성일시 : 
작성환경 : 
*/
import java.util.Arrays;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student [] array;   //선언
		array = new Student[2];
		
		array[0] = new Student();
		array[0].name = "김철수";
		array[0].kor = 80;
		array[0].eng = 87;
		array[0].mat = 96;

		array[1] = new Student();
		array[1].name = "이영희";
		array[1].kor = 90;
		array[1].eng = 95;
		array[1].mat = 89; 

		//for(int i = 0; i < array.length ; i++)  //0~length까지
			for(Student std : array) {		//학생 끌어내야해서 Student  //array의 처음부터 끝까지 Student의 std에 대입
				std.tot = std.kor + std.eng + std.mat;
				std.avg = std.tot / 3.;
			}

			//System.out.println(Arrays.toString(array));
			for(int i = 0; i < array.length; i++) {
				System.out.printf("%s, %d, %d, %d, %d, %.1f%n",
					array[i].name, array[i].kor, array[i].eng, array[i].mat, array[i].tot, array[i].avg);
			}
	}
}
