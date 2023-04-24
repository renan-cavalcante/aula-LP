package lote2;
/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun42 {
    public static void main(String arqs[]){
        
        
        
        System.out.println("O resultado da série é "+ calcularSerie());
    }
    
    static double calcularSerie(){
        double indice, serie, contador;
        serie = 1;
        contador =1;
        
        for (indice = 2; indice <= 50; indice++){
            contador+=2;
            serie = serie +( indice/contador);
        }
        return serie;
        
    }
}
