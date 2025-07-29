package oopClass.sec09;

public class BookMain {

	public static void main(String[] args) {
		// 객체 인스턴스 생성
		Book bk = new Book("Java", "홍길동", 20000);
		Book bk1 = new Book(); // 정해진 기본값으로 멤버변수의 값을 초기화하는 생성자
		
		bk.show();
		bk1.show();

	}

}
