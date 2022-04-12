package jihunLogin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Login extends SignUp{
	boolean bool = true;
	int num;

	public void display() {
		System.out.println("회원 로그인 기능입니다.");
		Scanner sc = new Scanner(System.in);
		while(bool) {
			try {
				System.out.println("1.로그인 2.회원가입 3.회원정보보기 4.종료");
				System.out.print(">>>");
				num = sc.nextInt();
			} catch (Exception e) {
				System.err.println("숫자를 입력하세요.");
				sc.nextLine();
			}
			switch(num){
			case 1:
				Login();
				break;
			case 2:
				signup();
				break;
			case 3:
				search();
				break;
			case 4:
				System.out.println("회원등록 종료");
				bool = false;
			}


		}
	}
}


class SignUp{	
	private String name;
	private String pw;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


	Scanner sc = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<String>();
	LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
	String member;
	public void Login() {
		String name,pw;
		if(arr.size() == 0) {
			System.err.println("회원 등록 하고오세요.");
		}else {
			System.out.println("-----------------<로그인>-------------------");
			System.out.println("로그인 페이지 입니다. 이름과 회원번호를 입력해주세요.");
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("회원번호 입력 : ");
			pw = sc.next();
			for(int i=0; i<arr.size(); i++) {
				if(map.keySet().contains(name) && map.values().contains(pw)) {
					System.out.println("로그인 성공!");
					break;
				}else {
					if(!map.keySet().contains(name)) {
						System.out.println("등록되지 않은 아이디입니다.");
					}else {
						System.out.println("로그인 실패!");
						break;
					}
				}
			}
		}
	}
	public void signup() {
		System.out.println("회원등록 페이지 입니다. 이름과 회원번호를 입력해주세요.");

		System.out.print("이름 등록 : ");
		name = sc.next();
		setName(name);
		System.out.print("회원번호 등록 : ");
		pw = sc.next();
		setPw(pw);
		String s = map.put(name, pw);
		System.out.println("회원 등록이 완료되었습니다.");
		arr.add(s);
	}	
	public void search() {
		Iterator it = map.keySet().iterator();
		System.out.println("등록된 회원 모두보기");
		for(int i=0; i<map.size(); i++) {
			Object obj = it.next();
			it.hasNext();
			System.out.println(obj + "\t: " + map.get(obj));
		}
		
	}
}





