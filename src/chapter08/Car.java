package chapter08;

public class Car {
//	interface Tire 타입의 변수 선언
//	interface Tire를 구현한 클래스는 HankookTire와 KumhoTire 이므로 해당 클래스의 객체를 Tire interface의 변수에 대입할 수 있음
//	Tire frontLeftTire = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire = new HankookTire();
//	Tire backRightTire = new HankookTire();

	Tire tires[] = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
//		interface 변수를 사용하여 자식 구현 객체(자식 객체)의 메서드를 실행
//		실행할 때 실핼하는 방법은 동일함
//		하지만 해당 interface 변수에 저장된 구현 객체에 따라서 결과값은 달라짐
//		frontLeftTire.roll();
//		frontRightTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();
		
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
