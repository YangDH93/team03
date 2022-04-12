package jiwonMenu;

import java.util.*;

public class LunchFunc {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> arr = null;
	private String menu;
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu=menu;
	}
	
	public void display() {
		int num;
		System.out.print("=====점심룰렛=====\n번호를 선택하세요."
				+ "\n1. 점심메뉴 등록\n2. 돌려돌려 점심판\n3.나가기\n>>> ");
		num=sc.nextInt();
		
		while(true) {
			try {
				if(num==1) Num1Put();
				else if(num==2) Num2Ran();
				else if(num==3) {
					System.out.println("처음화면으로 돌아갑니다.");
					break;
				}else {
					throw new Exception("1~3까지만 입력하시오.");
					//오류메시지
				}
			} catch (InputMismatchException e) {
				System.err.println("숫자만 입력하시오.");
				sc.nextLine();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				sc.nextLine();
			}
		}//while
	}//display
	
	public void Num1Put() {
		System.out.println("점심메뉴를 등록하세요.(최소 2개)");
		for(int i=1; ;i++) {
			System.out.print("메뉴"+i+" : ");
			String menu;
			menu = sc.next();
			setMenu(menu);
			Num1Arr(menu);
			if(i>2) {
				int re=Num1MorePut();
				if(re==0) {Num1Arr(menu); continue;}
				else if(re==1) break;
				else System.out.print("1 or 2만 선택하세요.");
			}
		}
	}//num1
	
	public void Num1Arr(String menu) {
		arr = new ArrayList<String>();
		if(arr.contains(menu)) {
			System.out.println("있는 메뉴입니다. 다시 입력하세요.");
		}else {
			arr.add(getMenu());
		}
	}//num1 Arr
	
	public int Num1MorePut() {
		System.out.print("더 등록하시겠습니까?\n1.네\n2.아니오\n>>> ");
		try {
			int choice=sc.nextInt();
			if(choice==1) return 0;
			else if(choice==2) return 1;
			else return 2;
		} catch (InputMismatchException e) {
			System.err.println("숫자만 입력하시오.");
			sc.nextLine();
		}
		return -1;//??머임?
	}//num1 추가
	
	public void Num2Ran() {
		int ran=(int)Math.random()*(arr.size());
		System.out.println("오늘의 메뉴 : "+arr.get(ran));
	}
	
}
