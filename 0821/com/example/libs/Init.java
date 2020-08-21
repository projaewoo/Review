package com.example.libs;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Init {		//메모리에 loagin할때 초기화 담당하는 클래스
	private String path;		//Main에서 넘어오는 PATH를 받는 지역변수.
	private ObjectInputStream ois;
	private ArrayList<Person> list;

	@SuppressWarnings("unchecked")
	public Init(String path) {				//생성자 : ois초기화.	
		this.path = path;
		File file = new File(this.path);
		
		try {
			if(file.exists()) {		//파일 있음 = 이미 전에 백업을 했거나, 한번 이상 실행한 적이 있음.
				this.ois = new ObjectInputStream(					
						new FileInputStream(file));
				this.list = (ArrayList<Person>)this.ois.readObject();		//역직렬화 (저장된 것을 가져옴)
			}else {			//파일 없음 = 이 프로그램 처음 실행할 때
				file.createNewFile();		//파일 없으면 새로 만들기.
				this.list = new ArrayList<Person>(1);		//ArrayList가 Person형의 방 1개로 초기화.
			}
			
		} catch (EOFException e) {				//파일은 있으나, 파일 안이 비어있다면 발생하는 Exception. 
			System.out.println("EOFException");
			this.list = null;			
			file.delete(); 		//EOFEException발생하면 그 파일(텅 빈 파일) 삭제
			return;			//Init()끝.
		}catch(ClassNotFoundException | IOException e) {								//IOException일때
			System.out.println("Exception 발생 : " + e.getMessage());
			this.list = null;
			return;			//Init()끝.
		}
	}
	
	public ArrayList<Person> load() {
		if(this.list != null)  return this.list;
		else return null;
	}
}
