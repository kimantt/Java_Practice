package interfacePkg.sec03;

public class SmartRemoteControlMain {

	public static void main(String[] args) {
		
		// 2개의 인터페이스 기능 구현한 클래스 통해서 기능 확인
		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.turnOff();
		stv.setVolume(4);
		stv.sreach("www.naver.com");
		
		// interface 활용
		IRemoteControl rc = new SmartTelevision();
		ISearchable se = new SmartTelevision();
		rc.turnOn();
		se.sreach("www.daum.net");
	}

}
