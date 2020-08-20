import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//jpg 파일 복사하기.
public class FileCopy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원본 파일 : ");
		String originalPath = scan.next().trim();
		System.out.print("복사 파일 : ");
		String targetPath = scan.next().trim();
		int count = 0, su;
		try(BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(originalPath));		//괄호 안에 두 문장 이상일경우 ;로 구분
				BufferedOutputStream bos =
				new BufferedOutputStream(new FileOutputStream(targetPath))) {			//AutoCloseable의 자손이 try벗어나면 저절로 닫힘. //굳이 close()할 필요 없음.
					//읽어들일 문자가 없다면 bis.read()가 0을 반환한다고 생각할 수 있지만, 컴퓨터에게 읽어들일 문자가 없다는 뜻은 -1 음수를 반환한다는 뜻.
			while((su = bis.read()) >= 0) {	//read()의 반환형 : int  //1byte읽어서 su에 넣음.	//BufferedInputStream이 InputSTream으로 끝나서 바이트 기준으로 읽어들임.
				count++;		
				bos.write(su);		//하나 읽고 내보내고
			}
			System.out.println((count/1000) + " KB file copied successfully");
		}catch(IOException ex) {			//buffer과 file의 대표 Exception : IOException
			System.out.println(ex);
		}
	}
}
// 입력값
//		./index.jpg	
// 		C:/temp/index1.jpg
