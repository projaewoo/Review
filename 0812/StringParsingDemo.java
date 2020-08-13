import java.io.File;
import java.util.Scanner;

/*
 * ���ڿ� �Ľ�
	1. String class�� split()
	2. java.util.StringTokenizer class
	3. java.util.Scanner class
 */
public class StringParsingDemo {
	public static void main(String[] args) throws Exception{
		String str = "        2    422-5123   ������    1084   ";
//		split() ���
		//���� : ���Խ� �˾ƾ���. 		//���� : �ڵ����� �迭 ����, �ڵ� �ʱ�ȭ.
//		String [] array= str.trim().split("\\s+");			// ���Խ� \s+ : ��ĭ �̻��� �����̽���	// '\'�ϳ��� ������ �ڹٴ� Ư�����ڷ� ���� ���� "\\" �ΰ� ���.
//							//trim() : 2 ���� ����,  1084 ���� ���� �ڸ�		//split : StringŬ������ member�޼ҵ� -> �ּҷ� ����
//		System.out.println(array.length);
		
		
		//StringTokenizerŬ���� ���
		//���� : ���Խ� ���� �˾Ƽ� �߶���	//���� :  �迭 ���� ����, ���� �ʱ�ȭ
//		StringTokenizer st = new StringTokenizer(str.trim());
//		String [] array = new String [st.countTokens()];	//tokenizer�� �ڸ��� �� = ��ū ����
//		int index = 0;		//�ʱ�ȭ
//		while(st.hasMoreTokens()) {		//trim���� Ŀ�� 2 �տ� ���� -> ���� ��ū ������ (2����) -> true -> 
//			array[index] = st.nextToken();	//-> ��ū(2, 422-5123, ������, ...)�� �迭�� �־����
//			index++;
//		}
//		System.out.println(array[1]);
		
		
		//ScannerŬ���� ���
		//���� : ����ǥ���� �˾ƾ���, �迭 ���� ����, �ʱ�ȭ	//���� : ���ڿ� �´� Data type���� ���� �� ����, Fileó���� Ưȭ�Ǿ� ����
//		Scanner scan = new Scanner(str.trim());		//"2     422-5123    ������   1084"
//		Scanner other = scan.useDelimiter("\\s+");	//Delimiter : ������		//other : �߶��� ���ڿ�
//		System.out.println(other.nextInt());		//Data type���� ���� �� ����
//		System.out.println(other.next());			//422-5123 : string
//		System.out.println(other.next());			//������ : string
//		System.out.println(other.nextInt());		//1084 : int
		
		//�迭 �����
//		String [] array = new String[100];
//		int index = 0;
//		while(other.hasNext()) {			//other�� ���� ��ū�� ����? -> true or false
//			array[index] = other.next();		//���� ��ū�� �迭�� index��°�� ����
//			index++;
//		}
//		for(int i = 0 ; i < index; i++) {
//			System.out.println(array[i]);
//		}
		
		//���ϴ����� �б�
		//Scanner scan = new Scanner("C:/temp/data.txt");	//"C:/temp/data.txt" -> ���ڿ��� ����. ���Ϸ� �ν� X

		File file = new File("C:/temp/data.txt");
		Scanner scan = new Scanner(file);				//���Ϸ� �ν�
		int sum = 0;
		while(scan.hasNextInt()) {		//while : ���� �� �� ������ ���.	//���� ������ ����������
			//System.out.println(scan.nextLine());				//�� �پ� ����.	(�� �ٿ� �������� ��ū ������ִ� ���)
			sum += scan.nextInt();
		}
		System.out.println(sum);
	}
}
