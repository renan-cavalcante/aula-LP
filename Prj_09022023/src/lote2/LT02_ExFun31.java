package lote2;
/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun31 {
      public static void main(String arqs[]){
          int indice;
        
        for (indice = 10; indice <= 150; indice++){
             System.out.println("O quadrado de  é "+mostrarQuadrados(indice));
        }
        
    }
      
    static int mostrarQuadrados(int indice){
        return  indice * indice;
          
    }
}
