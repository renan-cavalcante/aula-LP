/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep41 {
    public static void main(String arqs[]){
        int dado1, dado2;
        System.out.println(" Dados que somados dão 7");
        
        for (dado1 = 1; dado1 < 7; dado1++){
            for(dado2 = 1; dado2 < 7; dado2++){
                
                if(dado1 + dado2 == 7){
                    System.out.println("Dado 1 = "+dado1+" dado 2 = "+dado2);
                }
            }
        }
    }
}
