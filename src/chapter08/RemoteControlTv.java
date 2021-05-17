package chapter08;

public class RemoteControlTv implements RemoteControl {

	@Override
	public void turnOn() {
		 System.out.println("Tv 전원을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv 전원을 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Tv 볼륨을 " + volume + "으로 조절합니다.");
	}

}
