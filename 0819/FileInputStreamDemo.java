import java.io.BufferedInputStream;		//AutoCloseable의 자식이므로 굳이 안닫아줘도 됨.
import java.io.FileInputStream;
import java.io.IOException;

//보조 스트림 사용
//자기가 자기 파일 읽어들임.
public class FileInputStreamDemo {
	public static void main(String[] args) {
		String path = "./src/FileInputStreamDemo.java";	
		try (BufferedInputStream bis = 			//빨대 연결		//버퍼 생성자 (InputStream) //따라서 InputStream의 자식인 File스트림 넣음.
				new BufferedInputStream(new FileInputStream(path))){		//BufferInputStream닫았으므로 FileInputStream닫을 필요 없음.  //AutoCloseable의 자식은 try벗어나면 자동으로 닫힘
			byte [] buffer = new byte[1024];	//1024씩 채워서 출발
			int count = 0;		//읽어들인 횟수
			while( (count = bis.read(buffer)) >= 0) {			//몇 바이트 읽어들여야하는지 몰라서 while사용.	//음수 되면 읽어들여야할 byte더 이상 없음
				System.out.println(new String(buffer, 0, count));		//읽어들일 byte길이가 500이라면 0~500만 읽어야함. count = 500;
			}
		} catch (IOException ex) {			//자바 : OS에게 요청해서 파일경로 읽어달라고 요청. OS가 HDD에서 읽어서 메모리에 갖다놓기 전까지, Java는 Blocked상태. //OS가 입력버퍼에 갖다 놓으면 자바는 InputStream으로 읽음.
			System.out.println(ex);			
		}
		
	}
}
//14행 : 1024 꽉 채워서 그 채운만큼 15행 출력, 그 다음 1024 꽉채워서 채운만큼 15행 출력, 나머지 1024보다 작은 바이트 남았을 때, 읽고 그만큼 15행으로 출력.
//		다 읽었을 때 읽을 바이트 없거나 음수임. 따라서 끝.