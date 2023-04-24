package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq15 {
    public static void main(String arqs[]){
        double cateto1, cateto2, hipotenusa;
        
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto"));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));
        
        hipotenusa = Math.sqrt(Math.pow(cateto2,2)+Math.pow(cateto1, 2));
        
        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é "+ hipotenusa);
    }
}
