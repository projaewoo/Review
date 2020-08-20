import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반드시 폴더 : ");
		String path = scan.next().trim();
		File file = new File(path);
		if(file.exists() && file.isDirectory()) {		//폴더 존재 && 폴더여야함.
			
//			File [] array = file.listFiles(new FilenameFilter() {
//				@Override
//				public boolean accept(File dir, String name) {
//					return name.endsWith(".zip");	//확장자가 .exe로 끝난 것만 보여줌.
//				}
//			});
			
			//15행을 람다식으로
			File [] array = file.listFiles(
					(dir, name) -> name.endsWith(".zip")	//확장자가 .exe로 끝난 것만 보여줌.
					);
			
			for(int i = 0 ; i < array.length; i++) {									
				Date lastmodified = new Date(array[i].lastModified());		//array[i].lastModified() : long형으로 반환.	//파일의 마지막으로 수정된 시간을 반환. (1970년 0월 0일로부터 )
				//System.out.println(lastmodified);
				String pattern = "yyyy-MM-dd  aa hh:mm\t";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);			//SimpleDateFormat 생성자 : String
				System.out.println(sdf.format(lastmodified));
				if(array[i].isDirectory()) 	System.out.printf("%-15s", "<DIR>");
				else if(array[i].isFile())		System.out.printf("%,15d", array[i].length());
				System.out.println("\t" + array[i].getName());
			}
		}else {
			System.out.println("요청하실 경로에 폴더가 없거나 폴더가 아닙니다.");
			System.exit(-1);
		}
	}
}
