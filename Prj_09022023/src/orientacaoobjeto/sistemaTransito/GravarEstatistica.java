package orientacaoobjeto.sistemaTransito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravarEstatistica {

	public File caminhoDoArquivo() throws IOException {
		File nomeArquivo = new File(System.getProperty("user.dir") + "\\Estatisticas.csv");
		if (!nomeArquivo.exists()) {
			FileWriter criarArquivo = new FileWriter(nomeArquivo);
			criarArquivo.close();
		}
		return nomeArquivo;
	}

	public void GravaEstatistica(Estatistica[] estatisticas) throws IOException {

		File nomeArquivo = caminhoDoArquivo();

		try (BufferedWriter gravar = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
			for (Estatistica linha : estatisticas) {
				if (linha != null) {
					gravar.write(linha.toString());
					gravar.newLine();

				}

			}
			System.out.println(nomeArquivo.getPath());
			System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public List<Estatistica> LerEstatisticas() throws IOException {
	
		
		File nomeArquivo = caminhoDoArquivo();

		List<Estatistica> estatisticas = new ArrayList<>();
		try (BufferedReader ler = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha = ler.readLine();
			while (linha != null) {
				String[] conteudo = linha.split(",");
				Estatistica Novaestatistica = new Estatistica(Integer.parseInt(conteudo[0]), conteudo[1],
						Integer.parseInt(conteudo[2]));
				estatisticas.add(Novaestatistica);
				
				linha = ler.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		return estatisticas;

	}

}
