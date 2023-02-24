import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep35 {
    public static void main(String arqs[]){
        int Numero1, Numero2,aux, indice, SomaImpar;
        
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        
        if(Numero2 < Numero1){
            
            aux = Numero1;
            Numero1 = Numero2;
            Numero2 = aux;
        }
        
        SomaImpar = 0;
        indice = Numero1 + 1;
        while(indice < Numero2){
            if (indice % 2 == 1){
                SomaImpar = SomaImpar + indice;
            }
            indice++;
        }
        
        System.out.println("A soma dos impares entre "+Numero1+" e "+Numero2+" é "+SomaImpar);
    } 
}
