package entity;

public class LocalEntity implements Entity {

	private String endereco;
	private int numero;
	private String bairro;
	private String complemento;
	private int cep;
	private int codigo;

	public LocalEntity(final int codigo, final String endereco, final int numero, final String bairro,
			final String complemento, final int cep) {
		this.codigo = codigo;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(final String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(final int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(final String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(final String complemento) {
		this.complemento = complemento;
	}

	public int getCep() {
		return this.cep;
	}

	public void setCep(final int cep) {
		this.cep = cep;
	}

	@Override
	public final int getCodigo() {
		return this.codigo;
	}

	@Override
	public final void setCodigo(final int codigo) {
		this.codigo = codigo;
	}

}
