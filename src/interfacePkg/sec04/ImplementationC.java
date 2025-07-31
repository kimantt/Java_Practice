package interfacePkg.sec04;

public class ImplementationC implements InterfaceC {
	// InterfaceC가 상속받은 InterfaceA와 InterfaceB에 대한 메서드까지 전부 구현
	@Override
	public void methodA() {
		System.out.println("methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}

}
