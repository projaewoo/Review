
public class ExceptionDemo2 {
	public static void main(String[] args) throws Exception {
//		Student chulsu = new Student(80);	//ERROR //���� exception�� �ȹ޾Ƽ� ���� //catch�ȽἭ ����
//		System.out.println(chulsu);
		
		//"5" --> 5
//		int su = Integer.parseInt("hello");		//parseInt()�� throws NumberFormatException. (=�θ���� RuntimedException =Unchecked =try-catch�Ƚᵵ ��)
//		System.out.printf("su = %d", su);
		
		//try-catch���
//		Student chulsu;		//����
//		try {												//STdudent���� Excpetion���� = checked -> try-catch����ؾ���
//			chulsu = new Student(110);
//			System.out.println(chulsu);
//		}catch(Exception ex) {			//Student�����ڿ��� ���� Exception�� ����.
//			System.out.println(ex);
//		}
		
		//main�� ������ ���(å�� ����)		//main�� �ȹް� ���� (JVM����)
//		Student chulsu = new Student(101);
//		System.out.println(chulsu);
		
		//koreanException�� ����
		Student chulsu = null;
		try {
			chulsu = new Student(110);
		} catch (KoreaException ex) {			//korea = checked = �� koreaException���� �޾������ //unchecked�� ���ָ� ���� ���� 
			System.out.println(ex.getMessage());		//KoreaException -> Exception -> Throwable�������̽� (���⿡ getMessage()�޼ҵ� ���Ե�)
		}																	//���� KoreaException�� �Ҿƹ��� �������̽��� �޼ҵ带 ���.
		System.out.println(chulsu);
	}
}
class Student {
//	private int kor, eng;
//	//member���� : ������ ���ؼ� �ʱ�ȭ							//Exception ������ ��밡��.
//	public Student(int kor, int eng) throws ClassCastException, NullPointerException, ArithmeticException{			//�� �޼ҵ忡�� Exception�����ٴ� ǥ��		//���߿� �� Exceptionó���ؾ���.		//�� Exception -> checked�� �ݵ�� try-catch�����		
//		if(kor < 0 || kor > 100) throw new ClassCastException("�߸��� ���������Դϴ�.\nȮ���� �ٽ� �Է����ּ���.");															//unchecked�� ���� try-catch�Ƚᵵ ��.
//		else if(this == null) throw new NullPointerException("���� Null�Դϴ�.");
//		else if(kor == 0) throw new ArithmeticException("0�� �Ǹ� �ȵ˴ϴ�.");
//		else this.kor = kor;
//	}

	//KoreanException�� ����
	private int kor;
	
	public Student(int kor) throws KoreaException{		//checked���� �� throws ǥ���������. //unchecked�� ���� ǥ����ص� �Ǳ� ��
		if(kor < 0 || kor > 100) throw new KoreaException("���������� 0���� 100������ �Դϴ�.");		//���ڿ��� message�� �ް�, �θ� �޾Ƽ� getMessage�� ����
//		if(eng < 0 || eng > 100) throw new EnglishException("���������� 0���� 100�������Դϴ�.");
		this.kor = kor;
//		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return String.format("�������� = %d", this.kor);
	}
	
}