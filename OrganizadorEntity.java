package entity;

public class OrganizadorEntity implements Entity {

	private String nome;
	private int codigoOrganizador;
	private String eventoCriado;
	private String descricao;
	private int nivelOrganizador;

	public OrganizadorEntity(final String nome, final int codigoOrganizador, final String eventoCriado,
			final String descricao, final int nivelOrganizador) {
		this.nome = nome;
		this.codigoOrganizador = codigoOrganizador;
		this.eventoCriado = eventoCriado;
		this.descricao = descricao;
		this.nivelOrganizador = nivelOrganizador;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	@Override
	public int getCodigo() {
		return this.codigoOrganizador;
	}

	@Override
	public void setCodigo(final int codigoOrganizador) {
		this.codigoOrganizador = codigoOrganizador;
	}

	public String getEventoCriado() {
		return this.eventoCriado;
	}

	public void setEventoCriado(final String eventoCriado) {
		this.eventoCriado = eventoCriado;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	public int getNivelOrganizador() {
		return this.nivelOrganizador;
	}

	public void setNivelOrganizador(final int nivelOrganizador) {
		this.nivelOrganizador = nivelOrganizador;
	}
}
