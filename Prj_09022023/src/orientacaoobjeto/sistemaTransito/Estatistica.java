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

	public int getCodigoCidade() {
		return codigoCidade;
	}

	public void setCodigoCidade(int codigoCidade) {
		this.codigoCidade = codigoCidade;
	}

	public String getNomeCidade() {
		return NomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		NomeCidade = nomeCidade;
	}

	public int getQtdAcidentes() {
		return QtdAcidentes;
	}

	public void setQtdAcidentes(int qtdAcidentes) {
		QtdAcidentes = qtdAcidentes;
	}
    
    
    
}