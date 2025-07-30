package oopClass.sec15;

public class Person {
	// final : 초기화 되면 수정할 수 없는 필드
	// final의 초기화는 클래스 내에서 진행되어야함
	final String nation = "Korea"; // 고정값으로 초기화
	String name;
	final String ssn; // 초기값을 인스턴스 생성될때 부여
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
