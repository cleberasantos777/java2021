package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		// atribui��o por valor (Tipo primitivo)
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		// atribui��o por referencia (Objeto/Instancia)
		Data d1 = new Data(1,6,2022);
		Data d2 = d1;
		
		d1.day = 31;
		d2.month = 12;
		
		d1.year = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.day = 1;
		d.month = 1;
		d.year = 1970;		
	}
	
	static void alterarPrimitivo(int c) {
		c++;		
	}

}
