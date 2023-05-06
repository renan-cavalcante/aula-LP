package application;

import java.io.IOException;
import java.util.Scanner;

import service.EleitorService;
import service.EntradaDeDados;
import service.VotacaoService;
import service.candidatoService;
//import teste.Teste;

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
							+ "2 - Cadastrar votação 1 e 2\n"
							+ "3 - Agrupar apuração\n"
							+ "4 - Menu estatística\n"
							+ "5 - Excluir dados\n"
							+ "9 - Fim\n");
			
			System.out.println("Digite a opção desejada: "); 
			opcao = ler.nextInt();
			clear();
			
			switch (opcao) {
			case 0:
				
				candidatoService.cadastrarCandidato();
		
				break;
			case 1:
				//Teste.cadastrarEleitor();
				EleitorService.cadastrarEleitor();
				
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
			case 5:
				menuExclusão();
				break;
			default: 
				System.out.println("opção invalida");
			}
		
		}while(opcao != 9);
		
	}
	
	public static void menuEstatisticas() {
		int opcao;
		do {
			System.out.println("......................................................       \r\n"
					+ ".    MENU ESTAÍSTICA                  .       \r\n"
					+ "......................................................       \r\n"
					+ ". 1 - Vencedor                                    .                                \r\n"
					+ ". 2 - Segundo colocado                         .        \r\n"
					+ "  3 - Quantidade de votos em branco                  .       \r\n"
					+ ". 4 - Quantidade de votos nulos                      .       \r\n"
					+ ". 5 - Mostra eleitores                               .\r\n"
					+ ". 6 - Mostra apuração                               .\r\n"
					+ ". 9 - FIM                                            \r\n"
					+ "");
			opcao = EntradaDeDados.inteiro("Digite a opção desejada: ");
			clear();
			
			switch (opcao) {
				case 1:
					VotacaoService.exibirResultados(opcao+1);
					System.out.println("Digite entre para continuar...");
					ler.nextLine();
					break;
				case 2:
					VotacaoService.exibirResultados(opcao+1);
					System.out.println("Digite entre para continuar...");
					ler.nextLine();
					break;
				case 3:
					VotacaoService.exibirResultados(0);
					System.out.println("Digite entre para continuar...");
					ler.nextLine();
					break;
				case 4:
						
					VotacaoService.exibirResultados(1);
					System.out.println("Digite entre para continuar...");
					ler.nextLine();
					break;
					
				case 5: 
					VotacaoService.exibirEleitores();
					System.out.println("Digite entre para continuar...");
					ler.nextLine();
					break;
				case 6:
					VotacaoService.exibirApuracao();
					System.out.println("Digite entre para continuar...");
					ler.nextLine();
					break;
				default:
					System.out.println("OpÃ§Ã£o invalida");
				
			}
			
		}while(opcao != 9);
	}
	
	public static void menuExclusão()  {
		int opcao;
		do {
			System.out.println("......................................................       \r\n"
					+ ".    MENU EXCLUSÃO                 .       \r\n"
					+ "......................................................       \r\n"
					+ ". 1 - Excluir Votações                                    .                                \r\n"
					+ ". 2 - Excluir Candidatos                       .        \r\n"
					+ "  3 - Excluir eleitores                 .       \r\n"
					+ ". 9 - FIM                                            \r\n"
					+ "");
			opcao = EntradaDeDados.inteiro("Digite a opção desejada: ");
			clear();
			
			switch (opcao) {
				case 1:
					try{
						VotacaoService.excluirVotacao();
					}catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					try {
						candidatoService.excluirCandidatos();
					}catch (IOException e) {
						e.printStackTrace();
					}
					
					
					break;
				case 3:
					try {
						EleitorService.excluirVotacao();
					}catch (IOException e) {
						e.printStackTrace();
					}
					
					
					break;
				default:
					System.out.println("Opção invalida");
				
			}
			
		}while(opcao != 9);
		
	}
	
	public static void clear(){
		for(int i = 0; i <=20; i++) {
			System.out.println("\n");
		}
		
	}

}
