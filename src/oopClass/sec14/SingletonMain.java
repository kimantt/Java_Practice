package oopClass.sec14;

public class SingletonMain {

	public static void main(String[] args) {
		// 싱글톤 패턴 클래스 사용
//		Singleton obj1 = new Singleton(); // 에러. 생성자가 private로 접근제한 되어있음

		// Singleton 객체가 필요할 경우 메서드 getInstance 활용
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2)
			System.out.println("같은 Singleton 객체입니다.");
		else
			System.out.println("다른 Singleton 객체입니다.");
	}

}
