package package1;

import java.util.Scanner;	//클래
public class InputEx {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("숫자 1 입력 : ");
		num1 = sc.nextInt();
		System.out.println("숫자 2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println("두 수의 합 : " + (num1+num2));
		
		//float input
		sc.nextFloat();
		
		//String input
		sc.next();
		
		sc.close();	//할당받은 메모리 해
	}
}
