package estrutControle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {

		int t = 10;
		int r = 100;

		Random g = new Random();
		int n = g.nextInt(r);
		Scanner scn = new Scanner(System.in);

		for (int i = 1; i <= t; i++) {

			System.out.println("Digite um n�mero entre 0 e 100: ");
			int num = scn.nextInt();

			if (num > n) {
				System.out.println("N�mero digitado � maior que o n�mero gerado!");

			} else if (num < n) {
				System.out.println("N�mero digitado � menor que o n�mero gerado!");

			} else if (num == n) {
				System.out.println("Parab�ns, voc� acertou o n�mero gerado!");
				break;
			} else {
				System.err.println("Infelizmente voc� n�o conseguiu, suas chances acabaram!");

			}
			System.out.println("Voc� ainda tem " + (t - i) + " Chances");

		}
		scn.close();

	}

}
