package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	/* usado para executar código */

	public static void main(String[] args) {
		/*criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("roberto");
		aluno.setNomeEscola("abre e Lima");
		/*ciração da Disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		
		double[] notas = {8.8 , 9.7 , 8.5 , 9.3}; 
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		
		double[] notaLogica = {8.8 , 9.8, 7.9 , 80};
		disciplina2.setNota(notaLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		
		
		
		
		
		
		
		
/*
	//formas de iniciar um vertor
		//double[] valores= new double[5];
		//double[]numero= {0.5,9.1};
		
		
//passar varios tipos de dados, será por string
		
		String[] teste = new String[4];
		String[]teste1 = {"Roberto","90","Curso","contato@gmail.com"};
		teste1[0]="Roberto";
		teste1[1]="90";
		teste1[2]="Curso java";
		teste1[3]="contato@gmail.com";
			
		for (int post = 0; post < teste1.length; post++) {
			System.out.println("Valor da posição " +post + " é igual = "+teste1[post]);
		}
		
		
		
	//	String posicao = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
		
		
		/* Array pode ser de todos os tipos de dados e objeto também */
		/* array sempre deve ter a quantidade de posições defenidas */
	//	double[] notas = new double[Integer.parseInt(posicao)];
		
		
	//	for (int pos=0; pos < notas.length; pos ++) {
			
	//		String valor = JOptionPane.showInputDialog("qual o valor da posição " +(pos+1));
	//		notas[pos]= Double.valueOf(valor);
	//	}

		/* trabalhar com as posições 
		notas[0] = 9.8;
		notas[1] = 7.8;
		notas[2] = 9.7;
		notas[3] = 8.8;*/
		
		/*deixando de forma dinamica o retorno do array
		//for (int post = 0; post < notas.length; post++) {
			//System.out.println("Nota "+ (post + 1) + " é = " + notas[post]);
			
	*/
	}

}
