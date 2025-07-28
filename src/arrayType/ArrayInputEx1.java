package arrayType;
import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		// 숫자 5개 입력 받아서 최대값 구하는 프로그램
		int num[] = new int[5];
		int max;
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력
		System.out.println("숫자 입력");
		for (int i = 0; i < num.length; i++) {
			System.out.printf("num[%d] : ", i);
			num[i] = sc.nextInt();
		}
		
		// 입력된 값들 출력
		System.out.print("입력된 값 : ");
		for (int i = 0; i < num.length; i++)
			System.out.print(num[i] + " ");
		System.out.println();
		
		// 최대값 출력
		max = num[0]; // 최대값 초기화
		for (int i = 1; i < num.length; i++) {
			if (max < num[i])
				max = num[i];
		}
		System.out.println("최대값 : " + max);
	}

}
