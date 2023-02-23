import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep32 {
    public static void main(String arqs[]){
        int num, indice;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero iteiro"));
        indice = num - 1;
        while(indice > 0){
            num = num * indice;
            indice--;
        }
        System.out.println(num);
    }
}
