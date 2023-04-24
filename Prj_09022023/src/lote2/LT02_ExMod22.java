package lote2;
/*
    @author: Renan Gama
    Data criação: 08/03/2023
    versão 01
 */
import java.util.Scanner;

public class LT02_ExMod22 {
    public static void main(String[] args){
       int valor1, valor2;
       try (Scanner ler = new Scanner(System.in)) {
		System.out.printf("Digite dois valores inteiros: %n");
		   valor1 = ler.nextInt();
		   valor2 = ler.nextInt();
	}
       
       ordenarNumeros(valor1, valor2);
    }
    
    static void ordenarNumeros(int valor1, int valor2){
        if(valor1 > valor2){
            System.out.printf("%s, %s", valor2, valor1);
        }else{
            System.out.printf("%s, %s", valor1, valor2);
        }
    }
}
