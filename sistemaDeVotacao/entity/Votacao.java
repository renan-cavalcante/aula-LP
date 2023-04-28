package entity;

public class Votacao {
	private Integer[] secao = new Integer[10];
	private Integer[] codCandidato = new Integer[10];
	private Integer[] numeroEleitor = new Integer[10];
	private static int cont = 0;
	
	public Votacao(Integer secao, Integer codCandidato, Integer numeroEleitor) {
		this.secao[cont] = secao;
		this.codCandidato[cont] = codCandidato;
		this.numeroEleitor[cont] = numeroEleitor;
		contador();
	}
	
	public Integer[] getSecao() {
		return secao;
	}

	public Integer[] getCodCandidato() {
		return codCandidato;
	}

	public Integer[] getNumeroEleitor() {
		return numeroEleitor;
	}
	
	private static void contador() {
		cont++;
	}

	
}
