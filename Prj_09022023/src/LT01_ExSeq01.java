import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 09/02/2023
    versão 01
 */
public class LT01_ExSeq01 {
    public static void main(String arqs[]){
        int Lado, Area;
        Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do Quadrado:"));
        Area = Lado * Lado;
        
        JOptionPane.showMessageDialog(null,"A area do quadrado é: "+ Area);
        
    }
}
