package chapter08;

public class RemoteCotrolEx {

	public static void main(String[] args) {
//		인터페이스에도 클래스처럼 다형성이 적용 됨
//		부모 인터페이스 타입으로 자식 클래스의 객채를 대입할 수 있음
//		부모 타입의 변수로 자식 객체의 메서드를 실행할 수 있음
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(7);
		rc.setMute(false);
//		rc.getVolume();	//	Audio 클래스의 전용 메서드 이므로 RemoteCotrol interface 타입인 rc를 이용해서는 사용할 수 없음
		rc.turnOff();
		
		System.out.println("----- 다중 상속 받았을 경우 -----");
//		만약 interface를 다중 상속받아 구현한 클래스를 interface 타입의 변수에 대입하면, 해당 interface 타입의 멤버만 사용이 가능함 	
		rc = new SmartTelevision();
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(10);
		rc.turnOff();
//		interface 변수 rc는 RemoteControl interface 타입의 변수이므로 RemoteControl interface의 멤버인 turnOn, turnOff, setMute, setVolume 만 사용이 가능함
//		search는 interface Searchable 의 멤버이므로 SEARCH를 사용하고 싶으면 SmartTelevision 클래스를 사용하여 실행하던지, Searchable interface의 변수를 이용하여 사용해야 함
//		rc.search("google.com");
		
		Searchable sa = new SmartTelevision();
		sa.searchable("google.com");
//		sa.turnOn(); // turnOn 은 RemoteControl interface의 멤버이기 때문에 사용 불가
	}

}
