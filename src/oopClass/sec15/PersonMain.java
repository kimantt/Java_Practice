package oopClass.sec15;

public class PersonMain {

	public static void main(String[] args) {
		// final 필드 사용
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation); // 읽기전용 필드
		System.out.println(p1.name); // 일반필드
		System.out.println(p1.ssn); // 읽기전용 필드

//		p1.nation = "USA"; // final 필드 수정 불가
		p1.name = "이몽룡";
//		p1.ssn = "222222-5555555"; // 이미 초기화 되어있어 수정불가
		
	}

}
