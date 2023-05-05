package orientacaoobjeto.sistemaTransito;

import java.io.IOException;
import java.util.Scanner;

public class StartTransito {
	private static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int opcao = 1;
 

		boolean continuar = true;

		do {

			System.out.println("	MENU ESTATÍSTICA	               	|\n"
					+ "| Estatíticas de acidentes em 2020		|\n" + "| 1 - Cadastro EstatÃ­stica			|\n"
					+ "| 2 - Consulta por quantidade de acidentes	|\n"
					+ "| 3 - Consulta por estatísticas de acidentes	|\n"
					+ "| 4 - Acidentes acima da média das 10 cidades   |\n" + "| 9 - Finaliza ");
			System.out.println("Digite a opção desejada:");
			
			

			opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				ServerEstatistica.cadastrarEstatisticas();
				opcao = 9;
				break;
			case 2:
				ServerEstatistica.consultarPorQntdAcidentes();
				break;
			case 3:
				ServerEstatistica.consultarMaisMenosAcidentes();
				break;
			case 4:
				ServerEstatistica.cidadesAcimaDaMedia();
				break;
			case 9:
				System.out.println("Sistema finalizado");
				continuar = false;
				break;
			default:
				System.out.println("Opção invalida");

			}
			

		} while (continuar);

		
	}


	
}
