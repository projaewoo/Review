import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݵ�� ���� : ");
		String path = scan.next().trim();
		File file = new File(path);
		if(file.exists() && file.isDirectory()) {		//���� ���� && ����������.
			
//			File [] array = file.listFiles(new FilenameFilter() {
//				@Override
//				public boolean accept(File dir, String name) {
//					return name.endsWith(".zip");	//Ȯ���ڰ� .exe�� ���� �͸� ������.
//				}
//			});
			
			//15���� ���ٽ�����
			File [] array = file.listFiles(
					(dir, name) -> name.endsWith(".zip")	//Ȯ���ڰ� .exe�� ���� �͸� ������.
					);
			
			for(int i = 0 ; i < array.length; i++) {									
				Date lastmodified = new Date(array[i].lastModified());		//array[i].lastModified() : long������ ��ȯ.	//������ ���������� ������ �ð��� ��ȯ. (1970�� 0�� 0�Ϸκ��� )
				//System.out.println(lastmodified);
				String pattern = "yyyy-MM-dd  aa hh:mm\t";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);			//SimpleDateFormat ������ : String
				System.out.println(sdf.format(lastmodified));
				if(array[i].isDirectory()) 	System.out.printf("%-15s", "<DIR>");
				else if(array[i].isFile())		System.out.printf("%,15d", array[i].length());
				System.out.println("\t" + array[i].getName());
			}
		}else {
			System.out.println("��û�Ͻ� ��ο� ������ ���ų� ������ �ƴմϴ�.");
			System.exit(-1);
		}
	}
}
