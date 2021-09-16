package ex02.di;

public class NewRecordView {

	private NewRecord record;

	// use setter method for DI
	// Spring recommends setter method
	public void setRecord(NewRecord record) {
		this.record = record;
	}
	
	public void print() {
//		System.out.println(record.total() + " / " + record.avg());
		System.out.printf("kor : %d\n", record.getKor());
		System.out.printf("eng : %d\n", record.getEng());
		System.out.printf("math : %d\n", record.getMath());
		System.out.printf("com : %d\n", record.getCom());
		System.out.printf("total : %d\n", record.total());
		System.out.printf("avg : %f\n", record.avg());
	}

}
