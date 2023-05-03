package service;

import java.util.Scanner;

public class EntradaDeDados {
	static Scanner ler = new Scanner(System.in);

	
	public static int inteiro(String texto) {
		System.out.print(texto);
		int valor = ler.nextInt();
		
		return valor;
	}
	
	public static String string(String texto) {
		System.out.print(texto);
		ler.nextLine();
		String valor = ler.nextLine();
		return valor;
	}
	
	public static void quebraDeLinha() {
		ler.nextLine();
	}
}
