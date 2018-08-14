package entity;

public class CategoriaEntity implements Entity {

	private int codigo;
	private String nome;
	private String caracteristicas;
	private String esporte;
	private String restricao;

	public CategoriaEntity(final int codigo, final String nome, final String caracteristicas, final String esporte,
			final String restricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.caracteristicas = caracteristicas;
		this.esporte = esporte;
		this.restricao = restricao;
	}

	@Override
	public int getCodigo() {
		return this.codigo;
	}

	@Override
	public void setCodigo(final int codigoCategoria) {
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