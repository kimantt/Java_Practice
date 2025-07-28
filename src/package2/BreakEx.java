package package2;
import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		// 인출 수행 프로그램. 잔액 부족하면 종료
		int balance = 100000; // 현재 잔액
		int withdrawal; // 인출액
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 잔액 : " + balance);
		while (true) {
			System.out.print("인출액 입력 : ");
			withdrawal = sc.nextInt();
			
			if (withdrawal > 0) {
				if (withdrawal > balance)
					break;
				else
					balance -= withdrawal;
			}
			else
				System.out.println("인출액은 0보다 커야 합니다");
		}
		
		System.out.println("잔액부족. 현재 잔액 : " + balance);
	}

}
