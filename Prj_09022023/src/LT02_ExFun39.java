/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

import java.util.Scanner;

public class LT02_ExFun39 {
    public static void main(String arqs[]){
        int casaCalcular;
        Scanner ler = new Scanner(System.in);
                
        System.out.println("qual o numero da casa que quer calcular:");
        casaCalcular = ler.nextInt();
        
        System.out.printf("O numero de grãos é na casa %s é %s ", casaCalcular,calcularGraos(casaCalcular));
    }
    
    static long calcularGraos(int n){
        long casa, quantidade;
        
        quantidade = 1;
        
        for(casa = 1; casa < n; casa++){
            quantidade = quantidade*2;
                    
        }
        return quantidade;
    }
}
