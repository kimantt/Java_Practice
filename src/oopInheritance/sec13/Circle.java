package oopInheritance.sec13;

public class Circle extends DrawingObject {
	public Circle() {
		penColor = "blue";
	}
	
	@Override
	public void draw() {
		// 추상 메서드 구현
		System.out.println(penColor + "색상으로 원 그리기");
	}
}
