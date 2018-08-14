package beanAttribute;

public class UsuarioBeanAttribute {

	private String nome = "Nome";
	private String email = "E-mail";
	private String codigoUsuario = "Código";
	private String senha = "Senha";
	private String telefone = "Telefone";
	private String idade = "Idade";

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getCodigo() {
		return this.codigoUsuario;
	}

	public void setCodigo(final String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(final String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(final String telefone) {
		this.telefone = telefone;
	}

	public String getIdade() {
		return this.idade;
	}

	public void setIdade(final String idade) {
		this.idade = idade;
	}

}