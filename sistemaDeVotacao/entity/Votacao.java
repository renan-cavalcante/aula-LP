package entity;

public class Votacao {
	private Integer secao;
	private Integer codCandidato;
	private Integer numeroEleitor;
	
	public Votacao(Integer secao, Integer codCandidato, Integer numeroEleitor) {
		this.secao = secao;
		this.codCandidato = codCandidato;
		this.numeroEleitor = numeroEleitor;
	}
	
	public Integer getSecao() {
		return secao;
	}

	public Integer getCodCandidato() {
		return codCandidato;
	}

	public Integer getNumeroEleitor() {
		return numeroEleitor;
	}
	
	@Override
	public String toString() { 
		return secao + "             " + codCandidato +"              "+ numeroEleitor;
	}

	
}
