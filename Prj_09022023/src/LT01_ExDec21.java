import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec21 {
    public static void main(String arqs[]){
        double Nota1, Nota2, Nota3, Nota4, media;
        
        Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota"));
        Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota"));
        Nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota"));
        Nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota"));
        
        media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
        
        if( media >= 6){
            JOptionPane.showMessageDialog(null,"Aluno APROVADO com "+ media +" de media");
        }else if(media >= 3){
            JOptionPane.showMessageDialog(null,"Aluno em EXAME  com "+ media +" de media");
        }else{
            JOptionPane.showMessageDialog(null,"Aluno REPROVADO com "+ media +" de media");
        }
        
    }
}
