package oopException.sec04;

import java.util.*;

public class ExceptionEx {

	public static void main(String[] args) {
		// 예외처리 연습문제
		// 두 수를 입력 받아 나누기 수행
		Scanner sc = new Scanner(System.in);
		int firstNo, secondNo;
		
		try {
			// 숫자 입력
			System.out.print("정수1 입력 : ");
			firstNo = sc.nextInt();
			System.out.print("정수2 입력 : ");
			secondNo = sc.nextInt();
			
			// 나누기 결과 출력
			System.out.println("나누기 결과 : " + (firstNo / secondNo));
			
		} catch(InputMismatchException e) { // 입력된 값이 숫자가 아님
			System.out.println("숫자가 아닙니다");
			
		} catch(ArithmeticException e) { // secondNo이 0일때 : 0으로 나눌때
			System.out.println("0으로 나눌 수 없습니다");
			
		} catch(Exception e) { // 그 외 오류
			System.out.println("오류발생 " + e);
			
		}
	}

}
