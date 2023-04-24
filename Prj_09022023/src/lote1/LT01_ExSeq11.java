package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq11 {
    public static void main(String arqs[]){
        double raio, circuferencia;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
        
        circuferencia = raio*2*3.14;
        
        System.out.println("A circuferencia é "+ circuferencia);
    }
}
