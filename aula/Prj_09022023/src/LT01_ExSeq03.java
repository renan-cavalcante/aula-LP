import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 09/02/2023
    versão 01
 */
public class LT01_ExSeq03 {
    public static void main(String arqs[]){
        double Base, Altura, Area;
        
        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triangulo: "));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triangulo: "));
        
        Area = ((Base * Altura)/2);
        
        JOptionPane.showMessageDialog(null,"A area do triangulo é: " + Area);
    }
}
