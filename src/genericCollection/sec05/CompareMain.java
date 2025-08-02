package genericCollection.sec05;

public class CompareMain {

	public static void main(String[] args) {
		// 제네릭 클래스 및 제네릭 메서드 사용 예제
		// 객체 생성
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		
//		boolean result1 = Util.<Integer, String>compare(p1, p2);
		boolean result1 = Util.compare(p1, p2);
		
		if (result1)
			System.out.println("논리적으로 동등한 객체입니다");
		else
			System.out.println("논리적으로 다른 객체입니다");
		
		// 파라미터 타입이 서로 다른 기호여도 타입이 같은 것은 상관없음
		Pair<String, String> p3 = new Pair<String, String>("user1", "사과");
		Pair<String, String> p4 = new Pair<>("user2", "사과");
		boolean result2 = Util.compare(p3, p4);
		if (result2)
			System.out.println("논리적으로 동등한 객체입니다");
		else
			System.out.println("논리적으로 다른 객체입니다");

	}

}
