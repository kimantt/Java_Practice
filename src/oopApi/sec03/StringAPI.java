package oopApi.sec03;

public class StringAPI {

	public static void main(String[] args) {

		// charAt()
		String ssn = "123456-1234567";
		char gender = ssn.charAt(7);
		
		switch(gender) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
		}
		
		// indexOf, replace, substring, valueOf, split
		String title = "자바 프로그래밍";
		System.out.println(title.indexOf("프로그래밍")); // 인덱스 위치 3부터 시작
		System.out.println(title.indexOf("java")); // -1 반환 : 해당 문자열을 포함하고있지 않음
		System.out.println(title.replace("자바", "Java")); // 문자열 찾아 대체문자열로 변경된 새로운 문자열 반환
		System.out.println(title.substring(3)); // 3번 인덱스부터 끝까지 추출
		System.out.println(title.substring(3, 5)); // 3번 인덱스부터 4번 인덱스까지 추출
		System.out.println(String.valueOf(true)); // 문자열 true로 반환
		System.out.println(title.split(" ")[0]); // 주어진 기준 문자를 활용하여 문자열을 분리하고 배열로 반환
		
		// split에서 여러 기준 문자 사용
		String str = "홍길동&이몽룡,성춘향,김자바-김길동";
		String[] names = str.split("&|,|-");
		for (String name : names)
			System.out.print(name + " ");

	}

}
