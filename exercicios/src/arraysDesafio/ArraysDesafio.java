package arraysDesafio;

import java.util.Scanner;

public class ArraysDesafio {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas: ");
		int qNts = scn.nextInt();

		double[] nts = new double[qNts];

		for (int i = 0; i < nts.length; i++) {
			System.out.println("Informe a nota nº " + (i + 1) + " : ");
			nts[i] += scn.nextDouble();
		}

		double total = 0;
		for (double media : nts) {
			total += media;
		}
		double media = total / nts.length;
		System.out.println("Sua nota final é: " + media);
		scn.close();
	}
}
