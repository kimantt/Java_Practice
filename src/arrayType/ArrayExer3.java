package arrayType;
import java.util.Random;

public class ArrayExer3 {

	public static void main(String[] args) {
		// 번호 생성 프로그램
		Random r = new Random();
		int[] number = new int[6];
		
		for (int i = 0; i < number.length; i++) {
			int temp = r.nextInt(45)+1; // 랜덤 숫자를 임시로 저장
			boolean dup = false;
			
			// 중복 검사
			for (int j = 0; j < i; j++) {
				if (number[j] == temp) {
					i--;
					dup = true;
					break;
				}
			}
			
			// 중복이 발견되지 않아야 배열에 값 저장
			if (!dup) {
				number[i] = temp;
				System.out.print(number[i] + "\t");
			}
		}
		System.out.println();
		
	}

}
