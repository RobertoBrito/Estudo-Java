package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		int notas[][] = new int[2][3];

		notas[0][0] = 80;
		notas[0][1] = 70;
		notas[0][2] = 60;

		notas[1][0] = 50;
		notas[1][1] = 40;
		notas[1][2] = 30;

		// Percorrendo as linhas da matriz
		for (int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("=======================================");
			// Para cada linha percorrer as colunas(array)
			for (int posColuna = 0; posColuna < notas[poslinha].length; posColuna++) {

				System.out.println("valor da matriz: " + notas[poslinha][posColuna]);

			}

		}

	}

}
