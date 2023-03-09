/*
    @author: Renan Gama
    Data criação: 08/03/2023
    versão 01
 */

import javax.swing.JOptionPane;

public class LT02_ExMod28 {
    public static void main(String arqs[]){
        double preco, NovoPreco;
        int VendaMes;
        
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
        VendaMes = Integer.parseInt(JOptionPane.showInputDialog("Digite a media de venda mensal do produto"));
        
        if(VendaMes < 500 && preco < 30){
            NovoPreco = preco * 1.10;
        }else if(VendaMes >= 500 && VendaMes < 1000 && preco >= 30 && preco < 80){
            NovoPreco = preco * 1.15;           
        }else if(VendaMes >= 1000 && preco >= 80){
            NovoPreco = preco * 1.05;
        }else{
            NovoPreco = preco;
        }
        
        JOptionPane.showMessageDialog(null,"O Novo preço do produto é R$"+ NovoPreco);
    }
}
