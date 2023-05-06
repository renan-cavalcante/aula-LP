package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import application.Menu;
import entity.Candidato;
import entity.Votacao;

public class VotacaoService {

	private static Votacao[] votacao1 = new Votacao[10];
	private static Votacao[] votacao2 = new Votacao[10];
	private static List<Votacao> apuracao = new ArrayList<>();
	private static int[][] secaoValidas = { { 1, 2, 5 }, { 20, 30, 50 } };
	private static IO io = new IO();

	private static Integer contVotacao1 = 0, contVotacao2 = 0;
	private static Candidato[] resultado = MergeSort.conveterParaVetor2(io.LerDadosCandidatos("candidatos.csv"));

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

	private static Integer cadastrarVotacao(int sala, Integer contVotacao) {

		System.out.println("---------------------------\r\n" + "         Sala" + (sala + 1) + "\r\n"
				+ "---------------------------\r\n");
		Integer numeroEleitor = EntradaDeDados.inteiro("Digite seu numero de eleitor: ");
		Integer secao = EleitorService.secaoDoEleitor(numeroEleitor);
		boolean validacao = false, jaVotou = false;

		if (io.LerDadosVotacao("votacao" + (sala + 1) + ".csv").size() == 0) {
			validacao = true;
		}

		for (Votacao voto : io.LerDadosVotacao("votacao" + (sala + 1) + ".csv")) {
			if (voto != null) {
				if (voto.getNumeroEleitor() == numeroEleitor) {// verifica se ja votou
					System.out.println("Você ja votou");
					jaVotou = true;

				} else {

					validacao = true; //
				}
			} else {
				if (!jaVotou) {
					validacao = true;
				}
			}

		}
		if (validacao && !jaVotou) {
			return salvarVotacao(sala, secao, numeroEleitor, contVotacao);
		}
		return contVotacao;

	}

	private static Integer salvarVotacao(int sala, int secao, int numeroEleitor, Integer contVotacao) {
		boolean teste = false;
		String confirmacao;
		for (int j = 0; j < 3; j++) {
			if (secaoValidas[sala][j] == secao) {
				teste = true;

				if (contVotacao < 10) {
					Integer codCandidato;
					do {
						codCandidato = EntradaDeDados.inteiro("Digite o codigo do seu candidato: ");
						messagemVotacaoFinalizada(codCandidato);
						confirmacao = EntradaDeDados.string("");

					} while (!confirmacao.equalsIgnoreCase("s"));

					Votacao votacao = new Votacao(secao, codCandidato, numeroEleitor);
					io.gravarDados(votacao.toStringCSV(), "votacao" + (sala + 1) + ".csv");
					Menu.clear();

				} else {
					System.out.println("Limite de votos da sala atingido");
				}

			} else {
				if (j == 2 && !teste) {
					System.out.println("Essa não é sua sala");
				}
			}
		}
		return contVotacao;
	}

	public static void messagemVotacaoFinalizada(int codCandidato) {

		if (!candidatoNaoNulo(codCandidato)) {
			System.out.println("voto nulo \r \nDigite S para confirmar ou N para digitar novamente");
		} else if (codCandidato == 0) {
			System.out.println("votou em branco \r\nDigite S para confirmar ou N para digitar novamente");
		} else {
			System.out.println("votou em " + (candidatoService.buscarCandidatoPorCodigo(codCandidato)).getNome()
					+ " \\r\\nDigite S para confirmar ou N para digitar novamente");
		}
	}

	public static void escolherSala() {
		int sala;
		do {
			sala = EntradaDeDados.inteiro("---------------------------\n" + "     Menu de Votação\n"
					+ "---------------------------\n" + "1 - Sala 1 \n" + "2 - Sala 2\n"
					+ "9 - Voltar tela anterior\n\n" + "Digite a opção desejada:");
			Menu.clear();
			switch (sala) {
			case 1:
				contVotacao1 = cadastrarVotacao(0, contVotacao1);
				break;
			case 2:

				contVotacao2 = cadastrarVotacao(1, contVotacao2);
				break;
			case 9:

			default:
				System.out.println("Opção invalida");

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
		apuracao = MergeSort.mergeSort(io.LerDadosVotacao("votacao1.csv"), io.LerDadosVotacao("votacao2.csv"));
		resultado = calcularResultado(resultado);

	}

	public static void exibirEleitores() {
		agruparApuracao();
		for (int i = 0; i < apuracao.size(); i++) {
			System.out.println(EleitorService.buscarEleitorPorNumeroEleitor(apuracao.get(i).getNumeroEleitor()));
		}

	}

	public static void exibirResultados(int opcao) {

		System.out.println(resultado[opcao]); // Codigo funcional apenas para o menu que o satoshi pediu
	}

	public static Candidato[] calcularResultado(Candidato[] resultado) {

		for (Candidato candidato : resultado) {
			boolean encontrou = false;
			for (int i = 0; i < apuracao.size(); i++) {
				if (apuracao.get(i).getCodCandidato() == candidato.getCodigoCandidato()) {
					candidato.setQuantidadeDeVotos(candidato.getQuantidadeDeVotos() + 1);
					encontrou = true;
				}
			}
			if (!encontrou) {
				resultado[1].setQuantidadeDeVotos(candidato.getQuantidadeDeVotos() + 1);
			}
		}

		ordernarResultado();

		return resultado;

	}

	private static void ordernarResultado() {
		Candidato aux = new Candidato();
		boolean parar;
		do {
			parar = true;
			for (int i = 2; i < MergeSort.ultimaCasaVetor(resultado)-1 ; i++) {
				
				
					if (resultado[i].getQuantidadeDeVotos() < resultado[i + 1].getQuantidadeDeVotos()) {
						aux = resultado[i];
						resultado[i] = resultado[i + 1];
						resultado[i + 1] = aux;
						parar = false;

					
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
	
	public static void excluirVotacao() throws IOException {
		io.excluirDados("votacao1.csv");
		io.excluirDados("votacao2.csv");
	}

}
