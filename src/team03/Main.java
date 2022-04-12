package team03;

import java.util.ArrayList;
import java.util.Scanner;

import jihunLogin.Login;
import jiwonMenu.LunchFunc;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		System.out.println("1조 기능 프로그램");
		
		while(bool) {
			System.out.println("1.지훈 2.지원 3.동훈 4.예린 5.종료");
			int num;
			num = sc.nextInt();
			switch(num) {
				case 1:
					Login lo = new Login();
					lo.display();
					break;
				case 2:
					LunchFunc lm = new LunchFunc();
					lm.display();
					break;
				case 3:
					System.out.println("등록된 회원 검색 - 양동훈");
					break;
				case 4:
					System.out.println("구구단 ( 2단부터 19단까지) - 예");
					break;
				case 5:
					bool = false;
			}
		}

	}
}
