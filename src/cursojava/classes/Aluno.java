package cursojava.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/*classe objeto representa aluno*/
public class Aluno extends Pessoa {

	private String dataMatricula;
	private String serieMatriculado;
	private String nomeEscola;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() {/* cria os dados na memoria- sendo padrão do java */

	}

	public Aluno(String nomePadrao) {
		super.nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		super.nome = nomePadrao;
		idade = idadePadrao;
	}

	/*
	 * Metodos Setters[setar dados,receber ou adicionar] e Getters[retornar dados,regastar ou obter o valor dos atributos] do objeto
	 */
	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
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

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public double getMedia() {
		double somaNota = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getMediaNotas();
		}

		return somaNota / disciplinas.size();
	}

	public boolean getAlunoAprovado() {
		double media = this.getMedia();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMedia();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERCAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", serieMatriculado=" + serieMatriculado + ", nomeEscola="
				+ nomeEscola + ", disciplinas=" + disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", rg=" + rg + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", email=" + email + ", endereço=" + endereço + ", telefone=" + telefone
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override /* identifica método sobreescrito */
	public boolean pessoaMaiorIdade() {

		return idade >= 21;
	}

	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba maior de idade" : "menor de idade vaza";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.97;
	}
}
