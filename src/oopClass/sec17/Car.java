package oopClass.sec17;

public class Car {
	// private 멤버변수이므로 인스턴스 통한 접근 불가
	private int speed;
	private boolean stop;
	
	// private 멤버변수에 접근하려면 클래스 내에서 접근해야함
	// private 멤버변수의 값을 수정하기 위한 setter와 멤버변수 값을 참조하기 위한 getter가 필요함
	
	// setter
	public void setSpeed(int speed) {
		// 멤버변수에 값 저장
		if (speed < 0)
			this.speed = 0;
		else
			this.speed = speed;
	}
	
	//getter
	public int getSpeed() {
		return speed;
	}

	//getter
	public boolean isStop() {
		return stop;
	}

	//setter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
