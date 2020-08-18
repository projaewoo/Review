import java.io.FileInputStream;
import java.io.IOException;

//한글이 잘 되나요?
//java.io는 생성자 싸움이다. 생성자는 곧 String open이기 때문.
//생성자를 잘 사용해서 터널을 뚫음

//InputStream의 한글 읽어들이는 원리가 IODemo1이므로 InputStream의 자식인 FileInputStream도 동일한 원리.

public class FileInputStreamDemo {
	 public static void main(String[] args) {
		 FileInputStream fis = null;
		 int su = 0;
		 byte[] buffer = new byte[32];		//32byte = 16글자	//16글자 초과되도 여러번 왔다갔다 하면 됨.
		 int count = 0;
		try {
			fis = new FileInputStream("./src/FileInputStreamDemo.java");				//HDD에서 메모리까지 빨대 연결.	//file입력
			
			//byte배열 사용 안하면
//			while((su = fis.read()) >= 0) {		//read()는 int반환							//연결된 빨대 통해서 읽어들임
//				System.out.print((char)su);			//표준입력 빨대로 읽어들이나 1byte밖에 못읽어서 한글 X
//			}
			
			//byte배열 사용
			while((count = fis.read(buffer)) > 0) {
				System.out.println(new String(buffer, 0, count));
			}
		} catch (IOException ex) {
			System.out.println(ex);			//ex.toString()
		}finally {			//반드시 닫아야할 때	//닫을때도 try-catch필요.
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
