/*
    @author: Renan Gama
    Data criação: 08/03/2023
    versão 01
 */

import java.util.Scanner;

public class LT02_ExMod27 {
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args){
        int numeroVoltas;
        double extensaoCircuito, tempoDuracao;     
        
        System.out.printf("Digite o numero de voltas: %n");
        numeroVoltas = (int)receberValores();
        
        System.out.printf("Digite a exxtensão do circuito: %n");
        extensaoCircuito = receberValores();
        
        System.out.printf("Digite oa duração do percuso em minutos: %n");
        tempoDuracao = receberValores();
        
        System.out.printf("A velocidade media e %s%n", velocidadeMedia(numeroVoltas,extensaoCircuito, tempoDuracao ));
        
    }
    
    static double receberValores(){
       double valor =  ler.nextInt();
        
        return valor;        
    }
    
    static double velocidadeMedia(int voltas, double tamanho, double duracao){
        double khM = ((voltas*tamanho)/1000)/(duracao/60);
        
        return khM;
    }
    
    
}
