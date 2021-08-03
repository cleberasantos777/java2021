package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {

		//Produto p1 = new Produto("Notebook", 4356.89);
		
		double preco = 4356.89;
		double precoFinal1 = Produto.precoComDesconto(preco);
		double mediaCarrinho = precoFinal1;	
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	
	}

}
