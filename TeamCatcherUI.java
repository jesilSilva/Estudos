package ui;

import entity.MenuConsoleEntity;
import service.TeamCatcherService;

public class TeamCatcherUI {

	TeamCatcherService teamCatcherService;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public TeamCatcherUI() {
		this.teamCatcherService = new TeamCatcherService();
		this.menuConsoleUIStyle = new MenuConsoleUIStyleAdvanced();
	}

	public int consultarMenu() {
		final MenuConsoleEntity menuConsoleEntity = this.teamCatcherService.consultarMenu();
		final MenuConsoleUITemplate menuConsoleUITemplate = new MenuConsoleUITemplate(menuConsoleEntity,
				this.menuConsoleUIStyle);
		menuConsoleUITemplate.desenharMenu();
		return menuConsoleUITemplate.receberOpcaoUsuario();
	}

}
