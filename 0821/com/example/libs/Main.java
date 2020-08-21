package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner scan;	//member변수 : 주소로 접근.
	private static final String PATH;		//파일저장경로.		//static상수
	private ArrayList<Person> list;
	
	static {				//static블록 : static상수 초기화
		PATH = "./myaddress.ser";			//주소록관리프로젝트 폴더 기준 //주소록관리프로젝트 폴더 밑에 myaddress.ser생성.
	}
	
	private Main() {			//생성자 : member변수 초기화.
		this.scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {			//main()이 가장 먼저 시작되서, 직렬화 객체를 메모리에 loading
		Main main = new Main();
		Init init = new Init(PATH);			//main()통해서, 초기화하는 클래스.		//static끼리 접근가능
		main.list = init.load();
		if(main.list == null)  System.exit(-1);
		
		while(true) {
			int choice = main.showMenu();		//주소로 멤버메소드 호출.
			main.process(choice);
			System.out.println();
		}
	}
	
	private int showMenu() {
		System.out.println("[ 회원 주소록 ]"); 
		System.out.println("1. 전체 회원 보기"); 
		System.out.println("2. 회원 정보 등록"); 
		System.out.println("3. 회원 정보 검색"); 
		System.out.println("4. 회원 삭제"); 
		System.out.println("5. 회원 정보 수정"); 
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 번호 선택 >> ");
		return this.scan.nextInt();
	}
	
	private void process(int choice) {
		switch(choice) {
			case 0 : 
				Save save = new Save(this.list, PATH);		//0번 누르면 백업. (지금까지 입력한 ArrayList 저장)
				save.backup();
				System.out.println("Bye!! Program is over...");
				System.exit(0); 	break; 		//정상적인 프로그램 종료
			case 1 :		// 1. 전체 회원 보기
				Output output = new Output(this.list);
				output.output();  break;
			case 2 : 		//2. 회원 정보 등록
				Input input = new Input(this.list, this.scan);		//입력하려면 scan넘겨줘야함.
				input.input();		break;
			case 3 : 		//3. 회원 정보 검색		//main에서 검색 시, 삭제, 수정 시 필요
				this.search("검색할", 0);  break;
			case 4 : 		//4. 회원 삭제
				this.search("삭제할", 1);  break;
			case 5 : 		//5. 회원 정보 수정
				this.search("수정할", 2);  break;
		}
	}
	
	private void search(String msg, int flag) {
		Search search = new Search(this.list, this.scan);		//선형검색 (앞에서 끝까지 다 검색)
		Person p = search.linearSearch(msg);		//검색하고 그 결과를 p 한명에게
		if(p != null)  {
			if(flag == 0) System.out.println(p);
			if(flag == 1) {
				this.list.remove(p);		//삭제할 회원만 보냄
				System.out.println("회원 삭제 성공");
			}
			if(flag == 2) {
				Update update = new Update(p, this.scan);		//수정할 회원만 보냄	
				update.modify();
			}
		}
		else System.out.println("회원을 찾지 못했습니다. 확인 후 다시 검색해주세요.");
	}
	
}
