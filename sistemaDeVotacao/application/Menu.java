package application;

import java.util.Scanner;

import service.EleitorService;
import service.EntradaDeDados;
import service.VotacaoService;
import service.candidatoService;
import teste.Teste;

public class Menu {
	private static Scanner ler = new Scanner(System.in);
	public static void main(String[]args) {
		
		//Menu menu;
		int opcao;
		
		//menu = opcao;
		
		
		
		do {
			
			System.out.println("---------------------------");
			System.out.println("      MENU PRINCIPAL");
			System.out.println("---------------------------\n");
			System.out.println("1 - Cadastrar elitor\n"
							+ "2 - Cadastrar votaï¿½ï¿½o 1 e 2\n"
							+ "3 - Agrupar apuraï¿½ï¿½o\n"
							+ "4 - Menu estatï¿½stica\n"
							+ "9 - Fim\n");
			
			System.out.println("Digite a opï¿½ï¿½o desejada: "); 
			opcao = ler.nextInt();
			
			switch (opcao) {
			case 0:
				//Teste.cadastrarCandidato();
				//candidatoService.cadastrarCandidato();
				candidatoService.testCadastrarCandidato();
				break;
			case 1:
				//Teste.cadastrarEleitor();
				//EleitorService.cadastrarEleitor();
				EleitorService.testeCadastrarEleitor();
				break;
			case 2:
				VotacaoService.escolherSala();
				//VotacaoService.testeCadastrarVotacao();
				break;
				
			case 3:
				VotacaoService.agruparApuracao();
				break;
			case 4:
				menuEstatisticas();
				break;
			default: 
				System.out.println("OpÃ§aÃµ invalida");
			}
		
		}while(opcao != 9);
		
	}
	
	public static void menuEstatisticas() {
		int opcao;
		do {
			System.out.println("......................................................       \r\n"
					+ ".    MENU ESTATÃ�STICA                  .       \r\n"
					+ "......................................................       \r\n"
					+ ". 1 - Vencedor                                    .                                \r\n"
					+ ". 2 - Segundo colocado                         .        \r\n"
					+ "  3 - Quantidade de votos em branco                  .       \r\n"
					+ ". 4 - Quantidade de votos nulos                      .       \r\n"
					+ ". 5 - Mostra eleitores                               .\r\n"
					+ ". 6 - Mostra apuraÃ§Ã£o                               .\r\n"
					+ ". 9 - FIM                                            \r\n"
					+ "");
			opcao = EntradaDeDados.inteiro("Digite a opï¿½ï¿½o desejada: ");
			
			switch (opcao) {
				case 1:
				case 2:
				case 3:
				case 4:
						
					VotacaoService.exibirResultados(opcao-1);
					break;
					
				case 5: 
					VotacaoService.exibirEleitores();
					break;
				case 6:
					VotacaoService.exibirApuracao();
					break;
				default:
					System.out.println("OpÃ§Ã£o invalida");
				
			}
			
		}while(opcao != 9);
	}

}
