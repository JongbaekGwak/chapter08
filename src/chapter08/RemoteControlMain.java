package chapter08;

public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControlTv remoteTv = new RemoteControlTv();

		remoteTv.turnOn();
		remoteTv.setVolume(7);
		remoteTv.setMute(true);
		remoteTv.turnOff();

		RemoteRadio remoteRadio = new RemoteRadio();
		remoteRadio.turnOn();
		remoteRadio.setFrequency(99.9);
		remoteRadio.setVolume(6);
		remoteRadio.setMute(true);
		remoteRadio.turnOff();

		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.setVolume(10);
		stv.setMute(true);
		stv.searchable("www.google.com");
		stv.turnOff();

		System.out.println("----- 다중 상속받은 인터페이스를 다시 상속받아 사용 -----");
		TvBox mibox = new AndroidTvBox();
		mibox.turnOn();
		mibox.searchable("google.com");
		mibox.setVolume(10);
		mibox.setMute(false);
		mibox.turnOff();

	}

}
