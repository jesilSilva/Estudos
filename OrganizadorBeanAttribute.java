package beanAttribute;

public class OrganizadorBeanAttribute {

	private String nome = "Nome";
	private String codigoOrganizador = "Código";
	private String eventoCriado = "Evento";
	private String descricao = "Descrição";
	private String nivelOrganizador = "Nível";

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return this.codigoOrganizador;
	}

	public void setCodigo(final String codigoOrganizador) {
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

	public String getNivelOrganizador() {
		return this.nivelOrganizador;
	}

	public void setNivelOrganizador(final String nivelOrganizador) {
		this.nivelOrganizador = nivelOrganizador;
	}
}
