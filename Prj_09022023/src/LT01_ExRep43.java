/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep43 {
    public static void main(String arqs[]){
        double alturaAna = 1.10;
        double alturaMaria = 1.5;
        int anos = 0;
        
       while(alturaAna <= alturaMaria){
           alturaAna += 0.03;
           alturaMaria += 0.02;
           anos++;
       }
        
       System.out.printf("Ira demorar %sanos para que Ana seja maior que Maria", anos);
        
    }
}
