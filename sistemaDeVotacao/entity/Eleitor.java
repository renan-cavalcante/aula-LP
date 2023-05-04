package entity;

public class Eleitor {
	private Integer numeroEleitor;
	private String nomeEleitor;
	private Integer secao;
	
	public Eleitor() {
	}

	public Eleitor(Integer numeroEleitor, String nomeEleitor, Integer secao) {
		this.numeroEleitor = numeroEleitor;
		this.nomeEleitor = nomeEleitor;
		this.secao = secao;
	}

	public Integer getNumeroEleitor() {
		return numeroEleitor;
	}

	public String getNomeEleitor() {
		return nomeEleitor;
	}

	public void setNomeEleitor(String nomeEleitor) {
		this.nomeEleitor = nomeEleitor;
	}

	public Integer getSecao() {
		return secao;
	}

	public void setSecao(Integer secao) {
		this.secao = secao;
	}
	
	@Override
	public String toString() {
		return "Nome: "
				+nomeEleitor
				+"\nNumero Eleitor: "
				+numeroEleitor
				+"\nSecao: "
				+secao;
	}
	
}
