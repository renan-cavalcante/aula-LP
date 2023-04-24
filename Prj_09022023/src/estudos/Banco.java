/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

package estudos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;


 *
 * @author FATEC ZONA LESTE

public class Banco {
    public static void main(String[] args){
        String ab = pegarDataSistema();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data = formato.parse(ab);
        Conta conta1 = conta("pessoa1", ));
    }
    
            
            
    private static String pegarDataSistema(){
        LocalDateTime agora = LocalDateTime.now(); // pega a data e hora atual
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("dd/MM/YYY"); // pega a hora e formata ela (HH:mm:ss)
        String data = formatterHora.format(agora); // atribui a hora a variavel hora
        return data;
    }        
}
 */
