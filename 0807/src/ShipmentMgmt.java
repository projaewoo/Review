
public class ShipmentMgmt extends BoxWeight{
	private int cost;			//member����

	public ShipmentMgmt(int lengh, int width, int height, int weight, int cost) {
		super(lengh, width, height, weight);
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		ShipmentMgmt sm = new ShipmentMgmt(10, 20, 30, 100, 1000);
		System.out.println("����, �ʺ�, ����, ����, ����");
		System.out.println(sm.toString() + ", cost = " + sm.cost);		//���� Ŭ�����̳� private�������� �ּҷ� ����
	}
}
