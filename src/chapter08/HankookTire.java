package chapter08;

//	interface Tire를 구현하는 HAnkookTire 클래스
public class HankookTire implements Tire {

//	Tire interface의 추상 메서드 roll()을 오버라이딩
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}

}
