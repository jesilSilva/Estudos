package beanAttribute;

public class CategoriaBeanAttribute {

	private String codigo = "Código";
	private String nome = "Nome";
	private String caracteristicas = "Caracteristicas";
	private String esporte = "Esporte";
	private String restricao = "Restrição";

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final String codigoCategoria) {
		this.codigo = codigoCategoria;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(final String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getEsporte() {
		return this.esporte;
	}

	public void setEsporte(final String esporte) {
		this.esporte = esporte;
	}

	public String getRestricao() {
		return this.restricao;
	}

	public void setRestricao(final String restricao) {
		this.restricao = restricao;
	}
}