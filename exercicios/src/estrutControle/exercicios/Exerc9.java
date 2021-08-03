package estrutControle.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<Integer>();

		Scanner scn = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.println("Digite 1 número: ");
			int n = scn.nextInt();

			num.add(n);

		}

		System.out.println("O maior numero digitado foi: " + Collections.max(num));

		scn.close();
	}

}
