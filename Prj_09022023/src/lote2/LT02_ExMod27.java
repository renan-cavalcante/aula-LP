package lote2;
/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

import java.util.Scanner;

public class LT02_ExMod27 {
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args){
        int numeroVoltas;
        double extensaoCircuito, tempoDuracao;     
        
        numeroVoltas = (int)receberValores("Digite o numero de voltas: %n");
        
        extensaoCircuito = receberValores("Digite a extensão do circuito: %n");
        
        tempoDuracao = receberValores("Digite oa duração do percuso em minutos: %n");
        
        System.out.printf("A velocidade media e %s%n", velocidadeMedia(numeroVoltas,extensaoCircuito, tempoDuracao ));
        
    }
    
    static double receberValores(String texto){
       double valor =  ler.nextInt();
       System.out.printf("%s %n", texto);
        
        return valor;        
    }
    
    static double velocidadeMedia(int voltas, double tamanho, double duracao){
        double khM = ((voltas*tamanho)/1000)/(duracao/60);
        
        return khM;
    }
    
    
}
