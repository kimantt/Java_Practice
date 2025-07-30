package oopInheritance.sec06;

public class Computer extends Calculator {
	// 컴파일러는 부모 클래스의 areaCircle 메서드의 정의부와 재정의되는 메서드의 정의부가 같은지 확인
	@Override
	double areaCircle(double r) { // default -> 부모 클래스 메서드가 default이므로 접근제한이 같거나 범위가 더 넓어야함
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // 더 정밀한 계산을 위해 3.14159 대신 Math.PI 상수 이용
	}
	
}
