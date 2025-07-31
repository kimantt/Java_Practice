package oopInheritance.sec09;

public class SportsCar extends MyCar { // MyCar 클래스가 final이면 상속 불가능
	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override
//	public void stop() { // MyCar 클래스에서 stop 메서드를 final로 지정함 - Override 불가능
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
