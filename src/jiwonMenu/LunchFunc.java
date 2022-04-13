package jiwonMenu;

import java.util.*;

public class LunchFunc {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> arr = new ArrayList<String>();
	private String menu;
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu=menu;
	}
	
	public void display() {
		int num;
		while(true) {
			System.out.print("=====점심룰렛====="
					+ "\n1. 점심메뉴 등록\n2. 돌려돌려 점심판\n3. 나가기\n>>> ");
			num=sc.nextInt();
			try {
				if(num==1) Num1Ck();
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

	public void Num1Ck() {
		
		while(true) {
			System.out.print("- - - - - - - -"
					+ "\n1.등록메뉴 확인\n2.메뉴 등록\n3.나가기\n>>> ");
			try {
				int choice=sc.nextInt();
				if(choice==1) {Num1Cho1();}
				else if(choice==2) Num1Cho2();
				else if(choice==3) break;
				else {
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
		}
	}//num1
	public void Num1Cho1() {
		if(arr.size()==0) {
			System.out.println("등록된 메뉴가 없습니다.");
			return; //continue대체
		}else {
			for(String s : arr) {
				System.out.println(s);
			}
		}
	}

	public void Num1Cho2() {
		System.out.println("- - - - - - - -\n점심메뉴를 등록하세요.");
		if(arr.size()<1) System.out.println("(2개 이상)");
		while(true) {
			System.out.print("메뉴 : ");
			String menu=sc.next();
			setMenu(menu);
			int re01=Num1Arr(getMenu());
			if(re01==0) continue;
			if(arr.size()>=2) {
				System.out.println("- - - - - - - -\n더 등록하시겠습니까?"
						+ "\n1.네 2.아니오(나가기)");
				int more=sc.nextInt();
				if(more==1) continue;
				else if(more==2) break;
			}
		}
	}//num1-choice1
	
	public int Num1Arr(String menu) {
		if(arr.contains(menu)) {
			System.out.println("- - - - - - - -\n"
					+ "있는 메뉴입니다. 다시 입력하세요.");
			return 0;
		}else {
			arr.add(menu);
			return -1;
		}
	}//num1 Arr
	
	public void Num2Ran() {
		int ran=0;
		System.out.println("오늘의 메뉴는?");
		for(int i=0; i<3; i++) {
			ran=(int)(Math.random()*(arr.size()));
			System.out.println(".");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("***"+arr.get(ran)+"***\n");
	}//random
	
}
