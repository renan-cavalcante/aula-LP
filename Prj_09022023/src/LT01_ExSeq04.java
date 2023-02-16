import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 09/02/2023
    versão 01
 */
public class LT01_ExSeq04 {
    public static void main(String arqs[]){
        double Celsius, Fahr;
        
        Celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        Fahr = (((9*Celsius)+160)/5);
        
        JOptionPane.showMessageDialog(null,"A temperatura em Fahre é: "+ Fahr);
    }
}
