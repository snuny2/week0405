package test_oj;

public class test_tv {
	// 추상화 과정에서 선택된 속성은 필드로 선언
	// setter 메소드 : 필드값 생성하는 메소드       set필드명( ) => setProducer( )
	// getter 메소드 : 필드값 반환하는 메소드       get필드명( ) => getProducer( )
	
	private String producer;
	private String modelNum;
	private String color;
	private int size;
	private int channel;
	private int volume;
	
	public int getChanner() {
		return channel;
	}
	public void setChanner(int channel) {
		this.channel = channel;
	}
	public int getValum() {
		return volume;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer; // this.이 붙어 구분한다
	}
	public String getModelNum() {
		return modelNum;
	}
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	// 추상화 과정에서 선택된 기능은 메소드로
	public void powerOn() {
		System.out.println(color + "색상 TV 전원을 켜다");
	}
	public void powerOff() {
		System.out.println(color + "색상 TV 전원을 끄다");
	}
	
	public void upChannel() {
		System.out.println("현재 채널은 " + ++channel + "번");
	}
	public void downChannel() {
		System.out.println("현재 채널은 " + --channel + "번");
	}
	
	public void upVolume() {
		System.out.println("현재 볼륨은 " + ++volume);
	}
	public void downVolume() {
		System.out.println("현재 볼륨은 " + --volume);
	}
}
