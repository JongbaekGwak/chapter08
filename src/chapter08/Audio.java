package chapter08;

public class Audio implements RemoteControl {
	private int volume; // 해당 클래스의 전용 필드

//	interface 를 통해서 상속받아 구현한 추상 메서드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");

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
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

	private void getVolume() {
		System.out.println("현재 오디오 볼륨은 " + volume + "입니다.");
	}

}
