package cursojava.classes;

/*Heran�a- classe pai ou master ou superclasse(Atributos comuns a todos os objetos filhos)*/
public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String cpf;
	protected String rg;
	protected String nomeMae;
	protected String nomePai;
	protected String email;
	protected String endere�o;
	protected String telefone;
/*m�todo abstrato � que fica na classe pai e � obrigatoria para as classes filhas*/
	public abstract double salario();
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
/*retornar true caso seja 18 +*/
	public boolean pessoaMaiorIdade() {
		return idade >=18;
	}
	
}
