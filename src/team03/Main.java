package team03;

import java.util.ArrayList;
import java.util.Scanner;

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
					System.out.println("점심시간 확인 - 최지언");
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
