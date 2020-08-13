
public class GenericDemo {
	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>(10);		//<>�ȿ� WrapperŬ������	//20���� T -> Integer�� ��ȯ.
		int su = d.getCount();
		d.setCount(100);
		
		Demo <Double> d1 = new Demo<Double>(89.5);	//Double������ ���ʸ����� ��ȯ	//T -> Double
		double avg = d1.getCount();
		d1.setCount(90.5);
		
		Demo<String> d2 = new Demo<String> ("Hello");	//T -> String			//Number�� �ڽ� �߿� String�� ��� ERROR
		String str = d2.getCount();
		d2.setCount("World");
	}
}
//�Ϲ� class ����
//class Demo {				//���������� �� count�� ������ ����	= �������� �ް�, �������� �Ѱ���
//	private int count;
//	
//	public Demo(int count) {		//������ ���ؼ� member���� �ʱ�ȭ
//		this.count = count;
//	}
//	public int getCount() { return this.count; }
//	public void setCount(int count) { this.count = count; }
//}


//Generic���� ����,
class Demo <T extends Number>{				//�Ϲ�ȭ�� Demo(Genericȭ�� Demo) //<T> : �󺧸�	//������ �Ҷ�, T�� Ÿ�� �Ѿ.		//Number : ���� = Number�� �ڽĸ� �޾�.
	private T count;			//private Integer count = 10;		-> boxing -> private Integer count = new Integer(10); 
	
	public Demo(T count) {		//������ ���ؼ� member���� �ʱ�ȭ
		this.count = count;
	}
	public T getCount() { return this.count; }		//count.intValue()  <- autoUnboxing
	public void setCount(T count) { this.count = count; }
}