package entity;

public class EventoEntity implements Entity {

	private String nome;
	private String data;
	private String local;
	private String horario;
	private Double custo;
	private int codigo;

	public EventoEntity(final int codigo, final String nome, final String data, final String local,
			final String horario, final Double custo) {
		this.codigo = codigo;
		this.nome = nome;
		this.data = data;
		this.local = local;
		this.horario = horario;
		this.custo = custo;
	}

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

	public Double getCusto() {
		return this.custo;
	}

	public void setCusto(final Double custo) {
		this.custo = custo;
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
