package lote1;
import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep34 {
    public static void main(String arqs[]){
        int numero, indice;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
         System.out.println("Tabuada do "+numero);
        for( indice = 1; indice <= 10; indice++){
            System.out.println(numero+"X"+indice+"="+numero*indice);
        }
        
    }
}
