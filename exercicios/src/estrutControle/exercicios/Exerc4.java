package estrutControle.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exerc4 {

	public static void main(String[] args) {

		ArrayList<Double> r = new ArrayList<Double>();

		double n = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero"));

		for (int i = 1; i <= n; i++) {

			double vlr = n / i;

			if (vlr == (int) vlr) {
				r.add(vlr);
			}

		}
		if (n == 1 || r.size() >= 3) {
			System.out.println("O N�mero " + n + ", N�o � Primo!");
		} else {
			System.out.println("O N�mero " + n + ", � Primo!");
		}

		System.out.println(r);
		System.out.println(r.size());

	}
}
