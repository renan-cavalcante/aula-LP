import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec27 {
    public static void main(String arqs[]){
        int voltas, minutos;
        double extensao, KmH;
        
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de voltas do circuito"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de duraçã em minutos"));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros"));
        
        KmH = ((extensao * voltas ) / 1000) / (minutos/60) ;
        
        System.out.println("A velocidade média foi de "+ KmH +"Km/H");
    }
}
