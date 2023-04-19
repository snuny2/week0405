package test_oj;

public class runTV {

	public static void main(String[] args) {
		test_tv tv1 = new test_tv(); //main memory에 적제한다. (객체가 생성된다.)		클래스파일 이름써야한다.
		test_tv tv2 = new test_tv();
		
		tv1.setProducer("LG전자");
		tv1.setColor("White");
		tv1.setModelNum("LG2023041901");
		tv1.setChanner(6);
		
		tv2.setProducer("삼성전자");
		tv2.setColor("Black");
		tv2.setModelNum("ss2023041902");
		tv2.setChanner(1);
		
		tv1.powerOn();
		tv1.upChannel();
		tv1.upChannel();
		tv1.upChannel();
		for(int i = 0; i < 10; i++) {
		tv1.upVolume();
		}
		
		tv2.powerOn();
		for(int i = 0; i < 20; i++) {
			tv2.upChannel();
		}
		tv2.downChannel();
	}

}
