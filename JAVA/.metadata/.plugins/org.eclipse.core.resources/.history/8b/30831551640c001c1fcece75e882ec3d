package quiz;

public class Person_Info {
	protected String strKg, strHight, strBMI, strResultBMI;
	protected int nSex;
	protected float fResultBMI;

	public Person_Info() {

	}

	public Person_Info(String strKg, String strHight, int nSex) {
		this.strKg = strKg;
		this.strHight = strHight;
		this.nSex = nSex;

		Proc_BMI();

	}

	private void Proc_BMI() {
		int nKg = Integer.parseInt(strKg);
		int nHight = Integer.parseInt(strHight);
		float fResult = (float) nKg / (((float) nHight / 100.0f) * ((float) nHight / 100.0f));
		// strBMI = String.valueOf(fResult);
		if (this.nSex == 1) {
			this.fResultBMI = fResult + 0.9f;
		} else {
			this.fResultBMI = fResult + 0.85f;
		}

		strBMI = ResultBMI(fResultBMI);

	}

	private String ResultBMI(float fBMI) {
		String str;
		if (fBMI >= 25.0)
			return str = "비만";
		else if (fBMI > 23.0f && fBMI <= 24.9)
			return str = "과체중";
		else if (fBMI > 18.5f && fBMI <= 22.9)
			return str = "정상";
		else if (fBMI <= 18.5)
			return str = "체중 부족";

		return " ";

	}
}
