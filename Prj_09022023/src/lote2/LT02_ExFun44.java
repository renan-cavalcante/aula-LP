package lote2;
import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun44 {
    public static void main(String[] args){
        int base, expoente;
        
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente"));
        
        System.out.printf("%s elevado a %s é igual a %s ", base, expoente,calcularPotencia(base, expoente));
    }
    
    static int calcularPotencia(int base, int expoente){
        int potencia = base;
        int contador = 1;
        while(contador < expoente){
            potencia *= base;
            contador++;
        } 
        return potencia;
    }
}
