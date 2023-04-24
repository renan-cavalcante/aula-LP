package lote1;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep39 {
    public static void main(String arqs[]){
        long casa, quantidade;
        
        quantidade = 1;
        
        for(casa = 1; casa < 64; casa++){
            quantidade = quantidade*2;
        }
        
        System.out.println("O numero de grãos é "+quantidade);
    }
}
