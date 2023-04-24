package lote2;
/*
    @author: Renan Gama
    Data criação: 08/03/2023
    versão 01
 */

import java.util.Scanner;

public class LT02_ExMod24 {
    public static void main(String[]args){
        int valor;
        try (Scanner ler = new Scanner(System.in)) {
			System.out.printf("Digite um valor");
			valor = ler.nextInt();
		}
        
        verificarDivisao(valor);
    }
    
    static  void verificarDivisao(int valor){
        boolean divisao2 = (valor%2) == 0;
        boolean divisao3 = (valor%3) == 0;
        
        if(divisao2 && divisao3){
            System.out.printf("É divisivel por 2 e 3");
        }else if(divisao2){
            System.out.printf("É divisivel apenas por 2");
        }else if(divisao3){
            System.out.printf("É divisivel apenas por 3");
        }else{
            System.out.printf("Não é divisivel nem por 2 nem por 3");
        }
    }
}
