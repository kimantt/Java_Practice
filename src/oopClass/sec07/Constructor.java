package oopClass.sec07;

public class Constructor {
	// 멤버변수
	private int x;
	private int y;
	
	// 생성자 : 클래스 이름과 동일한 메서드, 반환타입 없음
	// 객체 생성될때 한번만 호출 가능
	// 생성자 역할 : 멤버변수 값 초기화
	// 명시적 생성자가 구현되었으므로 디폴트 생성자는 구현되지 않음
	public Constructor(int x) {
//		x = 100;
		
		// 메서드 바디 영역이므로 x는 매개변수 x(지역변수)를 지칭하게 됨
		// 멤버변수 x 지칭 시에는 class 영역을 지칭하는 this 레퍼런스
		// this 레퍼런스 : 현재 클래스를 참조하는 예약어
		this.x = x;
	}
	
	// 메서드
	public void show() {
		System.out.println("x: " + x);
	}
}
