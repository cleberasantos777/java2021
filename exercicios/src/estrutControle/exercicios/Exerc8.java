package estrutControle.exercicios;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {

		System.out.println("Digite uma palavra: ");
		Scanner scn = new Scanner(System.in);

		String p = scn.next();

		int ql = p.length();

		for (int i = 1; i <= ql; i++) {

			String pp = p.substring(i - 1, i);
			System.out.println(pp);

		}
		scn.close();

	}

}
