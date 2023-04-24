package lote1;
/*
    programador: Renan Gama
    Data criação: 02/03/2023
    versão 01
 */

public class LT01_ExRep45 {
    public static void main(String [] args){
        double serie = 1;
        double numero2 = 4;
        double numero1 = 2;
        
        while( numero1 <= 15){

            serie += numero1 / numero2;
            numero1++;
            numero2 = numero1 * numero1;
        }  
        System.out.printf("O resultado da serie é %s", serie);
    }
}
