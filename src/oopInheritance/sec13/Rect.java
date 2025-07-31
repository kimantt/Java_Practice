package oopInheritance.sec13;

public class Rect extends DrawingObject {
	public Rect() {
		penColor = "green";
	}
	
	@Override
	public void draw() {
		// 추상 메서드 구현
		System.out.println(penColor + "색상으로 사각형 그리기");
	}
}
