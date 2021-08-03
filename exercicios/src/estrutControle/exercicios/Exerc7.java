package estrutControle.exercicios;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		double n = 0;

		while (n >= 0) {
			System.out.println("Digite um valor: ");
			double num = scn.nextDouble();
			if (num >= 0) {
				n = n + num;

			} else {
				System.out.println("Você digitou um valor negativo, sistema encerrado!");
				break;
			}
			System.out.println("O valor da soma atual é: " + n);

		}
		scn.close();
	}
}
