package ex01.di;

public class NewRecordView {

	private NewRecord record;

	// use constructor for DI
	public NewRecordView(int kor, int math, int eng, int com) {
		record = new NewRecord(kor, math, eng, com);
	}

	public void print() {
		System.out.println(record.total() + " / " + record.avg());
	}

}
