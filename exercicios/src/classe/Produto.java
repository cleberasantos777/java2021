package classe;

public class Produto {

	String nome;
	double preco;
	static final double DESCONTO = 0.25;

	Produto() {

	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	static double precoComDesconto(double preco) {

		double pcd = preco - (preco * DESCONTO);
		return pcd;
	}

}
