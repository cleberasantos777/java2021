package estrutControle.exercicios;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Digite a 1� nota: ");
		double n1 = scn.nextDouble();
		System.out.print("Digite a 2� nota: ");
		double n2 = scn.nextDouble();

		double mf = (n1 + n2) / 2;

		if (mf >= 7) {
			System.out.println("Sua m�dia �: " + mf + " voc� foi Aprovado!");
		} else if (mf < 7 && mf > 4) {
			System.out.println("Sua m�dia �: " + mf + " voc� est� em Recupera��o!");
		} else {
			System.out.println("Sua m�dia �: " + mf + " voc� foi Reprovado!");

		}
		scn.close();
	}

}
