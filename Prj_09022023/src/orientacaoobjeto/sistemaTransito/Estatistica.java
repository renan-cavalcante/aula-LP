package orientacaoobjeto.sistemaTransito;

public class Estatistica {
    int codigoCidade;
    String NomeCidade;
    int QtdAcidentes;

    public Estatistica(){
    }
    
    public Estatistica(int codigoCidade, String NomeCidade, int QtdAcidentes) {
        this.codigoCidade = codigoCidade;
        this.NomeCidade = NomeCidade;
        this.QtdAcidentes = QtdAcidentes;
    }
    
    
    
}