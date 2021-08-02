package classe;

public class Data {

	int day, month, year;

	Data() {
		//day = 1;
		//month = 1;
		//year = 1970;
		this(1,1,1970);
	}

	Data(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	String obterDataFormatada() {

		return String.format("%d/%d/%d", day, month, year);
	}

}
