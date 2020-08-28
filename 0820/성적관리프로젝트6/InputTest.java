import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class InputTest {
	private Input input;
	private ArrayList<Student> list;
	
	@Before		//�� �׽�Ʈ ������ �����ؾ��� ����
	public void init() {
		this.list = new ArrayList<Student>(3);		//Before�� ������ ArrayList������.	//3���� ���� ä�����°� 12��
		this.input = new Input(list);
		this.input.input();
	}
	
	@Ignore @Test				//@Test : �׽�Ʈ �ؾ��� ����		//@Ignore : ���̻� �׽�Ʈ ���ص� ��.
	public void test() {
		assertNotNull(this.input);		//inputŬ������ null�� �ƴ��� ����.
	}
	@Ignore @Test
	public void test1() {
		assertEquals(12, this.list.size());		//12�� ����, ���� �����
	}
	@Ignore @Test
	public void test2() {
		assertEquals("�Ѽ���", this.list.get(0).getName()); 	//list�� 0��° �л��� �̸��� "�Ѽ���"�� ��ġ?
	}
	@Ignore @Test
	public void test3() {
		assertEquals(89, this.list.get(11).getKor());			//11��° �л��� ���������� 89�� ����?
	}
	@Test
	public void test4() {
		Calc calc = new Calc(this.list);		//���� ��Ű���� ���ٰ���
		calc.calc(); 	//��� ��.
		Student s = this.list.get(0);
		int tot = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
//		assertEquals(326, tot);		//������ ����ؼ� 326����
//		assertEquals(326, s.getTot());
		assertEquals('B', s.getGrade());
	}
}