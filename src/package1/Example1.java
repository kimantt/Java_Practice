package package1;

public class Example1 {

	public static void main(String[] args) {
		// 자바 변수 : type을 표현해야 함
		int value1;	//변수 선언
		int value = 10;	//선언과 동시에 초기값
		value1 =10;	//변수에 값 대입
		int result = value1 + 10;
		
		System.out.println(result);
		
		// 자바 상수 : 실행 중 값 기억 임시 기억장소(변수와 같음) 대입 후 실행 중 값이 변하지 않는다.
		// final 데이터타입 상수명
		// 변수와 구문하기 위해 대문자로 명명
		final int PRICE = 1000;
		//PRICE = 200; 변경 불가능
		
		// 리터럴 : 변수에 저장되는 값
		value = 50;	//50 정수형 리터
		float valf = 50.2f;	//실수 리터럴
		char valch = 'a'; //문자 리터럴
		String str = "abc";	//문자열 리터럴
		boolean a =true;	//논리 리터럴
		
		// 데이터 타입
		// 기본 타입: byte/short/int/long		flolat/doudle boolean char
		// 참조형 : 기본 타입 제외 나머지 모두 String
		
		int aint = 10;	//0
		double bdouble = 5.2;	//기본값 0.0d  8byte
		char chr = 'A';	// '\u0000'  2btye
		boolean bool = false;	//false 1byle
		
		long lint = 100L;	//8byte
		float flt = 5.0f; //4byte
		short sint = 10; //2byte
		byte bint = 1; //1byte, 첫번째 비트 부호 사용  부호비트 (-) 0000001
		
		// 데이터 타입에 따라 사용 메모리 크기가 다름
		// 메모리 최소단위 : bit -> 0,1 => 8bit -> 1byte
		
		//float avg = 88.5;
		double avg1 = 88.5;
	}

}
