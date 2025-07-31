package interfacePkg.sec04;

public class MultiExtendsMain {

	public static void main(String[] args) {
		// 인터페이스 활용
		ImplementationC c = new ImplementationC(); // 구현 클래스 객체 생성
		
		// InterfaceA : c 참조변수는 InterfaceA 타입으로 자동 형변환
		InterfaceA ia = c;
		ia.methodA();
		
		// InterfaceB : c 참조변수는 InterfaceB 타입으로 자동 형변환
		InterfaceB ib = c;
		ib.methodB();
		
		// InterfaceC : c 참조변수는 InterfaceC 타입으로 자동 형변환
		InterfaceC ic = c;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
