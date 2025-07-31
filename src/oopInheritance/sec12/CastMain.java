package oopInheritance.sec12;

public class CastMain {

	public static void main(String[] args) {
		// 강제 타입변환
		Animal ap = null;
		
		ap = new Dog(); // 자동 타입변환
		ap.show(); // Dog 클래스에서 재정의한 메서드가 호출
		ap.sound();
		
		ap.animalMethod(); // Animal 클래스의 메서드가 호출 - Dog 클래스에서 재정의하지 않음
//		ap.dogMethod(); // 자식 클래스의 메서드는 사용불가
		
		// Dog 클래스 참조변수 선언
		// ap의 타입은 Animal이지만, 참조 객체는 Dog 타입의 객체를 참조중 (자동 타입변환)
		// 그냥 대입하면 타입 불일치 에러 발생
		// 일시적으로 강제 형변환 가능
		Dog d = (Dog)ap;
		d.dogMethod();
		
		// instanceof : 객체가 참조하고 있는 인스턴스의 타입 검사를 진행하는 연산자
		// 객체 instanceof type -> 참조타입이면 true 반환
		// 부모타입 객체가 모두 자식타입으로 강제 형변환이 가능한건 아님 -> 자식타입에 근거한 객체여야함
		Animal aa = new Animal(); // aa 참조변수는 참조객체의 타입이 Animal임
//		Dog dd = (Dog)aa; // 런타임에 형변환 발생 -> 실행 시 오류 발생
		if (aa instanceof Dog) {
			Dog dd = (Dog)aa;
			System.out.println("Dog 타입으로 변환 불가");
		}
		else
			System.out.println("Dog 타입으로 변환 불가");

	}

}
