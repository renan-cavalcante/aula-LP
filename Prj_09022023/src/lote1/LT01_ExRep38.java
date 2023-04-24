package lote1;
import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep38 {
    public static void main(String arqs[]){
        int numero, maior, menor, indice;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        maior = numero;
        menor = numero;
        
        for(indice = 2; indice <= 100; indice++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+numero+"° numero"));
            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        System.out.println("O maior numero é "+maior);
        System.out.println("O menor numero é "+menor);
    }
}
