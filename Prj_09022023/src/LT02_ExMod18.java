/*
    @author: Renan Gama
    Data criação: 07/03/2023
    versão 01
 */
import java.util. *;

public class LT02_ExMod18 {
    public static void main(String[] args){
        int valor1, valor2;
        valor1 = lerValor(1);
        valor2 = lerValor(2);
        
        System.out.printf("a diferença é %s", calcularDiferenca(valor1, valor2));
    }
    
    static int lerValor(int contagem){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o %sº valor ", contagem);
        
        return  ler.nextInt();
        
    }
    
    static int calcularDiferenca(int valor1, int valor2){
        int diferenca;
        
        if(valor1 > valor2){
            diferenca = valor1 - valor2;
        }else{
            diferenca = valor2 - valor1;
        }
        
        return diferenca;
    }
}
