package classeDesafio;

public class Jantar {
	
	public static void main(String[] args) {
				
		Comida comida1 = new Comida();
		comida1.nomeComida = "Arroz";
		comida1.pesoComida = 0.167;
		
		Comida comida2 = new Comida();
		comida2.nomeComida = "Feijão";
		comida2.pesoComida = 0.229;		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nomePessoa = "Janinha";
		pessoa1.pesoPessoa = 70;

		System.out.println(pessoa1.Comer(comida1.pesoComida));
		System.out.println(pessoa1.Comer(comida2.pesoComida));
		
		
	}
	

}
