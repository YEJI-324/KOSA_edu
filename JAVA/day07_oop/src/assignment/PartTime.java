package assignment;

public class PartTime extends Employee {
	private int hour, day, hourlyWage;

	public PartTime(int hour, int day, int hourlyWage) {
		super();
		this.hour = hour;
		this.day = day;
		this.hourlyWage = hourlyWage;
	}

	public PartTime(String name, String tel, String depart, String rank, int hour, int day, int hourlyWage) {
		super(name, tel, depart, "아르바이트");
		this.hour = hour;
		this.day = day;
		this.hourlyWage = hourlyWage;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int calculateSalary() {
		return hour * day * hourlyWage;
	}

	public void display() {
		super.display();
		System.out.println("총 일한 일수 : " + day + "일, 일한 시간 : " + hour + "시간, 시급 : " + hourlyWage);
		System.out.println("이번달 급여 : " + calculateSalary());
	}

}
