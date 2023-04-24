package lote1;
import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep37 {
    public static void main(String arqs[]){
        int numero, indice, F1,F2, fibo;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        F1 = 0;
        F2 = 1;
        indice = 1;
        
        System.out.print(F2+", ");
        
        while(indice < numero){
            fibo = F1 + F2;
            F1 = F2;
            F2 = fibo;
            indice++;
            System.out.print(fibo+", ");
        }
    }
}
