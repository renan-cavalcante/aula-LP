package estudos;

/**
 *
 * @author Renan
 */
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Conta {
    private  String titular;
    private Date data;
    private double saldo;
    
    public Conta(String titular, Date data){
        this.titular = titular;
        this.data = data;
        
    }
    public String getTitular (){
        return this.titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public Date getData(){
        return this.data;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    private void Depositar(double valor){
        this.saldo += valor;
    }
    
    private void Pagar(Double valor){
        this.saldo -= valor;
    }
 
}
