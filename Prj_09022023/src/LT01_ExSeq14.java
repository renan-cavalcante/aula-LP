import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq14 {
    public static void main(String arqs[]){
        double ang1, ang2, ang3;
        
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1° angulo"));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2° angulo"));
        
        ang3 = 180-(ang1+ang2);
        
        JOptionPane.showMessageDialog(null,"O valor do 3° angulo é " +ang3);
    }
}
