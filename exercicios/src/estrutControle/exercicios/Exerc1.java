package estrutControle.exercicios;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = s.nextInt();

		if (n >= 0 && n <= 10 && n % 2 == 0) {
			System.out.println("Número digitado: " + n + " está entre 0 e 10!");
			System.out.println("Número digitado: " + n + " é Par!");
		}
		s.close();
	}
}
