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

			System.out.println("Digite um número entre 0 e 100: ");
			int num = scn.nextInt();

			if (num > n) {
				System.out.println("Número digitado é maior que o número gerado!");

			} else if (num < n) {
				System.out.println("Número digitado é menor que o número gerado!");

			} else if (num == n) {
				System.out.println("Parabéns, você acertou o número gerado!");
				break;
			} else {
				System.err.println("Infelizmente você não conseguiu, suas chances acabaram!");

			}
			System.out.println("Você ainda tem " + (t - i) + " Chances");

		}
		scn.close();

	}

}
