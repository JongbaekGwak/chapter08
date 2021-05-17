package chapter08;

//	interface Tire를 구현하는 KumhoTire 클래스
public class KumhoTire implements Tire {

//	Tire interface의 roll()을 구현 하여 오버라이딩
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}

}
