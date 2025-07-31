package interfacePkg.sec01;

public interface ISmartPhone {
	// 구현되는 클래스의 메서드 설계도 역할
	
	// 생성자를 만들 수 없으므로 선언할때 초기화 해야함
	String name = "smartphone"; // interface 내에 있는 필드이므로 무조선 상수로 처리됨 (컴파일 될때 자동으로 public static final)
	
	// 추상 메서드 : body가 구현되지 않은 메서드
	// 객체가 갖고있을 메서드를 설명하는 부분 (접근제한, 반환타입, 메서드명, 매개변수)
	public void sendCall();
	public void recieveCall();
	public void sendSMS();
	public void recieveSMS();

}
