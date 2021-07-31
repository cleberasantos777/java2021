package classe;

public class Data {

	int day, month, year;

	Data() {
		day = 1;
		month = 1;
		year = 1970;
	}

	Data(int d, int m, int y) {

		day = d;
		month = m;
		year = y;
	}

	String obterDataFormatada() {

		return String.format("%d/%d/%d", day, month, year);
	}

}
