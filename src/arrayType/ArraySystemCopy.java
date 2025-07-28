package arrayType;

public class ArraySystemCopy {

	public static void main(String[] args) {
		// System.arraycopy(원본배열, 시작 인덱스, 대상, 시작 인덱스, 복사할 갯수)
		int[] a = {1,2,3,4};
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 1, 3);
		// 목적지 배열의 인덱스값 확인해야함 (out of bounds)
		//System.arraycopy(a, 0, b, 1, a.length); // b배열의 크기가 4인데 1번 인덱스부터 시작해서 4개를 붙여넣으라는 의미 -> 인덱스 4를 사용해야함
		// arraycopy: last destination index 5 out of bounds for int[4]
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();

	}

}
