package orientacaoobjeto.sistemaTransito;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ServerEstatistica {
	private static Scanner le;

	public static void cadastrarEstatisticas() throws IOException {
		Estatistica[] estatistica = new Estatistica[10];
		le = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o codigo da cidade:");
			int codigoCidade = le.nextInt();
			le.nextLine();

			System.out.println("Digite o nome da cidade:");
			String nomeCidade = le.nextLine();

			System.out.println("Digite a quantidade de acidentes:");
			int qntdAcidentes = le.nextInt();

			estatistica[i] = new Estatistica(codigoCidade, nomeCidade, qntdAcidentes);

		}
		GravarEstatistica gravar = new GravarEstatistica();

		gravar.GravaEstatistica(estatistica);
	}

	public static void consultarPorQntdAcidentes() throws IOException {
		List<Estatistica> estatisticas = buscarEstatisticas();
		
		for (Estatistica estatistica : estatisticas) {
			if (estatistica.QtdAcidentes > 100 && estatistica.QtdAcidentes < 500) {
				System.out.printf("Codigo: %s\n Nome: %s\n quantidade de acidentes: %s\n\n", estatistica.codigoCidade,
						estatistica.NomeCidade, estatistica.QtdAcidentes);
			}
		}
	}

	public static void consultarMaisMenosAcidentes() throws IOException {
		List<Estatistica> estatisticas = buscarEstatisticas();
		Estatistica maior = estatisticas.get(0);
		Estatistica menor = estatisticas.get(0);

		for (Estatistica estatistica : estatisticas) {
			if (estatistica.QtdAcidentes > maior.QtdAcidentes) {
				maior = estatistica;
			}
			if (estatistica.QtdAcidentes < menor.QtdAcidentes) {
				menor = estatistica;
			}
		}
		System.out.printf("A cidade com maior numeros de acidentes é %s com %s acidentes\n", maior.NomeCidade,
				maior.QtdAcidentes);
		System.out.printf("A cidade com menor numeros de acidentes é %s com %s acidentes\n", menor.NomeCidade,
				menor.QtdAcidentes);
	}

	public static void cidadesAcimaDaMedia() throws IOException {
		List<Estatistica> estatistica = buscarEstatisticas();
		int media = 0;
		for (Estatistica indice : estatistica) {
			media += indice.QtdAcidentes;
		}

		media /= 10;

		for (Estatistica indice : estatistica) {
			if (indice.QtdAcidentes > media) {
				System.out.printf("Codigo: %s\n Nome: %s\n quantidade de acidentes: %s\n\n", indice.codigoCidade,
						indice.NomeCidade, indice.QtdAcidentes);
			}
		}
	}
	
	public static List<Estatistica> buscarEstatisticas() throws IOException{
		GravarEstatistica ler = new GravarEstatistica();
		return ler.LerEstatisticas();
	}
}