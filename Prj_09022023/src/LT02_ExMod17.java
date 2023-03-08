/*
    programa: Calcule a quantidade de litros gastos em uma viagem, sabendo que o
        automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
    programador: Renan Gama
    Data criação: 02/03/2023
    versão 01
 */

import java.util.Scanner;

public class LT02_ExMod17 {
    static double  tempoPercuso, velocidadeMedia;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[]args){
         
        receberValores();
        System.out.printf("A quantidade de litros gasto foi %.2f", calcularLitros() );
        
    }
    
    static void receberValores(){
        System.out.println("Digite quanto tempo levou em minutos:");
        tempoPercuso = ler.nextDouble();
        
        System.out.println("Digite a velocidade media:");
        velocidadeMedia = ler.nextDouble();        
        
    }
    
    static double calcularLitros(){
        double litrosGastos;
        
        litrosGastos =   ((tempoPercuso/60) * velocidadeMedia) / 12;
        
        return litrosGastos;
    } 
}
