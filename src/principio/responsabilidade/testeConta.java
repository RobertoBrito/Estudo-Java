package principio.responsabilidade;

public class testeConta {

	public static void main(String[] args) {
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("conta bancaria do roberto");

		System.out.println(bancaria);
		bancaria.diminui100reais();
		bancaria.diminui100reais();

		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(500);
		System.out.println(bancaria);
		bancaria.depositoDinheiro(8000);
		System.out.println(bancaria);

		bancaria.soma100reais();
		System.out.println(bancaria);
		
	}

}
