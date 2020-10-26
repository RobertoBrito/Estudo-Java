package cursojava.thread;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {

		for (int pos = 0; pos < 10; pos++) {
			
			// Executar esse envio com o tempo de parada ou com tempo determinado
			System.out.println("executando rotina, exemplo rotina de e-mail.");
			Thread.sleep(2000);//da um tempo para executar
		}
	}
}
