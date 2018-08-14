package beanAttribute;

import java.util.List;

public class MenuConsoleEntity {

	private String title;
	private List<String> opcao;

	public MenuConsoleEntity(final String title, final List<String> opcao) {
		this.title = title;
		this.opcao = opcao;
	}

	public final String getTitle() {
		return this.title;
	}

	public final void setTitle(final String title) {
		this.title = title;
	}

	public final List<String> getOpcao() {
		return this.opcao;
	}

	public final void setOpcao(final List<String> opcao) {
		this.opcao = opcao;
	}
}