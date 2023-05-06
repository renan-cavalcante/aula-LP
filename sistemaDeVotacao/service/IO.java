package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.Candidato;
import entity.Eleitor;
import entity.Votacao;

public class IO {
	
	public void excluirDados(String nomeArquivo) throws IOException {
		BufferedWriter io;
		File arquivo = new File(System.getProperty("user.dir") + "//sistemaDeVotacao//" + nomeArquivo);
		if(arquivo.exists()) {
			io= new BufferedWriter(new FileWriter(arquivo));
			io.close();
		}
		
		
	}

	public File caminhoDoArquivo(String extensao) {
		File nomeArquivo = new File(System.getProperty("user.dir") + "//sistemaDeVotacao//" + extensao);
		if (!nomeArquivo.exists()) {
			try {
				FileWriter criarArquivo = new FileWriter(nomeArquivo);
				BufferedWriter CA = new BufferedWriter(criarArquivo);
				if (extensao.equals("candidatos.csv")) {

					Candidato candidatos = new Candidato("Branco", 0,0);

					CA.write(candidatos.toStringCSV());
					CA.newLine();
					
					candidatos = new Candidato("Nulo", 99,0);
					CA.write(candidatos.toStringCSV());
					CA.newLine();

				}
				CA.close();
				criarArquivo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return nomeArquivo;
	}

	public void gravarDados(String[] dados, String extensao) {
		File nomeArquivo = caminhoDoArquivo(extensao);

		try (BufferedWriter io = new BufferedWriter(new FileWriter(nomeArquivo, true))) {

			for (String linha : dados) {
				io.write(linha);
				io.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void gravarDados(String dados, String extensao) {
		File nomeArquivo = caminhoDoArquivo(extensao);

		try (BufferedWriter io = new BufferedWriter(new FileWriter(nomeArquivo, true))) {

			io.write(dados);
			io.newLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Votacao> LerDadosVotacao(String arquivo) {
		File nomeArquivo = caminhoDoArquivo(arquivo);
		List<Votacao> votacao = new ArrayList<>();

		try (BufferedReader io = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha = io.readLine();
			while (linha != null) {
				String[] conteudo = linha.split(",");
				Votacao votacaoConteudo = new Votacao(Integer.parseInt(conteudo[0]), Integer.parseInt(conteudo[1]),
						Integer.parseInt(conteudo[2]));
				votacao.add(votacaoConteudo);
				linha = io.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return votacao;
	}

	public List<Candidato> LerDadosCandidatos(String arquivo) {
		File nomeArquivo = caminhoDoArquivo(arquivo);
		List<Candidato> candidato = new ArrayList<>();

		try (BufferedReader io = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha = io.readLine();
			while (linha != null) {
				String[] conteudo = linha.split(",");
				Candidato candidatoConteudo = new Candidato( conteudo[0], Integer.parseInt(conteudo[1]) );
				candidato.add(candidatoConteudo);
				linha = io.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return candidato;
	}
	
	public List<Eleitor> LerDadosEleitores(String arquivo) {
		File nomeArquivo = caminhoDoArquivo(arquivo);
		List<Eleitor> eleitores = new ArrayList<>();

		try (BufferedReader io = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha = io.readLine();
			while (linha != null) {
				String[] conteudo = linha.split(",");
				Eleitor eleitorConteudo = new Eleitor(Integer.parseInt(conteudo[0]), conteudo[1], Integer.parseInt(conteudo[2]) );
				eleitores.add(eleitorConteudo);
				linha = io.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return eleitores;
	}

}
