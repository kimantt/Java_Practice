package package1;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동 타입변환
		byte byteVal = 10;
		int intVal = byteVal;
		System.out.println(intVal);
		
		char chrVal = '가';
		intVal = chrVal;
		System.out.println(intVal);
		
		long lngVal = 258960;	// 8byte
		float flVal = lngVal;	// 4byte - 값의 표현 범위는 float이 범위가 넓음 자동형변환 가능
		System.out.println(flVal);

		//intVal = flval;
		flVal = 25.23354f;
		intVal = (int)flVal;	//(int)리터럴 또는 변수 -> int형으로 강제 타입변환 발생하게 
		System.out.println(intVal);
		
		intVal = 10230984;
		byte byteValue = (byte)intVal;
		System.out.println(byteVal);
		
	}

}
