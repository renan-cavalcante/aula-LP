/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun41 {
    public static void main(String arqs[]){
        int dado1;
        System.out.println(" Dados que somados dão 7");
        
        for (dado1 = 1; dado1 < 7; dado1++){
            System.out.printf("%s %n",somarDados(dado1));
        }
    }
    
    static String somarDados(int dado1){
        
        for(int dado2 = 1; dado2 < 7; dado2++){
                
            if(dado1 + dado2 == 7){
                return ("Dado 1 = "+dado1+" dado 2 = "+dado2);
            }
        }
        return "0";
    }
    
    
}
