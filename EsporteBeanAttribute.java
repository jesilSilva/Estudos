package beanAttribute;

public class EsporteBeanAttribute {

	private String nome = "Nome";
	private String qtdParticipantes = "Qtnd Participantes";
	private String codigoEsporte = "Código";
	private String regra = "Regra";
	private String dataCriacao = "Data de criação";

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getQtdParticipantes() {
		return this.qtdParticipantes;
	}

	public void setQtdParticipantes(final String qtdParticipantes) {
		this.qtdParticipantes = qtdParticipantes;
	}

	public String getCodigo() {
		return this.codigoEsporte;
	}

	public void setCodigo(final String codigoEsporte) {
		this.codigoEsporte = codigoEsporte;
	}

	public String getRegra() {
		return this.regra;
	}

	public void setRegra(final String regra) {
		this.regra = regra;
	}

	public String getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(final String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
