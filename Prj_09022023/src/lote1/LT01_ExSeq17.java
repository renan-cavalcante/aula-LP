package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExSeq17 {
    public static void main(String arqs[]){
        double TempoPercurso, VelocidadeMedia, litros;
        
        TempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo que levou para fazer o percurso"));
        VelocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media para fazer o percurso"));
        
        litros = ((TempoPercurso * VelocidadeMedia) / 12);
        
        JOptionPane.showMessageDialog(null,"O automóvel vai gastar " + litros+ "Litros para fazer esse percurso");
        }
}
