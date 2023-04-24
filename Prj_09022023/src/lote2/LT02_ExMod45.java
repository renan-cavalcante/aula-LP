package lote2;
/*
    @author: Renan Gama
    Data criação: 16/03/2023
    versão 01
    @author Renan
 */
public class LT02_ExMod45 {
    public static void main(String[] args){
        double serie = 1;
        for(int i = 2; i < 16; i++){
            serie = (calcularSerie(i, serie));
        }
        
        System.out.print(serie);
        
    }
    
    public static double calcularSerie(double n1, double serie){

        if (verificarPar(n1)){
            serie -= n1/(n1 * n1);
        }else{
            serie += n1/(n1 * n1);
        }
        
        return serie;  
    }
    
    public static boolean verificarPar(double n1){ 
        return n1 % 2 == 0;
    }
}
