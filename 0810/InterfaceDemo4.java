import java.util.Arrays;

/*
 * InterfaceȰ��
 */

public class InterfaceDemo4 {
	public static void main(String[] args) {
//		String [] array = {"Hello", "�̹���", "World", "Java", "����� ������ ���ﵿ"};
		Student [] array = {
				new Student("��ö��", 286, 95.5),
				new Student("�̿���", 295, 98.5),
				new Student("������", 275, 91.3)
			};
		
		
//		//Bubble Sort
		for(int i = 0 ; i < array.length -1 ; i++) {					//StringŬ���� : Comparable�� �ڽ��̾ String�� sorting����.
			for(int j = 0 ; j < array.length -1 ; j++) {			//compareTo() : String�� �ձ����� ���̸� int�� ���
				if(array[j].compareTo(array[j+1]) > 0) {	//j���� ���ڿ��� �� ũ�ٸ�		//���ڿ��� >, < ������ X
					Student temp = array[j];							//�������� >
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
				
	}
}
