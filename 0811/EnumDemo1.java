

public class EnumDemo1 {
	public static void main(String[] args) {
		System.out.println("�̱��� 25��Ʈ ������ ������ " + getColor(Coin.QUARTER));
		System.out.println("�̱��� 5��Ʈ ������ ������ " + getColor(Coin.NICKEL));
	}
	static CoinColor getColor(Coin c) {
		switch(c) {
		case PENNY : return CoinColor.COPPER;			//Enum���� ��� : static 	//���� �̸����� ����
		case NICKEL : return CoinColor.NICKEL;
		case DIME :
		case QUARTER : return CoinColor.SILVER;		//DIME, QUARTER : �� �� SILVER��
		default : return null;
		}
	}
}
enum Coin {
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
	Coin(int value) {				//������
		this.value = value;
	}
	private final int value;		//final : �� ���ٲ�
	public int getValue() {
		return this.value;
	}
}
enum CoinColor {
	COPPER, NICKEL, SILVER;
}