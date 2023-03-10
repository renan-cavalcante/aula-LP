import javax.swing.JOptionPane;

/*
    @author: Renan Gama
    Data criação: 09/03/2023
    versão 01
 */

public class LT02_ExFun38 {
     public static void main(String arqs[]){
        int numero, maior, menor, indice;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        maior = numero;
        menor = numero;
        
        for(indice = 2; indice <= 100; indice++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+indice+"° numero"));
            maior = calcularMaior(numero, maior);
            menor = calcularMenor(numero, menor);
            
        }
        System.out.println("O maior numero é "+maior);
        System.out.println("O menor numero é "+menor);
    }
     
    static int calcularMaior(int n, int referencia){
        referencia = n > referencia ? n : referencia;
        return referencia;
        
    } 
    
    static int calcularMenor(int n, int referencia){
        referencia = n < referencia ? n : referencia;
        return referencia;
        
    } 
}
