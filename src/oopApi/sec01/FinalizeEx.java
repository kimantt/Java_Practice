package oopApi.sec01;

public class FinalizeEx {

	public static void main(String[] args) {
		// System.gc() 활용 클래스의 finalize() 메서드 호출 예제
		Count count = null;
		for (int i = 0; i <= 50; i++) {
			count = new Count(i); // 생성된 객체가
			
			count = null; // 객체 참조를 잃어버림 - 쓰레기 객체가 됨
			System.gc(); // 가비지 콜렉터를 JVM에게 요청 - 메모리가 모자라거나 cpu가 여유가 있으면 gc는 cpu에 의해 자동호출
		}
		// gc()는 가비지 콜렉터 수행하기 바로 전에 소멸자 호출
	}

}
