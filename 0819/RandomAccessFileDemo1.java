import java.io.IOException;
import java.io.RandomAccessFile;

//읽기, 쓰기 동시에
public class RandomAccessFileDemo1 {
	public static void main(String[] args) {
		try(RandomAccessFile raf = 
				new RandomAccessFile("C:/temp/raf.txt", "rw")) {		//"rw" : 읽기, 쓰기 모드
			
			//변수 형태에 따라 변화하는 포인터 위치
			System.out.println("파일 포인터 위치 : " + raf.getFilePointer());		//파일 포인터 위치 : 0
			raf.writeBoolean(true);		//1byte
			System.out.println("파일 포인터 위치 : " + raf.getFilePointer());
			raf.writeInt(24);			//4byte
			System.out.println("파일 포인터 위치 : " + raf.getFilePointer());
			raf.writeDouble(89.5);		//8byte
			System.out.println("파일 포인터 위치 : " + raf.getFilePointer());
			
			
			//raf.txt 쓰기		//있으면 덮어쓰고, 없으면 새로 만듬
			raf.writeBoolean(true);
			raf.write("\n".getBytes());	 //"\n"를 바이트로
			raf.writeInt(24);
			raf.write("\n".getBytes());	 
			raf.writeDouble(89.5);
			raf.write("\n".getBytes());	 
			raf.writeUTF("안녕하세요");
			raf.write("\n".getBytes());	 
			raf.writeUTF("Hello, World");
			System.out.println("File saved successfully");
			
			raf.seek((long)0);		//포인터를 원하는 위치로 이동 //0 : 포인터를 제일 앞으로 -> 9행 true앞으로 이동
			
			//raf.txt 읽어들이기		//파일 없으면 ERROR
			System.out.printf("%b%n", raf.readBoolean());		//true앞으로 이동시키고 boolean으로 읽었으므로 true나와야함
			raf.readLine();			//true밑에 엔터를 21행이 읽음.
			System.out.printf("%d%n", raf.readInt());
			raf.readLine();
			System.out.printf("%.1f%n", raf.readDouble());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
			
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
