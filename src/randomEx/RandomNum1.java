package randomEx;

public class RandomNum1 {

	public static void main(String[] args) {
		// 랜덤숫자 생성 - 1. Math.random() : 0 < 난수 < 1 -> 실수값으로 반
		for (int i=1; i<=10; i++) {
			double num = Math.random();
			int num1 = (int)(Math.random() * 10);
			System.out.println(num);
			System.out.println(num1);
		}

	}

}
