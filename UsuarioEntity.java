package entity;

public class UsuarioEntity implements Entity {

	private String nome;
	private String email;
	private int codigoUsuario;
	private String senha;
	private int telefone;
	private int idade;

	public UsuarioEntity(final String nome, final String email, final int codigoUsuario, final String senha,
			final int telefone, final int idade) {
		this.nome = nome;
		this.email = email;
		this.codigoUsuario = codigoUsuario;
		this.senha = senha;
		this.telefone = telefone;
		this.idade = idade;
	}

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

	@Override
	public int getCodigo() {
		return this.codigoUsuario;
	}

	@Override
	public void setCodigo(final int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(final String senha) {
		this.senha = senha;
	}

	public int getTelefone() {
		return this.telefone;
	}

	public void setTelefone(final int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(final int idade) {
		this.idade = idade;
	}

}