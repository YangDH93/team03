package team03;

import java.util.ArrayList;
import java.util.Scanner;

import jiwonMenu.LunchFunc;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Name n = null;
		ArrayList<Name> arr = new ArrayList<Name>();
		String name;
		System.out.println("회원관리 프로그램");
		
		while(true) {
			int num;
			num = sc.nextInt();
			switch(num) {
				case 1:
					System.out.println("회원등록 합니다.- 지훈");
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
			
			}
		}
		
		
		
		
		
		
	}
}
