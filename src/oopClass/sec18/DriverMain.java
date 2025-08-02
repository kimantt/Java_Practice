package oopClass.sec18;

public class DriverMain {

	public static void main(String[] args) {
		// 매개변수 다형성
		Driver driver = new Driver();
		
		Bus bus =new Bus();
		Taxi taxi = new Taxi();
		
		// 오버라이딩 된 subClass의 run 메서드가 호출됨
		driver.drive(taxi); // taxi 전달 -> Vehicle 타입의 매개변수가 받음(자동 타입변환 발생)
		driver.drive(bus); // bus 전달 (자동 타입변환 발생)
		
	}

}
