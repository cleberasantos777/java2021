package estrutControle.exercicios;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int n = s.nextInt();

		if (n >= 0 && n <= 10 && n % 2 == 0) {
			System.out.println("N�mero digitado: " + n + " est� entre 0 e 10!");
			System.out.println("N�mero digitado: " + n + " � Par!");
		}
		s.close();
	}
}
