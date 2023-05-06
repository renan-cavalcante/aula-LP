package service;

import java.io.IOException;
import java.util.Scanner;

import entity.Eleitor;

public class EleitorService {
	private static Eleitor eleitores;
	private static Scanner ler = new Scanner(System.in);
	private static IO io = new IO();

	public static void cadastrarEleitor() {
		Integer numeroEleitor;
		String nomeEleitor;
		Integer secao;
		boolean continuar;
		do {

			numeroEleitor = EntradaDeDados.inteiro("Digite o numero do eleitor: ");
			if (buscarEleitorPorNumeroEleitor(numeroEleitor) == null) {
				nomeEleitor = EntradaDeDados.string("Digite o nome do eleitor: ");
				secao = EntradaDeDados.inteiro("Digite a seção do eleitor: ");
				eleitores = new Eleitor(numeroEleitor, nomeEleitor, secao);
				io.gravarDados(eleitores.toStringCSV(), "eleitores.csv");

				System.out.println("Cadastrar mais um eleitor? (S/N): ");
				String leitura = ler.next();
				continuar = leitura.equals("s") ? true : false;
			} else {
				System.out.println("Numero de eleitor ja cadastrado");
				continuar = true;
			}

		} while (continuar);

	}

	public static Integer secaoDoEleitor(int numeroEleitor) {
		for (Eleitor eleitor : io.LerDadosEleitores("eleitores.csv")) {
			if (eleitor.getNumeroEleitor().equals(numeroEleitor)) {
				return eleitor.getSecao();
			}
		}
		return -1;
	}

	public static Eleitor buscarEleitorPorNumeroEleitor(int numero) {
		for (Eleitor eleitor : io.LerDadosEleitores("eleitores.csv")) {
			if (eleitor.getNumeroEleitor() == numero) {
				return eleitor;
			}
		}
		return null;
	}
	
	public static void excluirVotacao() throws IOException {
		io.excluirDados("eleitores.csv");
	}
}
