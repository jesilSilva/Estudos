package service;

import entity.MenuConsoleEntity;
import repository.TeamCatcherRepository;

public class TeamCatcherService {

	TeamCatcherRepository teamCatcherRepository;

	public TeamCatcherService() {
		this.teamCatcherRepository = new TeamCatcherRepository();
	}

	public MenuConsoleEntity consultarMenu() {

		final MenuConsoleEntity menu = this.teamCatcherRepository.consultarMenu();
		return menu;
	}

}
