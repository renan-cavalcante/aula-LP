package service;

import java.util.List;
import java.util.Scanner;

import dados.BancoDados;
import entity.Conta;
import entity.MovimentoConta;

public class ContaServe {
	private static Scanner ler = new Scanner(System.in);
	private static BancoDados io = new BancoDados();

	public void cadastraCliente() {
		Integer codigoConta = null;
		String nomeCliente;
		Double saldoConta;
		Double limiteConta;
		Integer tipoConta;
		
		Boolean contaCadastrada = true;
		
		while(contaCadastrada) {
			System.out.print("Digite o codigo do cliente:");
			codigoConta = ler.nextInt();
			ler.nextLine();
			
			if(buscarContaPorCodigo(codigoConta) != null) {
				System.out.println("conta ja cadastrada");
			}else {
				contaCadastrada = false;
			}
		}	
		
		System.out.printf("%nDigite o nome do cliente:");
		nomeCliente = ler.nextLine();
		
		System.out.printf("%nDigite o valor do deposito inicial:");
		saldoConta = ler.nextDouble();
		
		System.out.printf("%nDigite o limite da conta:");
		limiteConta = ler.nextDouble();
		
		System.out.printf("%nDigite o tipo da conta:");
		tipoConta = ler.nextInt();
		
		Conta conta = new Conta(codigoConta, nomeCliente, saldoConta, limiteConta, tipoConta);
		io.gravarDados("conta.csv", conta.toStringCSV());
		
		
	}
	
	public Conta buscarContaPorCodigo(Integer codigo) {
		
		List<Conta> contas = io.lerDadosContas("conta.csv");
		for(Conta conta: contas) {
			if(conta.getCodigoConta() == codigo) {
				return conta;
			}
		}
		return null;
	}
	
	public void atualiarContas() {
		List<Conta> contas = io.lerDadosContas("conta.csv");
		List<MovimentoConta> movimentos = io.lerDadosMovimentos("movimentos.csv");
		int indice = 0;
		
		for(int i = 0; i < contas.size(); i++) {
			for(int j = indice; j < movimentos.size(); j++) {
				if(contas.get(i).getCodigoConta() == movimentos.get(j).getCodigoConta() ) {
					Conta contaAtualizada = contas.get(i);
					if(movimentos.get(j).getTipoMovimento() == 1) {
						contaAtualizada.saque(movimentos.get(j).getValorMovimento());
					}else if(movimentos.get(j).getTipoMovimento() == 2) {
						contaAtualizada.deposito(movimentos.get(j).getValorMovimento());
					}
					io.atualizarContas(i, contas.get(i).toStringCSV());
				}
				if(contas.get(i).getCodigoConta() != movimentos.get(j).getCodigoConta()) {
					indice = j;
					break;
				}
			}
		}
	}
	

}
