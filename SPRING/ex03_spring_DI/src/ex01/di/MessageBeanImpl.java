package ex01.di;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String greeting;
	
	// 1. using constructor
	public MessageBeanImpl() { }
		
	public MessageBeanImpl(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}

	// 2. using setter method
	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	@Override
	public void sayHello() {
		System.out.println(greeting + " / " + name + "!!");
	}

}
