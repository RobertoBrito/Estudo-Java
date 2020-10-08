package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("roberto");
		aluno.setIdade(22);

		Diretor diretor = new Diretor();
		diretor.setNome("bruno");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setNome("José");
		secretario.setExperiencia("ADM");
		secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Salario Aluno  é = " + aluno.salario());
		System.out.println("Salario Diretor  é = " + diretor.salario());
		System.out.println("Salario Secretario  é = " + secretario.salario());

		Pessoa pessoa = new Aluno();
		pessoa = secretario;
		
		test(aluno);
		test(diretor);
		test(secretario);

	}

	public static void test(Pessoa pessoa) {
		System.out.println("Essa pessoa é " + pessoa.getNome() + " com o salario de " + pessoa.salario());
	}

}
