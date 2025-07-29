package oopClass.sec01;

public class CarMain {

	public static void main(String[] args) {
		// 사용자 정의 클래스 Car 사용
		// 1. Car 클래스 객체 생성
		// 2. 생성된 객체 통해서 멤버 변수나 멤버 메서드 사용 (사용은 접근제한에 따라 다름)
		// Car 클래스는 현재 클래스(CarMain)와 동일 패키지 내에 있음 - import 없이 사용 가능
		Car c = new Car(); // 객체 생성
		// c 인스턴스 생성
		
		// 객체 통해서 멤버 변수 또는 멤버 메서드 사용
		// carNo는 private : 클래스 외부에서 직접 접근 불가능
		//c.carNo = "11가1234";
		//System.out.println(c.carNo);
		
		// 객체 통해서 public 메서드 호출
		c.setCarInfo("11가1111", "k7", "기아", 2025, 1500);  // c 참조변수가 참조하는 객체의 멤버 변수에 값이 저장됨
		c.showCarInfo(); // c 참조변수가 참조하는 객체의 멤버 변수 값을 출력
		
		// Car 클래스 인스턴스 b 생성
		Car b = new Car();
		b.setCarInfo("22나2222", "그랜저", "현대", 2023, 2000);
		b.showCarInfo();
	}

}
