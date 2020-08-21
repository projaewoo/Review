package com.example.libs;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Init {		//�޸𸮿� loagin�Ҷ� �ʱ�ȭ ����ϴ� Ŭ����
	private String path;		//Main���� �Ѿ���� PATH�� �޴� ��������.
	private ObjectInputStream ois;
	private ArrayList<Person> list;

	@SuppressWarnings("unchecked")
	public Init(String path) {				//������ : ois�ʱ�ȭ.	
		this.path = path;
		File file = new File(this.path);
		
		try {
			if(file.exists()) {		//���� ���� = �̹� ���� ����� �߰ų�, �ѹ� �̻� ������ ���� ����.
				this.ois = new ObjectInputStream(					
						new FileInputStream(file));
				this.list = (ArrayList<Person>)this.ois.readObject();		//������ȭ (����� ���� ������)
			}else {			//���� ���� = �� ���α׷� ó�� ������ ��
				file.createNewFile();		//���� ������ ���� �����.
				this.list = new ArrayList<Person>(1);		//ArrayList�� Person���� �� 1���� �ʱ�ȭ.
			}
			
		} catch (EOFException e) {				//������ ������, ���� ���� ����ִٸ� �߻��ϴ� Exception. 
			System.out.println("EOFException");
			this.list = null;			
			file.delete(); 		//EOFEException�߻��ϸ� �� ����(�� �� ����) ����
			return;			//Init()��.
		}catch(ClassNotFoundException | IOException e) {								//IOException�϶�
			System.out.println("Exception �߻� : " + e.getMessage());
			this.list = null;
			return;			//Init()��.
		}
	}
	
	public ArrayList<Person> load() {
		if(this.list != null)  return this.list;
		else return null;
	}
}
