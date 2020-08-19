import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//파일 형식으로 내보내기
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		String path ="C:/temp/result.txt";
		
		//FileOutputStream이용
//		try(FileOutputStream fos = 
//				new FileOutputStream(path)) {			//try에서 file 열고		//빨대의 출력방향 : File로 내보냄, 위치는 C:/temp/result.txt로 내보냄.
//			fos.write("안녕하세요".getBytes());		//byte배열로 내보냄.
//			fos.write("\n".getBytes());
//			fos.write("Good Morning".getBytes());		//이미 파일이 만들어져있으면 덮어쓰기 됨.
//			fos.write("65".getBytes());   	//그냥 65.getByte()라 하면 파일에 A로 저장됨.	//따라서 "65".getByte()로
//			fos.write("true".getBytes());
//			System.out.println("Save Success");
//		}catch(IOException ex) {		
//			System.out.println(ex);
//		}
		
		//DataOutputStream이용
		//숫자를 숫자로, 글자를 글자로 내보냄.
		try(DataOutputStream dos =
				new DataOutputStream(new FileOutputStream(path))) {
			dos.writeBoolean(true);		//boolean의 true를 내보냄		//string "true"찍음
			dos.write("\n".getBytes());	
			dos.writeInt(24);					//숫자를 숫자로 저장.
			dos.write("\n".getBytes());
			dos.writeDouble(89.5);
			dos.write("\n".getBytes());
			dos.writeUTF("안녕하세요");
			dos.write("\n".getBytes());
			dos.writeUTF("Good Morning!!");
			System.out.println("Save Success");
		}catch(IOException ex) {		
			System.out.println(ex);
		}
	}
}

//내보낼때 writeBoolean()이면
//읽을때, readBoolean()사용해야 제대로 읽음.