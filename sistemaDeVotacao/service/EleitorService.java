package service;

import java.util.Scanner;

import entity.Eleitor;

public class EleitorService {
	private static Eleitor[] eleitores = new Eleitor[20];
	private static int i = 0;
	private static Scanner ler = new Scanner(System.in);
	
	public static void testeCadastrarEleitor() {
		
		eleitores[0] = new Eleitor(123, "eleitor1", 1);
		eleitores[1] = new Eleitor(124, "eleitor2", 2);
		eleitores[2] = new Eleitor(125, "eleitor3", 5);
		eleitores[3] = new Eleitor(126, "eleitor4", 20);
		eleitores[4] = new Eleitor(127, "eleitor5", 30);
		eleitores[5] = new Eleitor(128, "eleitor6", 50);
		eleitores[6] = new Eleitor(129, "eleitor7", 1);
		eleitores[7] = new Eleitor(130, "eleitor8", 2);
		eleitores[8] = new Eleitor(131, "eleitor9", 5);
		eleitores[9] = new Eleitor(100, "eleitor00", 6);
		eleitores[10] = new Eleitor(133, "eleitor10", 20);
		eleitores[11] = new Eleitor(134, "eleitor11", 30);
		eleitores[12] = new Eleitor(135, "eleitor12", 50);
		eleitores[13] = new Eleitor(136, "eleitor13", 1);
		
		System.out.println("Eleitores cadastrado");


}

	public static void cadastrarEleitor() {
		Integer numeroEleitor;
		String nomeEleitor;
		Integer secao;
		boolean continuar;
		do {

			numeroEleitor = EntradaDeDados.inteiro("Digite o numero do eleitor: ");
			if(buscarEleitorPorNumeroEleitor(numeroEleitor) == null) {
				nomeEleitor = EntradaDeDados.string("Digite o nome do eleitor: ");
				secao = EntradaDeDados.inteiro("Digite a se�a� do eleitor: ");
				eleitores[i] = new Eleitor(numeroEleitor, nomeEleitor, secao);
				i++;
				System.out.println("Cadastrar mais um eleitor? (S/N): ");
				String leitura = ler.next();
				continuar = leitura.equals("s") ? true : false;
			}else {
				System.out.println("Numero de eleitor ja cadastrado");
				continuar = true;
			}
			
		
			
		} while (i < 9 && continuar);

	}
	

	public static Integer secaoDoEleitor(int numeroEleitor) {
		for (Eleitor eleitor : eleitores) {
			if (eleitor.getNumeroEleitor().equals(numeroEleitor)) {
				return eleitor.getSecao();
			}
		}
		return -1;
	}

	public static Eleitor buscarEleitorPorNumeroEleitor(int numero) {
		for (Eleitor eleitor : eleitores) {
			if (eleitor.getNumeroEleitor() == numero) {
				return eleitor;
			}
		}
		return null;
	}
}
