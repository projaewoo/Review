package com.example.libs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Save {
	private ArrayList<Person> list;
	private String path;
	private ObjectOutputStream oos;
	private boolean flag;
	
	public Save(ArrayList<Person> list, String path) {
		this.list = list;
		this.path = path;
		File file = new File(this.path);
		try {
			this.oos = new ObjectOutputStream(			//oos 초기화.
					new FileOutputStream(file));
			this.oos.writeObject(this.list); 			//oos읽기 //나갈떄 writeObject()
			flag = true;			//잘 저장됐는지 확인
		}catch(IOException e) {
			System.out.println("오류 발생 : " + e.getMessage());
			flag = false;
		}
	}
	
	public void backup() {
		if(this.flag)	System.out.println("Save success");
		else System.out.println("Save Failure");
	}
	
}