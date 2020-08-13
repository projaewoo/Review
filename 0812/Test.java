
public class Test {
	private int kor, eng;
											//KoreaException = �ʼ� ���� = �޼ҵ� ����ο� ǥ���������.	//English�� �����ٰ� ǥ�����ֱ� �ؾ���
	public Test(int kor, int eng) throws KoreaException, EnglishException {
		if(kor < 0 || kor > 100) 
			throw new KoreaException("�߸��� ��������");
		if(eng < 0 || eng > 100)
			throw new EnglishException("�߸��� ��������");
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "Test [kor=" + kor + ", eng=" + eng + "]";
	}
}
