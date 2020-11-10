package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// processamento em paralelo de envio de email de venda
		Thread threademail = new Thread(thread1);
		threademail.start();

//=========================divisão das thread=======================

		// processamento em paralelo envio da NF
		Thread threadenvionf = new Thread(thread2);
		threadenvionf.start();

		// Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE THREAD");
		// Fluxo do sistema, exemplo cadastro de venda, emissão de NF
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			// codigo da rotina

			// código da rotina que eu quero executar em paralelo
			for (int pos = 0; pos < 10; pos++) {

				// Executar esse envio com o tempo de parada ou com tempo determinado
				System.out.println("executando rotina, exemplo rotina envio nf.");
				try {
					Thread.sleep(2000);// executa o time informado
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			} // fim do código
		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// codigo da rotina

			// código da rotina que eu quero executar em paralelo
			for (int pos = 0; pos < 10; pos++) {

				// Executar esse envio com o tempo de parada ou com tempo determinado
				System.out.println("executando rotina, exemplo rotina de e-mail.");
				try {
					Thread.sleep(1000);// executa o time informado
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			} // fim do código

		}
	};

}
