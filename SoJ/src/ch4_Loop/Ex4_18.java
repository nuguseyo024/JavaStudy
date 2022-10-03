package ch4_Loop;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. square");
			System.out.println("2. square root");
			System.out.println("3. log");
			System.out.print("원하는 메뉴(1 ~ 3)를 선택하세요 (종료 : 0) >> ");
			
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 0) {
				System.out.println("프로그램 종료...");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("잘못된 입력...(종료 : 0)");
				continue;
			}
			System.out.println("선택한 메뉴는 "+ menu +"번 입니다.");
			System.out.println("===============================");
			
		}
		
	}

}
