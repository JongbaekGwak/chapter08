package chapter08;

public class AndroidTvBox implements TvBox {

	@Override
	public void turnOn() {
		System.out.println("전원이 켜집니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("전원이 꺼집니다.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("볼뮬을 " + volume + "으로 조절 합니다.");

	}

	@Override
	public void searchable(String url) {
	System.out.println(url + "을 검색합니다.");

	}

}
