package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.execao.ExecaoProcessarNota;

public class PrimeiraClasseJava {
//
	public static void main(String[] args) {

		try {/* exemplo de ler arquivo e da erro de exception */
			lerArquivo();

			String login = JOptionPane.showInputDialog("Login:");
			String senha = JOptionPane.showInputDialog("senha:");

			// PermitirAcesso permitirAcesso = new Secretario(login, senha);

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {/* Travar o contrato para autorizar somente quem tem o contrato 100% legítimo */

				List<Aluno> alunos = new ArrayList<Aluno>();
				
				/*  Lista que dentro dela tem uma chave que identifica uma sequencia de valores tbm	 */
				
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					/* new Aluno é uma instancia/criação do objeto */

					String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + qtd + "?");
					String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");
					/*
					 * String dataNascimento =
					 * JOptionPane.showInputDialog("Qual é a data de Nascimento?"); String cpf =
					 * JOptionPane.showInputDialog("Qual é o cpf do aluno?"); String RG =
					 * JOptionPane.showInputDialog("Qual é o RG aluno?"); String nomeMae =
					 * JOptionPane.showInputDialog("Qual é o nome da Mãe"); String nomePai =
					 * JOptionPane.showInputDialog("Qual é o nome do Pai?"); String dataMatricula =
					 * JOptionPane.showInputDialog("Qual é a data da matricula?"); //String email =
					 * JOptionPane.showInputDialog("Qual é o e-mail?"); //String telefone =
					 * JOptionPane.showInputDialog("Qual é o telefone?"); //String endereço =
					 * JOptionPane.showInputDialog("Qual é o endereço?"); String nomeEscola =
					 * JOptionPane.showInputDialog("Qual é o nome da escola?");
					 */

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setCpf(cpf);
					 * aluno1.setRg(RG); aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
					 * aluno1.setDataMatricula(dataMatricula); //aluno1.setEmail(email);
					 * //aluno1.setTelefone(telefone); //aluno1.setEndereço(endereço);
					 * aluno1.setNomeEscola(nomeEscola);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ? ");
					if (escolha == 0) {/* opção SIM é Zero */

						int continuarRemover = 0;
						int posicao = 1;
						while (continuarRemover == 0) {

							String disciplinaRemover = JOptionPane.showInputDialog("Qual é a disciplina 1,2,3 ou4 ? ");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover? ");

						}
					}
					alunos.add(aluno1);
				}
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERCAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {/* separei as listas */
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERCAO)) {
						maps.get(StatusAluno.RECUPERCAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}

				System.out.println("---------------------lista dos aprovados---------------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Os alunos " + aluno.getNome() + " Tiveram o Resultado = "
							+ aluno.getAlunoAprovado2() + "com média = " + aluno.getMedia());
				}
				System.out.println("---------------------lista dos reprovados---------------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Os alunos " + aluno.getNome() + " Tiveram o Resultado = "
							+ aluno.getAlunoAprovado2() + "com média = " + aluno.getMedia());
				}
				System.out.println("---------------------lista dos Recuperação---------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERCAO)) {
					System.out.println("Os alunos " + aluno.getNome() + " Tiveram o Resultado = "
							+ aluno.getAlunoAprovado2() + "com média = " + aluno.getMedia());
				}
				/*
				 * for (Aluno aluno : alunos) {
				 * 
				 * if (aluno.getNome().equalsIgnoreCase("roberto")) {
				 * 
				 * alunos.remove(aluno);
				 * 
				 * break; } else { System.out.println(aluno.toString());
				 * System.out.println("Média do aluno: " + aluno.getMedia());
				 * System.out.println("resultado é : " + aluno.getAlunoAprovado2());
				 * System.out.println(
				 * "--------------------------------------------------------------------------")
				 * ; } } for (Aluno aluno : alunos) {
				 * System.out.println("Alunos que sobraram na lista");
				 * System.out.println(aluno.getNome());
				 * System.out.println("Suas materias são:");
				 * 
				 * for (Disciplina disciplina : aluno.getDisciplinas()) {
				 * System.out.println(disciplina.getDisciplina()); } }
				 */

			} else {
				JOptionPane.showMessageDialog(null, "acesso negado!");
			}

		} catch (Exception e) {

			StringBuilder saida = new StringBuilder();
			e.printStackTrace();/* imprimi erro no console java */

			/* Mensagem do erro ou causa */
			System.out.println("Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de numero " + saida.toString());
		} /*catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "opa um null pointer ezception " + e.getClass());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da exeção customizada: " + e.getClass().getName());
		} */finally {/*
					 * Sempre é executado ocorrendo erros ou não. Porque finally sempre é usado
					 * quando se precisa executar um processo acontecendo erro ou não no sistema
					 */
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java");
		}
	}

	/* thows lança varias execeções, e o throw lança uma execeção
	 * public static void lerArquivo() throws ExecaoProcessarNota { 
	 * try { File file = new File("lines.txt"); Scanner scanner = new Scanner(file); 
	 * } catch
	 * (FileNotFoundException e) { throw new ExecaoProcessarNota(e.getMessage()); }
	 * }
	 */

	public static void lerArquivo() throws FileNotFoundException {

		File file = new File("d://lines.txt");
		Scanner scanner = new Scanner(file);

	}
}
