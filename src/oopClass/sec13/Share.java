package oopClass.sec13;

public class Share {
	int a; // 인스턴스 필드
	static int staticA; // static 필드는 선언할 때 초기화하는 것이 일반적. 초기화하지 않으면 기본값 0으로 초기화됨
	
	public void set(int n) { // 인스턴스 메서드
		a += n;
		staticA += n;
	}
	
	public int showA() {
		return a;
	}
	
	static public int showStaticA() {
		return staticA;
	}

}
