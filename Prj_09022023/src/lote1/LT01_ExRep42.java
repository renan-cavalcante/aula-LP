package lote1;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep42 {
    public static void main(String arqs[]){
        double indice, serie, contador;
        
        serie = 1;
        contador =1;
        
        for (indice = 2; indice <= 50; indice++){
            contador+=2;
            serie = serie +( indice/contador);
        }
        
        System.out.println("O resultado da série é "+serie);
    }
}


