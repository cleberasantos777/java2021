package classeDesafio;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.167);
		Comida c2 = new Comida("Feijao", 0.229);
		Pessoa p = new Pessoa("Janinha", 60.5);

		System.out.println(p.apresentacao());

		p.comer(c1);
		System.out.println(p.apresentacao());

		p.comer(c2);
		System.out.println(p.apresentacao());
	}
}
