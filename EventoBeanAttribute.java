package beanAttribute;

public class EventoBeanAttribute {

	private String nome = "Nome";
	private String data = "Data";
	private String local = "Local";
	private String horario = "Horário";
	private String custo = "Custo";
	private String codigo = "Código";

	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public String getData() {
		return this.data;
	}

	public void setData(final String data) {
		this.data = data;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(final String local) {
		this.local = local;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(final String horario) {
		this.horario = horario;
	}

	public String getCusto() {
		return this.custo;
	}

	public void setCusto(final String custo) {
		this.custo = custo;
	}

	public final String getCodigo() {
		return this.codigo;
	}

	public final void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

}
