import java.io.IOException;
import java.io.RandomAccessFile;

//RandomAcccessFile로 읽어들이는 방식
public class RandomAcccessFileDemo {
	public static void main(String[] args) {
		//자기가 자기꺼 읽음
		String path = "./src/RandomAcccessFileDemo.java";
		try(RandomAccessFile raf = 					//AutoCloseable의 자손이므로 try벗어나면 자동으로 닫힘.
				new RandomAccessFile(path, "r")) {		//"r" : read모드(파일로부터 읽기만 수행)
			while(raf.getFilePointer() < raf.length()) {		//현재 포인트 위치 < 파일의 제일 마지막 부분 포인트
				//편한 방식
				String line = raf.readLine();		//한줄 읽음	//한글 처리 X
				line = CharConversion.entoko(line);		//CharConversion의 static메소드 entoko()호출.	(영어 -> 한글로 변환해서 line에 넣음)
				System.out.println(line);
				//이전 방식
//				System.out.print((char)raf.read());	//1byte읽어들어서 출력 //int타입을 반환해서 char로 변환	//14행 진행 안하고, read()만 진행: 한글 깨짐 : 1byte 기준이어서.
//				System.out.println("포인터의 현재 위치 : " + raf.getFilePointer());
			}
		}catch(IOException ex) {
			System.out.println(ex);
		}
		
	}
}//여기가 끝.