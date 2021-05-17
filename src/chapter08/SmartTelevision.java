package chapter08;

//	interface를 통하면 자바에서 불가능했던 다중 상속이 가능함
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	@Override
	public void searchable(String url) {
		System.out.println(url + "을 검색합니다.");

	}

}
