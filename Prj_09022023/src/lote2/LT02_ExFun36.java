package lote2;
import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun36 {
    public static void main(String arqs[]){
        int numero ;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        
        System.out.println("O resultado da série é "+calcularSerie((double)numero));
    }
    
    static double calcularSerie(double n){
        double indice, serie,fatorial;
        serie = 1;
        indice = 1;
        fatorial = 1;
        
        while(indice <= n){
            fatorial = fatorial*indice;
            serie = serie + (1/fatorial);
            indice++;
        }
        return serie;  
    }
}

