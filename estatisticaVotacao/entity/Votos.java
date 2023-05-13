package entity;

public class Votos {
	private  Integer secao;
	private Integer voto;
	
	public Votos(Integer secao, Integer voto) {
		super();
		this.secao = secao;
		this.voto = voto;
	}

	public Integer getSecao() {
		return secao;
	}

	public void setSecao(Integer secao) {
		this.secao = secao;
	}

	public Integer getVoto() {
		return voto;
	}

	public void setVoto(Integer voto) {
		this.voto = voto;
	}
	
	@Override
	public String toString() {
		return secao+","+voto;
	}	

}
