package controller;

import ui.CategoriaUI;
import ui.EsporteUI;
import ui.EventoUI;
import ui.LocalUI;
import ui.MenuConsoleUIStyle;
import ui.MenuConsoleUIStyleAdvanced;
import ui.OrganizadorUI;
import ui.TeamCatcherUI;
import ui.UsuarioUI;

public class TeamCatcherController {
	public static void main(final String[] args) {
		executaMenuTeamCatcher();
	}

	public static MenuConsoleUIStyle getStyle() {
		return new MenuConsoleUIStyleAdvanced();
	}

	private static void executaMenuTeamCatcher() {
		final TeamCatcherUI teamCatcherUI = new TeamCatcherUI();
		final CategoriaUI categoriaUI = new CategoriaUI(getStyle());
		final EsporteUI esporteUI = new EsporteUI(getStyle());
		final EventoUI eventoUI = new EventoUI(getStyle());
		final LocalUI localUI = new LocalUI(getStyle());
		final OrganizadorUI organizadorUI = new OrganizadorUI(getStyle());
		final UsuarioUI usuarioUI = new UsuarioUI(getStyle());

		int opcao;

		do {
			opcao = teamCatcherUI.consultarMenu();
			switch (opcao) {
			case 1:
				executaMenuCategoria(categoriaUI);
				break;
			case 2:
				executaMenuEsporte(esporteUI);
				break;
			case 3:
				executaMenuEvento(esporteUI, eventoUI);
				break;
			case 4:
				executaMenuLocal(localUI);
				break;
			case 5:
				executaMenuOrganizador(organizadorUI);
				break;
			case 6:
				executaMenuUsuario(usuarioUI);
				break;
			case 7:
				break;
			default:
				mensagemOpcaoInvalida();
			}
		} while (opcao != 7);
		System.out.println("Volte sempre, Team Catcher agradece a sua visita!");
	}

	private static void executaMenuUsuario(final UsuarioUI usuarioUI) {
		int opcao = 0;
		do {
			opcao = usuarioUI.consultarMenu();
			switch (opcao) {
			case 1:
				usuarioUI.cadastrar();
				break;
			case 2:
				usuarioUI.consultarTodos();
				break;
			case 3:
				usuarioUI.consultarPorCodigo();
				break;
			case 4:
				usuarioUI.alterar();
				break;
			case 5:
				usuarioUI.excluir();
				break;
			case 6:
				break;
			default:
				mensagemOpcaoInvalida();
			}
		} while (opcao != 6);
	}

	private static void executaMenuOrganizador(final OrganizadorUI organizadorUI) {
		int opcao = 0;
		do {
			opcao = organizadorUI.consultarMenu();
			switch (opcao) {
			case 1:
				organizadorUI.cadastrar();
				break;
			case 2:
				organizadorUI.consultarTodos();
				break;
			case 3:
				organizadorUI.consultarPorCodigo();
				break;
			case 4:
				organizadorUI.alterar();
				break;
			case 5:
				organizadorUI.excluir();
				break;
			case 6:
				break;
			default:
				mensagemOpcaoInvalida();
			}
		} while (opcao != 6);
	}

	private static void executaMenuLocal(final LocalUI localUI) {
		int opcao = 0;
		do {
			opcao = localUI.consultaMenu();

			switch (opcao) {
			case 1:
				localUI.cadastrar();
				break;
			case 2:
				localUI.consultarTodos();
				break;
			case 3:
				localUI.consultarPorCodigo();
				break;
			case 4:
				localUI.consultarPorCep();
				break;
			case 5:
				localUI.alterar();
				break;
			case 6:
				localUI.excluir();
				break;
			case 7:
				break;
			default:
				mensagemOpcaoInvalida();
			}
		} while (opcao != 7);
	}

	private static void executaMenuEvento(final EsporteUI esporteUI, final EventoUI eventoUI) {
		int opcao = 0;
		do {
			opcao = eventoUI.consultarMenu();

			switch (opcao) {
			case 1:
				eventoUI.cadastrar();
				break;
			case 2:
				eventoUI.consultarTodos();
				break;
			case 3:
				eventoUI.consultarPorCodigo();
				break;
			case 4:
				eventoUI.consultarPorNome();
				break;
			case 5:
				esporteUI.alterar();
				break;
			case 6:
				esporteUI.excluir();
				break;
			case 7:
				break;
			default:
				mensagemOpcaoInvalida();
			}
		} while (opcao != 7);
	}

	private static void executaMenuEsporte(final EsporteUI esporteUI) {
		int opcao = 0;
		do {
			opcao = esporteUI.consultarMenu();
			switch (opcao) {
			case 1:
				esporteUI.cadastrar();
				break;
			case 2:
				esporteUI.consultarTodos();
				break;
			case 3:
				esporteUI.consultarPorCodigo();
				break;
			case 4:
				esporteUI.alterar();
				break;
			case 5:
				esporteUI.excluir();
				break;
			case 6:
				break;
			default:
				mensagemOpcaoInvalida();
			}
		} while (opcao != 6);
	}

	private static void executaMenuCategoria(final CategoriaUI categoriaUI) {
		int opcao = 0;
		do {
			opcao = categoriaUI.consultarMenu();
			switch (opcao) {
			case 1:
				categoriaUI.cadastrar();
				break;
			case 2:
				categoriaUI.consultarTodos();
				break;
			case 3:
				categoriaUI.consultarPorCodigo();
				break;
			case 4:
				categoriaUI.alterar();
				break;
			case 5:
				categoriaUI.excluir();
				break;
			case 6:
				break;
			default:
				mensagemOpcaoInvalida();
			}
		} while (opcao != 6);
	}

	private static void mensagemOpcaoInvalida() {
		System.out.println("Esta não uma opção válida!");
	}
}