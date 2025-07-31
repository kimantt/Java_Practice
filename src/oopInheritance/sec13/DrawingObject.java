package oopInheritance.sec13;

public abstract class DrawingObject {
	// 추상 클래스 : 추상 메서드를 포함하는 클래스
	// 멤버변수/멤버메서드/생성자 포함 가능
	public String penColor;
	
	// 추상 메서드 - draw 메서드는 subClass에서 구현해서 사용
	// 메서드명, 접근제한, 리턴타입은 정해주고 실제 기능은 subClass에서 구현하도록
	public abstract void draw();
}
