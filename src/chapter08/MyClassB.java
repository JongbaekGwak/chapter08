package chapter08;

//우리 회사에서 우리 인터페이스를 사용하여 개발한 클래스
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB - method1() 실행");

	}
	
//	인터페이스에서 디폴트 매서드를 추가하여 필요애 따라서 오버라이딩을 진행하여 사용
	@Override
	public void method2() {
		System.out.println("MyClassB - method2() 실행");
	}

}
