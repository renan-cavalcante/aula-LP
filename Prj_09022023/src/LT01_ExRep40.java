import javax.swing.JOptionPane;
/*
    programador: Renan Gama
    Data criação: 23/02/2023
    versão 01
 */
public class LT01_ExRep40 {
    public static void main(String arqs[]){
        int Numero1, Numero2,aux, indice, indice2, contador;
        
        Numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        Numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero"));
        
        if(Numero1 > Numero2){
            aux = Numero1;
            Numero1 = Numero2;
            Numero2 = aux;
        }
        
        System.out.println("Os numeros primos entres "+Numero1+" e "+Numero2+ "são: ");
        
        for(indice = Numero1; indice < Numero2; indice++){
            contador = 0;
            for(indice2 = Numero1; indice2 > 0; indice2--){
               
                if(Numero1 % indice2 == 0){ 
                    contador++;
                }
            }
            if(contador == 2){
                System.out.println(indice);
            }
            Numero1++;
            
        }
    }
}
