package service;

import entity.Candidato;
import entity.Votacao;

public class VotacaoService {

	private static Votacao[] votacao1 = new Votacao[10];
	private static Votacao[] votacao2 = new Votacao[10];
	private static Votacao[] apuracao = new Votacao[20];
	private static int[][] secaoValidas = { { 1, 2, 5 }, { 20, 30, 50 } };

	private static Integer contVotacao1 = 0, contVotacao2 = 0;
	private static Candidato[] resultado = new Candidato[4];

	public static void testeCadastrarVotacao() {
		votacao1[0] = new Votacao(01, 1, 123);
		votacao1[1] = new Votacao(02, 1, 124);
		votacao1[2] = new Votacao(05, 2, 125);
		votacao1[3] = new Votacao(01, 2, 129);
		votacao1[4] = new Votacao(02, 1, 130);
		votacao1[5] = new Votacao(05, 7, 131);

		votacao2[0] = new Votacao(20, 0, 126);
		votacao2[1] = new Votacao(30, 0, 127);
		votacao2[2] = new Votacao(50, 5, 128);

	}

	private static void cadastrarVotacao(int sala, Votacao[] votacao, Integer contVotacao) {

		Integer numeroEleitor = EntradaDeDados.inteiro("Digite seu numero de eleitor: ");
		Integer secao = EleitorService.secaoDoEleitor(numeroEleitor);
		boolean validacao = false, jaVoltou = false;

		for (Votacao voto : votacao) {
			if (voto != null) {
				if (voto.getNumeroEleitor() == numeroEleitor) {
					System.out.println("Você ja votou");
					jaVoltou = true;

				} else {

					validacao = true;
				}
			} else {
				if (!jaVoltou) {
					validacao = true;
				}
			}

		}
		if (validacao) {
			salvarVotacao2(sala, secao, votacao, numeroEleitor, contVotacao);
		}

	}

	private static void salvarVotacao2(int sala, int secao, Votacao[] votacao, int numeroEleitor, Integer contVotacao) {
		boolean teste = false;
		for (int j = 0; j < 3; j++) {
			if (secaoValidas[sala][j] == secao) {
				teste = true;

				if (contVotacao < votacao.length) {
					Integer codCandidato = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
					votacao[contVotacao] = new Votacao(secao, codCandidato, numeroEleitor);
					contVotacao++;
					messagemVotacaoFinalizada(codCandidato);

					if (contVotacao >= 9) {
						MergeSort.mergeSort(10, votacao);
					}

				} else {
					System.out.println("Limite de votos da sala 1 atingido");
				}

			} else {
				if (j == 2 && !teste) {
					System.out.println("Essa não é sua sala");
				}
			}
		}
	}

	private static void salvarVotacao(int sala, int secao, Votacao[] votacao, int numeroEleitor) {
		boolean teste = false;
		for (int j = 0; j < 3; j++) {
			if (secaoValidas[sala][j] == secao) {
				teste = true;
				if (sala == 0) {
					if (contVotacao1 < votacao.length) {
						Integer codCandidato = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
						votacao1[contVotacao1] = new Votacao(secao, codCandidato, numeroEleitor);
						contVotacao1++;
						messagemVotacaoFinalizada(codCandidato);

						if (contVotacao1 >= 9) {
							MergeSort.mergeSort(10, votacao1);
						}

					} else {
						System.out.println("Limite de votos da sala 1 atingido");
					}
				} else {
					if (contVotacao2 < votacao.length) {
						Integer codCandidato = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
						votacao2[contVotacao2] = new Votacao(secao, codCandidato, numeroEleitor);
						contVotacao2++;
						messagemVotacaoFinalizada(codCandidato);

						if (contVotacao2 >= 9) {
							MergeSort.mergeSort(10, votacao2);
						}

					} else {
						System.out.println("Limite de votos da sala 2 atingido");
					}
				}

			} else {
				if (j == 2 && !teste) {
					System.out.println("Essa não é sua sala");
				}
			}
		}
	}

