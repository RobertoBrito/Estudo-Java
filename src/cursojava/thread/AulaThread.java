package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// processamento em paralelo de envio de email de venda
		Thread threademail = new Thread(thread1);
		threademail.start();

//=========================divis�o das thread=======================

		// processamento em paralelo envio da NF
		Thread threadenvionf = new Thread(thread2);
		threadenvionf.start();

		// C�digo do sistema do usu�rio continua o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE THREAD");
		// Fluxo do sistema, exemplo cadastro de venda, emiss�o de NF
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");

	}

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			// codigo da rotina

			// c�digo da rotina que eu quero executar em paralelo
			for (int pos = 0; pos < 10; pos++) {

				// Executar esse envio com o tempo de parada ou com tempo determinado
				System.out.println("executando rotina, exemplo rotina envio nf.");
				try {
					Thread.sleep(2000);// executa o time informado
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			} // fim do c�digo
		}
	};

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// codigo da rotina

			// c�digo da rotina que eu quero executar em paralelo
			for (int pos = 0; pos < 10; pos++) {

				// Executar esse envio com o tempo de parada ou com tempo determinado
				System.out.println("executando rotina, exemplo rotina de e-mail.");
				try {
					Thread.sleep(1000);// executa o time informado
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			} // fim do c�digo

		}
	};

}
