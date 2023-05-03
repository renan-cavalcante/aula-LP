package entity;

public class Candidato {

	private String nome;
	private Integer codigoCandidato;
	private Integer QuantidadeDeVotos;
	
	public Candidato(String nome, Integer codigoCandidato) {
		this.nome = nome;
		this.codigoCandidato = codigoCandidato;
	}

	public Candidato(Candidato candidato, Integer votos) {
		this.QuantidadeDeVotos = votos;
		this.codigoCandidato = candidato.getCodigoCandidato();
		this.nome = candidato.getNome();
	}

	public Candidato(String nome, Integer codigoCandidato, Integer quantidadeDeVotos) {
		super();
		this.nome = nome;
		this.codigoCandidato = codigoCandidato;
		QuantidadeDeVotos = quantidadeDeVotos;
	}

	public Candidato() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoCandidato() {
		return codigoCandidato;
	}

	public void setCodigoCandidato(Integer codigoCandidato) {
		this.codigoCandidato = codigoCandidato;
	}

	public Integer getQuantidadeDeVotos() {
		return QuantidadeDeVotos;
	}

	public void setQuantidadeDeVotos(Integer quantidadeDeVotos) {
		QuantidadeDeVotos = quantidadeDeVotos;
	}
	
	@Override
	public String toString() {
		return "Codigo: "
				+codigoCandidato
				+"\nNome: "
				+nome
				+"\nVotos:  "
				+QuantidadeDeVotos;
				
	}
	
	
	
	
}
