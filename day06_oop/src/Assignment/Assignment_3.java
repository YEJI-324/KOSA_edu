package Assignment;

class TV{
	private String channel;
	private String color;
	private int volume;
	
	public TV() {}
	
	public TV(String channel, String color, int volume) {
		super();
		this.channel = channel;
		this.color = color;
		this.volume = volume;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void display() {
		System.out.println("채널 : " + channel +", 색상 : " + color + ", 소리 : " + volume);
	}
}

public class Assignment_3 {
	public static void main(String[] args) {
		TV tv = new TV("KBS", "black", 30);
		tv.display();
	}
}
