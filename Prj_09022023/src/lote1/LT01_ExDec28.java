package lote1;
import javax.swing.JOptionPane;
/*
    programa: o que ele faz
    programador: Renan Gama
    Data criação: 19/02/2023
    versão 01
 */

public class LT01_ExDec28 {
    static double preco;
    static int VendaMes;
    public static void main(String arqs[]){
        
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
        VendaMes = Integer.parseInt(JOptionPane.showInputDialog("Digite a media de venda mensal do produto"));
        
        JOptionPane.showMessageDialog(null,"O Novo preço do produto é R$"+ atualizarPreco(preco));
    }
    
    static double atualizarPreco(double preco){
        double NovoPreco;
        if(VendaMes < 500 && preco < 30){
            NovoPreco = preco * 1.10;
        }else if(VendaMes >= 500 && VendaMes < 1000 && preco >= 30 && preco < 80){
            NovoPreco = preco * 1.15;           
        }else if(VendaMes >= 1000 && preco >= 80){
            NovoPreco = preco * 1.05;
        }else{
            NovoPreco = preco;
        }
        return NovoPreco;
    }
            
}
