package orientacaoobjeto.sistemaTransito;

public class Estatistica {
    Integer codigoCidade;
    String NomeCidade;
    Integer QtdAcidentes;

    public Estatistica(){
    }
    
    public Estatistica(Integer codigoCidade, String NomeCidade, Integer QtdAcidentes) {
        this.codigoCidade = codigoCidade;
        this.NomeCidade = NomeCidade;
        this.QtdAcidentes = QtdAcidentes;
    }

	public Integer getCodigoCidade() {
		return codigoCidade;
	}

	public void setCodigoCidade(Integer codigoCidade) {
		this.codigoCidade = codigoCidade;
	}

	public String getNomeCidade() {
		return NomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		NomeCidade = nomeCidade;
	}

	public Integer getQtdAcidentes() {
		return QtdAcidentes;
	}

	public void setQtdAcidentes(Integer qtdAcidentes) {
		QtdAcidentes = qtdAcidentes;
	}
    
	@Override
	public String toString() {
		return codigoCidade
				+","
				+NomeCidade
				+","
				+QtdAcidentes;
	}
    
    
}