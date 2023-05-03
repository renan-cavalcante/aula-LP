package service;

import java.util.Scanner;

import entity.Candidato;

public class candidatoService {
	private static Scanner ler = new Scanner(System.in);
	private static Candidato[] candidatos = new Candidato[3];	
	
	public static void testCadastrarCandidato() {
		candidatos[0] = new Candidato("Branco", 0);
		candidatos[1] = new Candidato("Maria", 1);
		candidatos[2] = new Candidato("João", 2);
		
		System.out.println("Candidatos cadastrados");
		
	}
	
	public static void cadastrarCandidato() {
		candidatos[0] = new Candidato("Branco", 0);
		for(int i = 1; i < 3; i++) {
			String nome;
			int numero;
			System.out.printf("Digite o nome do %s candidato: %n", i);
			nome = ler.nextLine();
			
			System.out.printf("Digite o codigo do/a %s: %n", nome);
			numero = ler.nextInt();
			ler.nextLine();
			
			candidatos[i] = new Candidato(nome, numero);

		}

	}
	
	public static Candidato buscarCandidatoPorCodigo(int codigo) {
		for(Candidato candidato: candidatos) {
			if(candidato.getCodigoCandidato() == codigo) {
				return candidato;
			}
		}
		return null;
	
	}
}