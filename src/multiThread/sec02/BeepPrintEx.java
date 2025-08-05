package multiThread.sec02;

public class BeepPrintEx {

	public static void main(String[] args) {
		// 출력담당 스레드, 기본 스레드
		Runnable beepTask = new  BeepTask(); // 스레드가 진행할 작업 객체
		// 두번째 스레드 구성 - 작업 task 전달
		Thread thread = new Thread(beepTask); // 작업객체를 포함한 스레드 생성
		
		thread.start(); // 멀티스레드(main, beepTask) // 비프음 출력 - 작업 1
		
		// 땡 출력 - 작업 2
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
