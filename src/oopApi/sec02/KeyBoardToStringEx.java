package oopApi.sec02;

import java.io.IOException;

public class KeyBoardToStringEx {

	public static void main(String[] args) throws IOException {
		// 사용자로부터 키코드 입력받고 문자열로 출력
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); // IOException이 throws 처리되어있음 -> main에서 예외처리를 호출측으로 던짐
		// keyboard로부터의 입력 종료 기호 enter까지 전달됨
		// enter키는 \r\n 의 두 키 신호가 조합됨 : 아스키 코드 13 10
		System.out.println(readByteNo + "바이트");
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);

	}

}
