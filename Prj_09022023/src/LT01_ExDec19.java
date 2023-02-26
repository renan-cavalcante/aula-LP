import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */
public class LT01_ExDec19 {
    public static void main(String arqs[]){
        double Valor1, Valor2;
        
        Valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        Valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        if (Valor1 > Valor2){
            System.out.println(Valor1+" é o maior valor");
        }else if(Valor2 > Valor1){
            System.out.println(Valor2 +" é o maior valor");
        }else{
            System.out.println(" Os valores são iguais");
        }
        
    }
}