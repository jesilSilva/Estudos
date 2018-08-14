package entity;

public class EsporteEntity implements Entity {

	private String nome;
	private int qtdParticipantes;
	private int codigoEsporte;
	private String regra;
	private String dataCriacao;

	public EsporteEntity(final String nome, final int qtdParticipantes, final int codigoEsporte, final String regra,
			final String dataCriacao) {
		this.nome = nome;
		this.qtdParticipantes = qtdParticipantes;
		this.codigoEsporte = codigoEsporte;
		this.regra = regra;
		this.dataCriacao = dataCriacao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public int getQtdParticipantes() {
		return this.qtdParticipantes;
	}

	public void setQtdParticipantes(final int qtdParticipantes) {
		this.qtdParticipantes = qtdParticipantes;
	}

	@Override
	public int getCodigo() {
		return this.codigoEsporte;
	}

	@Override
	public void setCodigo(final int codigoEsporte) {
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
