

public class EnumDemo1 {
	public static void main(String[] args) {
		System.out.println("미국의 25센트 동전의 색깔은 " + getColor(Coin.QUARTER));
		System.out.println("미국의 5센트 동전의 색깔은 " + getColor(Coin.NICKEL));
	}
	static CoinColor getColor(Coin c) {
		switch(c) {
		case PENNY : return CoinColor.COPPER;			//Enum안의 상수 : static 	//따라서 이름으로 접근
		case NICKEL : return CoinColor.NICKEL;
		case DIME :
		case QUARTER : return CoinColor.SILVER;		//DIME, QUARTER : 둘 다 SILVER색
		default : return null;
		}
	}
}
enum Coin {
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
	Coin(int value) {				//생성자
		this.value = value;
	}
	private final int value;		//final : 값 못바꿈
	public int getValue() {
		return this.value;
	}
}
enum CoinColor {
	COPPER, NICKEL, SILVER;
}