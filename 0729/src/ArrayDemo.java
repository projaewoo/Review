/*
�ۼ��� : 
�ۼ����� : 
�ۼ��Ͻ� : 
�ۼ�ȯ�� : 
*/
//java ArrayDemo 5 + 2
public class ArrayDemo {
	public static void main(String[] array) {
		if(array.length != 3) {	//���׿��� ���ߴٸ�
			System.out.println("Invalid Option");
			System.exit(-1);			//������ ���α׷� ����  //0������ �������� //1������ ������ ����
		}
		int first = Integer.parseInt(array[0]);		//"5" --> 5
		String op = array[1];
		int second = Integer.parseInt(array[2]);		//"2" --> 2
		int result = 0;
		switch(op) {
			case "+" : 
				result = first + second;
				break;
			case "-" : 
				result = first - second;
				break;
			case "x" : 
				result = first * second;
				break;
			case "/" : 
				result = first / second;
				break;
			case "%" : 
				result = first % second;
				break;
			default : 
				System.out.println("Invalid Operator");
				System.exit(-1);
		}
		System.out.printf("%d %s %d = %d%n", first, op, second, result);
	}
}
