package service;

import java.io.IOException;
import java.util.Scanner;

import entity.Candidato;

public class candidatoService {
	private static Scanner ler = new Scanner(System.in);
	private static Candidato candidatos = new Candidato();
	private static IO io = new IO();

	public static void cadastrarCandidato() {
		candidatos = new Candidato("Branco", 0);

		String nome;
		int numero;
		System.out.printf("Digite o nome do candidato: %n");
		nome = ler.nextLine();

		System.out.printf("Digite o codigo do/a: %n", nome);
		numero = ler.nextInt();
		ler.nextLine();

		candidatos = new Candidato(nome, numero);

		io.gravarDados(candidatos.toStringCSV(), "candidatos.csv");

	}

	public static Candidato buscarCandidatoPorCodigo(int codigo) {

		for (Candidato candidato : io.LerDadosCandidatos("canidatos.csv")) {
			if (candidato.getCodigoCandidato() == codigo) {
				return candidato;
			}
		}
		return null;

	}
	
	public static void excluirCandidatos() throws IOException {
		io.excluirDados("candidatos.csv");

	}
}