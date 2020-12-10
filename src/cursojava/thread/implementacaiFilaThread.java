package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaiFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);
	}

	@Override
	public void run() {
		System.out.println("fila Rodando");

		

		while (true) {
			
			synchronized (pilha_filha) {// Bloquear acesso a esta lista por outro processos
				Iterator iteracao = pilha_filha.iterator();
				while (iteracao.hasNext()) {/* enquanto conter dados na lista irá processar */
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();// pego o objeto da lista

					/* Processar 10 mil notas ficais/ rotina da empresa / gerar envio de email em */
					System.out.println("___________________________________");

					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());

					iteracao.remove();

					try {
						Thread.sleep(100);/* dar um tempo para a descarga de memoria */
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

				}

			}
			try {
				Thread.sleep(100);// processou toda a lista, dá um tempo para a limpeza da memoria
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}
