/*
�ۼ��� : wjdwodn0828@naver.com
�ۼ����� : literal ����
�ۼ��Ͻ� : 2020.7.17
�ۼ�ȯ�� : Windows 10, OpenJDK 14.0.2, EditPlus 5.3
*/
/*
	Literal
	1. ������ Literal : + -��ȣ, 24(10����), 24L, 0234(8����), 0xABCD(16����), 0b0111001(2����)
	2. �Ǽ��� Literal : + -��ȣ, 3.14(�Ǽ������� �������е� ������ 8byte), 3.14f(�������е� ������ 4byte), 3.14e-2(������ ������), 
	3. ������ Literal : 'A'(���ڵ�����), '\n'(escape sequence, Ư������)
	4. ���ڿ��� Literal : "A", "������ ���ﵿ �ѵ�����"
	5. Boolean�� Literal : true, false
*/
public class LiteralDemo {
	public static void main(String[] args) {
		//�������(��� format)
		//System.out.printf("�������", ��´��)
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
