package repository;

import java.util.ArrayList;
import java.util.List;

import entity.MenuConsoleEntity;

public class TeamCatcherRepository {

	MenuConsoleEntity menuConsoleEntity;

	public TeamCatcherRepository() {

		final List<String> opcoes = new ArrayList<String>();

		opcoes.add("1 - Categoria");
		opcoes.add("2 - Esporte");
		opcoes.add("3 - Evento");
		opcoes.add("4 - Local");
		opcoes.add("5 - Organizador");
		opcoes.add("6 - Usuario");
		opcoes.add("7 - Sair");
		this.menuConsoleEntity = new MenuConsoleEntity("Team Catcher", opcoes);
	}

	public MenuConsoleEntity consultarMenu() {

		return this.menuConsoleEntity;
	}

}
