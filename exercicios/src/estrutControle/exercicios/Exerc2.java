package estrutControle.exercicios;

import java.util.Calendar;

public class Exerc2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		int diasAnoAtual = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

		if (diasAnoAtual > 365) {
			System.out.println("O ano atual de: " + anoAtual + " é bissexto!");

		} else {
			System.out.println("O ano atual de: " + anoAtual + " Não é bissexto!");
			
		}

	}

}
