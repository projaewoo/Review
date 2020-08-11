import kr.co.sist.libs.Student;

/*
 * Main이 Employee 클래스를 찾는 방법
 * 1. 동일 폴더(패키지)에서 찾음.	(default package에서 찾음)
 * 2. classpath에서 찾음.  (1에서 없으면)
 * 3. JRE System Library에서 찾음 (1, 2에서 없으면)
 * 			//우리가 만든 Employee클래스를 JRE의 jar파일로 만들면 됨
 * 4. Referenced 라이브러리에서 찾음
 */

//import kr.co.sist.libs.Student;		//첫번째 방법
//import kr.co.sist.libs.*;				//두번째 방법

public class Main extends Student{
	public static void main(String[] args) {
		//3번째 방법
		//FQN(Fully Qualified NAme, 전체경로)방법
		//kr.co.sist.libs.Student chulsu = new kr.co.sist.libs.Student();
		//Student chulsu = new Student();
		//chulsu.
		//상속 : 자식의 이름으로
		//Main m = new Main();
		//m.avg;
	}
}
