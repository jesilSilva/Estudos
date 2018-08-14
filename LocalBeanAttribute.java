package beanAttribute;

public class LocalBeanAttribute {

	private String endereco = "Endereço";
	private String numero = "Número";
	private String bairro = "Bairro";
	private String complemento = "Complemento";
	private String cep = "CEP";
	private String codigo = "Código";

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(final String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(final String numero) {
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

	public String getCep() {
		return this.cep;
	}

	public void setCep(final String cep) {
		this.cep = cep;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

}
