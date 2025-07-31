package oopInheritance.sec10;

public class ParentChildMain {

	public static void main(String[] args) {
		// 다형성 Study
		Child child = new Child();
		
		// 자동 타입변환과 다형성
		// 부모 클래스 타입의 참조변수 선언
		Parent parent;
		// Parent 타입 객체 인스턴스 참조를 Child 타입의 인스턴스 연결
		parent = child; //자동 타입변환 -> subClass의 객체가 superClass의 객체로 자동 타입변환
		// parent 변수는 child 객체 참조하지만
		// 사용 가능한 멤버는 Parent 것만 사용가능
		parent.method1(); // Parent 클래스의 method 사용가능
		
//		parent.method3(); // Child 클래스의 method 사용불가능
		
		// 예외적으로 subClass가 superClass의 메서드 재정의 했으면 subClass의 메서드가 호출됨
		parent.method2(); // subClass의 메서드가 호출됨

	}

}
