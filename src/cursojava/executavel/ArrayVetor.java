package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	/* usado para executar código */

	public static void main(String[] args) {
		/* criação do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("roberto Brito");
		aluno.setNomeEscola("abre e Lima");
		
		/* ciração da Disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");

		double[] notas = { 8.8, 9.7, 8.5, 9.3 };
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");

		double[] notaLogica = { 8.8, 9.8, 7.9, 80 };
		disciplina2.setNota(notaLogica);

		aluno.getDisciplinas().add(disciplina2);
//----------------------------------------------------------------------------------------------
		Aluno[] arrayAlunos = new Aluno[1];
		arrayAlunos[0]= aluno;
		double NotM =0;
		double NotN=0;
		
		for(int pos=0; pos < arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno é : "+arrayAlunos[pos].getNome());
			
			for(Disciplina dis : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da Disciplina é: "+ dis.getDisciplina());
				
				for(int posNota=0; posNota < dis.getNota().length; posNota++) {
						
						if(posNota == 0) {
							NotM = dis.getNota()[posNota];
						}else {
							if(dis.getNota()[posNota] > NotM) {
								NotM = dis.getNota()[posNota];
							}
						}
						
						if(posNota ==0) {
							NotN = dis.getNota()[pos];
							} else {
								if(dis.getNota()[posNota] < NotN) {
									NotN = dis.getNota()[posNota];
								}
							}
						
					System.out.println("A Nota número : "+ (posNota+1)+" é igual = "+ dis.getNota()[posNota]);
					
				}
				System.out.println("         ");
				System.out.println("A Nota Maior da disciplina "+ dis.getDisciplina()+ " é : "+ NotM);
				System.out.println("A Nota menor da disciplina "+ dis.getDisciplina()+ " é : "+ NotN);
				System.out.println("         ");
			}
		}
		
		
		
		
		
		
		/*
		 * bloco de estudo sobre maior e menor nota em relçao a disciplina
		 * 
		 * 
		 * 
		 * System.out.println("Nome do Aluno é " + aluno.getNome() +", matriculado na escola " + aluno.getNomeEscola());
		 * System.out.println("---------------Disciplina do aluno-------------");
		 * 
		 * for (Disciplina disc : aluno.getDisciplinas()) {
		 * 
		 * System.out.println("Disciplina: " + disc.getDisciplina());
		 * System.out.println("As notas da disciplina são: ");
		 * 
		 * double notamax = 0.0;
		 * double notamin = 0.0;
		 *   
		 *   for (int pos = 0; pos < disc.getNota().length; pos++) { 
		 *   
		 * System.out.println("Nota " + (pos + 1) +" é igual =" + disc.getNota()[pos]); 
		 * if (pos == 0) { 
		 * 	notamax = disc.getNota()[pos]; 
		 * } else { 
		 *  if (disc.getNota()[pos] > notamax) {
		 *  	notamax = disc.getNota()[pos]; 
		 *  	}
		 *   } if(pos ==0) {
		 *    	notamin = disc.getNota()[pos]; 
		 *    }  else { 
		 *   	if(disc.getNota()[pos] < notamin) {
		 *    notamin = disc.getNota()[pos];
		 *     }
		 *  }
		 *  
		 * } 
		 * System.out.println("A menor nota da Disciplina= " + disc.getDisciplina() + " e de valor : " + notamin);
		 * System.out.println("A maior nota da Disciplina= " + disc.getDisciplina() + " e de valor : " + notamax);
		 *  }
		 * 
		 * 
		 * //formas de iniciar um vertor //double[] valores= new double[5];
		 * //double[]numero= {0.5,9.1};
		 * 
		 * 
		 * //passar varios tipos de dados, será por string
		 * 
		 * String[] teste = new String[4];
		 *  String[]teste1 = {"Roberto","90","Curso","contato@gmail.com"}; teste1[0]="Roberto";
		 * teste1[1]="90"; teste1[2]="Curso java"; teste1[3]="contato@gmail.com";
		 * 
		 * for (int post = 0; post < teste1.length; post++) {
		 * System.out.println("Valor da posição " +post + " é igual = "+teste1[post]); }
		 * 
		 * 
		 * 
		 * // String posicao =
		 * JOptionPane.showInputDialog("Quantas posições o array deve ter?");
		 * 
		 * 
		 * /* Array pode ser de todos os tipos de dados e objeto também
		 */
		/* array sempre deve ter a quantidade de posições defenidas */
		// double[] notas = new double[Integer.parseInt(posicao)];

		// for (int pos=0; pos < notas.length; pos ++) {

		// String valor = JOptionPane.showInputDialog("qual o valor da posição "
		// +(pos+1));
		// notas[pos]= Double.valueOf(valor);
		// }

		/*
		 * trabalhar com as posições notas[0] = 9.8; notas[1] = 7.8; notas[2] = 9.7;
		 * notas[3] = 8.8;
		 */

		/*
		 * deixando de forma dinamica o retorno do array //for (int post = 0; post <
		 * notas.length; post++) { //System.out.println("Nota "+ (post + 1) + " é = " +
		 * notas[post]);
		 * 
		 */
	}

}
