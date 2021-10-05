package kr.or.kosa.domain;

import java.util.Date;

// VO (Value Object) 
public class BoardVO { // model

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date readDate;
	private int readCount;
	
	public BoardVO() {
		super();
	}

	public BoardVO(int seq, String title, String writer, String content, Date readDate, int readCount) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.readDate = readDate;
		this.readCount = readCount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getReadDate() {
		return readDate;
	}

	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	
}
