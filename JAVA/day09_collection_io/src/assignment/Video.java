package assignment;

import java.util.Date;

public class Video {
	String title;
	String category;
	boolean islend;
	String lendName = "";
	Date lendDate;
	
	public Video() {}

	public Video(String title) {
		this.title = title;
		this.islend = false;
	}
		
	public Video(String title, String lendName, Date lendDate) {
		this.title = title;
		this.islend = true;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isIslend() {
		return islend;
	}

	public void setIslend(boolean islend) {
		this.islend = islend;
	}

	public String getLendName() {
		return lendName;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public Date getLendDate() {
		return lendDate;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	@Override
	public String toString() {
		String result = "";
		result = "제목 : " + title + "\n";
		if(islend) result += lendName + "님이 대출 중입니다.";
		else result += "대출 가능합니다.";
		return result;
	}
	
}
