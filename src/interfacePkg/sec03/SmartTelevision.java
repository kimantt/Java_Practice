package interfacePkg.sec03;

public class SmartTelevision implements IRemoteControl, ISearchable {
	
	private int volume; // 인스턴스 멤버필드

	@Override
	public void sreach(String url) {
		System.out.println(url + "을 검색합니다");
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > IRemoteControl.MAX_VOLUME) {
			this.volume = IRemoteControl.MAX_VOLUME;
		} else if (volume < IRemoteControl.MIN_VOLUME) {
			this.volume = IRemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 스마트 TV 볼륨 : " + this.volume);
	}

}
