import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExDec30 {
    public static void main(String arqs[]){
        int DiaNasc, MesNasc, AnoNasc, AnoAtual, MesAtual, DiaAtual;
        
        DiaNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia que nasceu:"));
        MesNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mes que nasceu:"));
        AnoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano que nasceu:"));
        DiaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia que atual:"));
        MesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Mes que atual:"));
        AnoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano que atual:"));
        
    }
}
