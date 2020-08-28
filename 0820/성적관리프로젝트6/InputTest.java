import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class InputTest {
	private Input input;
	private ArrayList<Student> list;
	
	@Before		//이 테스트 이전에 실행해야할 내용
	public void init() {
		this.list = new ArrayList<Student>(3);		//Before가 끝나면 ArrayList생성됨.	//3개를 만들어도 채워지는건 12개
		this.input = new Input(list);
		this.input.input();
	}
	
	@Ignore @Test				//@Test : 테스트 해야할 내용		//@Ignore : 더이상 테스트 안해도 됨.
	public void test() {
		assertNotNull(this.input);		//input클래스가 null이 아님을 보장.
	}
	@Ignore @Test
	public void test1() {
		assertEquals(12, this.list.size());		//12개 예상, 실제 사이즈값
	}
	@Ignore @Test
	public void test2() {
		assertEquals("한송이", this.list.get(0).getName()); 	//list의 0번째 학생의 이름이 "한송이"와 일치?
	}
	@Ignore @Test
	public void test3() {
		assertEquals(89, this.list.get(11).getKor());			//11번째 학생의 국어점수가 89와 같음?
	}
	@Test
	public void test4() {
		Calc calc = new Calc(this.list);		//같은 패키지라 접근가능
		calc.calc(); 	//계산 끝.
		Student s = this.list.get(0);
		int tot = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
//		assertEquals(326, tot);		//실제로 계산해서 326넣음
//		assertEquals(326, s.getTot());
		assertEquals('B', s.getGrade());
	}
}