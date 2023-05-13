package application;

import java.util.Scanner;

import service.VotoService;

public class Main {
	private static Scanner ler = new Scanner(System.in);
	private static VotoService service = new VotoService();
	public static void main(String[] args) {
		

		int opcao;

		do {

			System.out.println("---------------------------");
			System.out.println("      MENU PRINCIPAL");
			System.out.println("---------------------------\n");
			System.out
					.println("|	SISTEMA DE VOTAÇÃO			|\r\n" + "|      1 – Carregar Seção/Número Eleitor 	|\r\n"
							+ "|      2 – Classificar por Seção      		|\r\n"
							+ "|      3 – Gravar Registros                                	|\r\n"
							+ "|      4 – Mostrar Indicadores                                   |\r\n"
							+ "|      9 – Finalizar                                           \r\n" + "");

			System.out.println("Digite a opção desejada: ");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				service.cadastrarVoto();
				break;
			case 2:
				service.ordenarVotosPorSecao();
				break;

			case 3:
				service.gravarDados();
				break;
			case 4:
				menuIndicadores();
				break;
			default:
				System.out.println("opção invalida");
			}

		} while (opcao != 9);

		
		
		
		
	}

	public static void menuIndicadores() {
		int opcao;

		do {

			System.out.println("---------------------------");
			System.out.println("      MENU PRINCIPAL");
			System.out.println("---------------------------\n");
			System.out
					.println("|		    Mostrar Indicadores			           |\r\n"
							+ "|        Estatísticas de Votação em 2021		           |\r\n"
							+ "| 1 – Quantidade Eleitores por Seção	                         |\r\n"
							+ "| 2 –Seção com Maior e Menor número de Eleitores   |\r\n"
							+ "| 3 – Quantidade de votos por candidato                       |\r\n"
							+ "| 4 – 10 primeiros colocadas (nro cand. e qtd votos)   |\r\n"
							+ "| 9 – Finaliza consulta	                \r\n"
							);

			System.out.println("Digite a opção desejada: ");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1:
				service.exibirVotosPorSecao();
				break;
			case 2:
				service.secaoMaisMenosvotos();
				break;

			case 3:
				service.votosPorCandidato();
				break;
			case 4:
				service._10MaisVotados();
				break;
			default:
				System.out.println("opção invalida");
			}

		} while (opcao != 9);
	}
}
