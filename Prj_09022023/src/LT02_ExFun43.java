/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun43 {
    public static void main(String arqs[]){
        
        
       System.out.printf("Ira demorar %sanos para que Ana seja maior que Maria", calcularAnos());
        
    }
    
    static int calcularAnos(){
        double alturaAna = 1.10;
        double alturaMaria = 1.5;
        int anos = 0;
        
        while(alturaAna <= alturaMaria){
           alturaAna += 0.03;
           alturaMaria += 0.02;
           anos++;
        }
        return anos;
    }
}
