import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec25 {
    public static void main(String arqs[]){
        int HoraIni, HoraFim, MinutoIni, MinutoFim, Hora, minuto;
        
        HoraIni = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio do jogo: "));
        MinutoIni = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de inicio do jogo: "));
        HoraFim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora do fim do jogo: "));
        MinutoFim = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto do fim do jogo: "));
        
        HoraIni = (HoraIni * 60) + MinutoIni;
        HoraFim = (HoraFim * 60) + MinutoFim;
        
        if(HoraIni > HoraFim){
            Hora = ((1440-HoraIni) + HoraFim) / 60;
            minuto = ((1440 - HoraIni) + HoraFim) %60;
        }else{
            Hora = ((HoraFim - HoraIni)/ 60);
            minuto = ((HoraFim - HoraIni)% 60);
        }
        
        System.out.print(Hora+":"+minuto);
    }
}
