package $7장.$10번문제.$문제;
/*
 * MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록
 * 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
 * getter와 setter 메서드를 추가하라.
 * 이전 채널로 이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
 * 메서드명 : gotoPrevChannel
 * 기능 : 현재 채널을 이전 채널로 변경
 * 반환타입 : 없음
 * 매개변수 : 없음
 * 
 */
public class $10번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 tv = new MyTv2();
		
		tv.setChannel(10);
		System.out.println(tv.getChannel());
		tv.setChannel(20);
		System.out.println(tv.getChannel());
		tv.gotoPrevChannel();
		System.out.println(tv.getChannel());
		tv.gotoPrevChannel();
		System.out.println(tv.getChannel());
	}

}

class MyTv2{
	
	private boolean isPowerOn;
	private int channel;
	private int prevChannel = 0;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void powerOn(){
		isPowerOn = !isPowerOn;
	}
	
	public int getChannel(){
		return channel;
	}
	
	public void setChannel(int channel){
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
			this.channel = 0;
		}
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
}