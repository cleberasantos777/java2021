package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		//Construtor padrão com data padrão 01/01/1970
		Data dt1 = new Data();
		dt1.day = 9;
		dt1.month = 3;
		dt1.year = 1987;

		//Contrutor criado
		Data dt2 = new Data(15,7,2012);
		
		String dataFormatada1 = dt1.obterDataFormatada();

		System.out.println(dataFormatada1);
		System.out.println(dt2.obterDataFormatada());
	}
}
