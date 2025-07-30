package oopInheritance.sec01;

// Parent 클래스 상속
public class Child extends Parent {
	private int c;
	
	public void setChild() {
		c = 20;
	}

	public void showChild() {
		// 부모 클래스의 필드와 메서드 중 private 접근제한이 아닌 멤버들은 자식 클래스에서 사용
		showParent();
		System.out.println("자식 클래스 c : " + c);
	}
	
}
