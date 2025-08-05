package multiThread.sec02;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	// beep음 출력 담당
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// 비프음 출력 - 작업 1
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // 0.5초 지연
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
