package classeDesafio;

public class Pessoa {

	String nomePessoa;
	double pesoPessoa;

	Pessoa(String nome, double peso) {
		this.nomePessoa = nome;
		this.pesoPessoa = peso;
	}

	void comer(Comida comida) {
		if (comida != null) {
			pesoPessoa += comida.pesoComida;
		}
	}

	String apresentacao() {
		return "Ol� meu nome �: " + nomePessoa + " e tenho: " + pesoPessoa;
	}
}
