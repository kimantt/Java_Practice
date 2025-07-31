package interfacePkg.sec02;

public class RemoteControlMain {

	public static void main(String[] args) {
		// 인터페이스 활용 객체와 통신
		IRemoteControl rc = null;
		
		//Television 객체 활용
		rc = new Television();
		rc.turnOn(); // 인터페이스의 추상 메서드 : 재정의됨
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true); // 디폴트 메서드지만 재정의 되어있음 (Television에서 재정의된 메서드가 호출)
		rc.setMute(false);
		
		System.out.println("------------------------------------------");
		
		// Audio 객체 활용
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(50);
		rc.setMute(true); // 디폴트 메서드 재정의 하지 않았음. interface의 기본 메서드 호출
		
		// 정적 메서드 사용
		IRemoteControl.changeBattery();
//		rc.showRemote(); // 인터페이스의 정적 메서드여도 인터페이스 참조변수를 통해서 접근은 불가능

	}

}
