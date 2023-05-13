package service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import entity.Votos;

public class VotoService {
	private Votos[] votos = new Votos[200];
	// private Scanner io = new Scanner(System.in);

	public void cadastrarVoto() {

		for (int i = 0; i < 200; i++) {
			int secao, voto;

			// System.out.println("Digite o numero da sua seçao");
			// secao = io.nextInt();

			// System.out.println("Digite seu voto:");
			// voto = io.nextInt();

			secao = (int) (Math.random() * 11) + 1;
			voto = (int) (Math.random() * 199) + 1;

			votos[i] = new Votos(secao, voto);
		}
		
	}

	public void gravarDados() {
		String[] dados = stringArray(votos);
		File file = new File(System.getProperty("user.dir") + "//estatisticaVotacao//service//votos.csv");

		try (BufferedWriter io = new BufferedWriter(new FileWriter(file))) {
			for (String dado : dados) {
				if (dado != null) {
					io.write(dado);
					io.newLine();
				}

			}
			System.out.println("Arquivo de votação gerado");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void ordenarVotosPorSecao() {
		boolean continua;
		do {
			continua = false;
			Votos aux;
			for (int i = 0; i < votos.length - 1; i++) {
				if (votos[i].getSecao() > votos[i + 1].getSecao()) {
					aux = votos[i];
					votos[i] = votos[i + 1];
					votos[i + 1] = aux;
					continua = true;
				}
			}

		} while (continua);
	}

	public String[] stringArray(Votos[] votos) {
		String[] votosString = new String[votos.length];

		for (int i = 0; i < votos.length; i++) {
			votosString[i] = votos[i].toString();
		}
		return votosString;
	}

	public void exibirVotosPorSecao() {
		int comparacao = votos[0].getSecao();
		int votosNaSecao = 0;

		System.out.println("=====================");
		System.out.println("Seção      Votos");
		System.out.println("=====================");

		for (Votos voto : votos) {
			if (voto.getSecao() == comparacao) {
				votosNaSecao++;
			} else {
				System.out.printf(" %02d         %d %n", comparacao, votosNaSecao);
				votosNaSecao = 1;
				comparacao = voto.getSecao();
			}
		}
	}

	public void secaoMaisMenosvotos() {
		Integer mais = null, menos = null;
		Integer maisNumeroSecao = null, menosNumeroSecao = null;
		Integer apurando = votos[0].getSecao();
		int quantidadeDeVotos = 0;
		for (Votos voto : votos) {
			if (voto.getSecao() == apurando) {
				quantidadeDeVotos++;
			} else {
				if (mais == null || menos == null) {
					mais = quantidadeDeVotos;
					menos = quantidadeDeVotos;
					maisNumeroSecao = apurando;
					menosNumeroSecao = apurando;
				}
				if (quantidadeDeVotos > mais) {
					mais = quantidadeDeVotos;
					maisNumeroSecao = apurando;
				}
				if (quantidadeDeVotos < menos) {
					menos = quantidadeDeVotos;
					menosNumeroSecao = apurando;
				}

				quantidadeDeVotos = 1;
				apurando = voto.getSecao();
			}
		}

		if (mais == null) {
			mais = quantidadeDeVotos;
			maisNumeroSecao = apurando;
			menos = quantidadeDeVotos;
			menosNumeroSecao = apurando;
		}

		System.out.printf("A seção com mais voto foi a %d com %d votos%n", maisNumeroSecao, mais);
		System.out.printf("A seção com menos voto foi a %d com %d votos%n", menosNumeroSecao, menos);
	}

	public void votosPorCandidato() {
		Votos[] ordenadoPorCandidato = ordenarVotosPorCandidato();

		Integer comparacao = ordenadoPorCandidato[0].getVoto();
		int votos = 0;

		System.out.println("=====================");
		System.out.println("Candidato      Votos");
		System.out.println("=====================");

		for (Votos voto : ordenadoPorCandidato) {
			if (voto.getVoto() == comparacao) {
				votos++;
			} else {

				System.out.printf("%03d    %03d%n", comparacao, votos);
				comparacao = voto.getVoto();
				votos = 1;
			}
		}
	}

	public void _10MaisVotados() {
		Votos[] ordenadoPorCandidato = ordenarVotosPorCandidato();
		Integer[] _10Maisvotados = new Integer[10];

		Integer comparacao = ordenadoPorCandidato[0].getVoto();
		int votos = 0;

		_10Maisvotados[0] = ordenadoPorCandidato[0].getVoto();
		Integer[] votosDoCandidato = new Integer[10];

		for (Votos voto : ordenadoPorCandidato) {
			if (voto.getVoto() == comparacao) {
				votos++;
			} else {
				if (votosDoCandidato[0] == null) {
					votosDoCandidato[0] = votos;
				}
				for (int i = 0; i < votosDoCandidato.length; i++) {

					if (votos >= votosDoCandidato[i]) {
						for (int j = 8; j >= i; j--) {
							if (votosDoCandidato != null && _10Maisvotados != null) {
								votosDoCandidato[j + 1] = votosDoCandidato[j];
								_10Maisvotados[j + 1] = _10Maisvotados[j];
							}
						}
						votosDoCandidato[i] = votos;
						_10Maisvotados[i] = comparacao;
						
						i = votosDoCandidato.length;
					}
				}

				comparacao = voto.getVoto();
				votos = 1;
			}
		}

		System.out.println("=====================");
		System.out.println("Candidato      Votos");
		System.out.println("=====================");

		for (int i = 0; i < 10; i++) {

			System.out.printf("%03d    %03d%n", _10Maisvotados[i], votosDoCandidato[i]);

		}

	}

	private Votos[] ordenarVotosPorCandidato() {
		Votos[] ordenadoPorCandidato = votos;
		boolean continua;
		do {
			continua = false;
			Votos aux;
			for (int i = 0; i < ordenadoPorCandidato.length - 1; i++) {
				if (ordenadoPorCandidato[i].getVoto() > ordenadoPorCandidato[i + 1].getVoto()) {
					aux = ordenadoPorCandidato[i];
					ordenadoPorCandidato[i] = ordenadoPorCandidato[i + 1];
					ordenadoPorCandidato[i + 1] = aux;
					continua = true;
				}
			}

		} while (continua);
		return ordenadoPorCandidato;
	}

}
