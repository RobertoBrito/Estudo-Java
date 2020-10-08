package cursojava.execao;

public class ExecaoProcessarNota extends Exception {
	public ExecaoProcessarNota(String erro) {
		super("Eita Erro no Processamento do arquivo "+erro);
		
	}

}
