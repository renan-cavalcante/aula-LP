package application;

import service.ContaServe;
import service.MovimentosService;

public class ContasMan {
	private static ContaServe contaServe = new ContaServe();
	private static MovimentosService movimentoServe = new MovimentosService();
	public static void main(String[] args) {
		
		
		movimentoServe.cadastraMovimento();
		contaServe.atualiarContas();

	}

}