	public static void messagemVotacaoFinalizada(int codCandidato) {

		if (!candidatoNaoNulo(codCandidato)) {
			System.out.println("VocÊ votou nulo");
		} else if (codCandidato == 0) {
			System.out.println("Você votou em branco");
		} else {
			System.out.println("você votou em " + (candidatoService.buscarCandidatoPorCodigo(codCandidato)).getNome());
		}
	}
	/*
	 * public static void cadastrarVotacao(int i) {
	 * 
	 * Integer numeroEleitor =
	 * EntradaDeDados.inteiro("Digite seu numero de eleitor: "); Integer secao =
	 * EleitorService.secaoDoEleitor(numeroEleitor);
	 * 
	 * for (int j = 0; j < 3; j++) { if (i == 1) {
	 * 
	 * if (secaoValidas[0][j] == secao) { if (contVotacao1 > 9) {
	 * System.out.println("Limite de votos da sala 1 atingido"); } else { Integer
	 * codCandidato = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
	 * votacao1[contVotacao1] = new Votacao(secao, codCandidato, numeroEleitor);
	 * contVotacao1++; escolherSala(); if (contVotacao1 >= 9) {
	 * MergeSort.mergeSort(10, votacao1); }
	 * 
	 * }
	 * 
	 * } else { System.out.println("Se��o invalida"); }
	 * 
	 * } else if (i == 2) { if (secaoValidas[1][j] == secao) { if (contVotacao2 > 9)
	 * { System.out.println("Limite de votos da sala 1 atingido"); } else { Integer
	 * codCandidato = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
	 * votacao2[contVotacao2] = new Votacao(secao, codCandidato, numeroEleitor);
	 * contVotacao2++; escolherSala(); if (contVotacao2 >= 9) {
	 * MergeSort.mergeSort(10, votacao2); } }
	 * 
	 * } else { System.out.println("Se��o invalida"); } }
	 * 
	 * }
	 * 
	 * }
	 */

	public static void escolherSala() {
		int sala;
		do {
			sala = EntradaDeDados.inteiro("1 - sala 1 \n" + " 2 -  sala 2\n" + "9 - Voltar tela anterior\n");
			switch (sala) {
			case 1:
				cadastrarVotacao(0, votacao1, contVotacao1);
				break;
			case 2:
				cadastrarVotacao(1, votacao2, contVotacao2);
				break;
			case 9:

			default:
				System.out.println("Op��o invalida");

			}
		} while (sala != 9);

	}

	public static void exibirApuracao() {
		agruparApuracao();
		System.out.println("    Apuração");
		System.out.println(".............................");
		System.out.println("Seção  codCandidato   numEleitor");
		System.out.println(".............................");

		for (Votacao voto : apuracao) {
			System.out.printf("%03d         %02d          %d%n%n", voto.getSecao(), voto.getCodCandidato(),
					voto.getNumeroEleitor());
		}
	}

	public static void agruparApuracao() {
		apuracao = MergeSort.mergeSort(votacao1, votacao2);
		resultado = calcularResultado(resultado);

	}

	public static void exibirEleitores() {
		agruparApuracao();
		for (int i = 0; i < apuracao.length; i++) {
			System.out.println(EleitorService.buscarEleitorPorNumeroEleitor(apuracao[i].getNumeroEleitor()));
		}

	}

	public static void exibirResultados(int opcao) {

		System.out.println(resultado[opcao]); // Codigo funcional apenas para o menu que o satoshi pediu
	}

	public static Candidato[] calcularResultado(Candidato[] resultado) {
		int candidatoAux = apuracao[0].getCodCandidato();
		int votos = 0, j = 0, nulos = 0;
		for (int i = 0; i < MergeSort.ultimaCasaVetor(apuracao); i++) {

			if (apuracao[i].getCodCandidato() == candidatoAux) {
				votos++;
				if (i == MergeSort.ultimaCasaVetor(apuracao) - 1) {
					resultado[j] = new Candidato(candidatoService.buscarCandidatoPorCodigo(candidatoAux), votos);
				}

			} else {
				if (i == MergeSort.ultimaCasaVetor(apuracao) - 1) {
					resultado[j] = new Candidato(candidatoService.buscarCandidatoPorCodigo(candidatoAux), votos);
				}

				if (!candidatoNaoNulo(apuracao[i].getCodCandidato())) {
					nulos++;
				} else {

					resultado[j] = new Candidato(candidatoService.buscarCandidatoPorCodigo(candidatoAux), votos);
					j++;
					candidatoAux = apuracao[i].getCodCandidato();
					votos = 1;
				}
			}

		}
		j++;
		resultado[j] = new Candidato("Nulos", 99, nulos);
		ordernarResultado();

		return resultado;

	}

	private static void ordernarResultado() {
		Candidato aux = new Candidato();
		boolean parar;
		do {
			parar = true;
			for (int i = 0; i < MergeSort.ultimaCasaVetor(resultado) - 3; i++) {
				if (resultado[i].getNome().equals("Branco")) {
					aux = resultado[i];
					resultado[i] = resultado[resultado.length - 2];
					resultado[resultado.length - 2] = aux;
					parar = false;
				} else {
					if (resultado[i].getQuantidadeDeVotos() < resultado[i + 1].getQuantidadeDeVotos()) {
						aux = resultado[i];
						resultado[i] = resultado[i + 1];
						resultado[i + 1] = aux;
						parar = false;

					}
				}
			}
		} while (!parar);
	}

	public static boolean candidatoNaoNulo(int codigo) {
		if (codigo == 0 || codigo == 1 || codigo == 2) {
			return true;
		} else {
			return false;
		}
	}

}
