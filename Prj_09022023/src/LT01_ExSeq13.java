import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq13 {
    public static void main(String arqs[]){
        double QuantAlimentos,dias;
        
        QuantAlimentos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimentos em kilos: "));
        
        dias = QuantAlimentos/0.050;
        
        System.out.println(+QuantAlimentos+"Kilos de alimentos, durara "+ dias +"Dias");
    }
}
