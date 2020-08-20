import java.io.File;
import java.io.IOException;

//File클래스 : 파일, 디렉토리(폴더) 처리.
public class FileDemo {
	public static void main(String[] args) {
//		System.out.println(System.getProperty("file.separator"));		//file 구분자
//		System.out.println(File.separator);		//File클래스에도 이 메소드 존재
		//ex)윈도우 구분자 : \ -> C:\temp\result.dat		
		//리눅스, 맥 파일 구분자 : / -> /home/jaewoo/Temp/result.dat
		
		
//		System.out.println(System.getProperty("path.separator"));	//OS에서 사용하는 경로 구분자.
//		System.out.println(File.pathSeparator);		//File클래스에도 이 메소드 존재
		//윈도우즈 경로 구분자 ;		//맥 경로 구분자 :
		//ex) -cp .;C:/temp		//-cp .:/home/jaewoo/Temp
		//나중에 클라우드 사용할때, OS확인 위해 사용
		
		//경로 확인.
		File file = new File("../../JavaHome/0820/src/FileDemo.java");		//.. = 자기 부모 // . = 자기자신
		System.out.println("getName() = " + file.getName());
		System.out.println("getPath() = " + file.getPath());
		System.out.println("getParent() = " + file.getParent());		//이 파일의 상위폴더.
		System.out.println("getAbsolutePath() = " + file.getAbsolutePath());	//파일경로를 위로 갔다가 내려오도록 입력하면 그 경로 그대로 출력.
		try {
			System.out.println("getCanonicalPath() = " + file.getCanonicalPath());	//실질적인 절대경로.(위로 갔다 아래로 내려오는 경로 그대로 출력x)	//Exception처리해줘야함.
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
