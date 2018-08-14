package repository;

import java.util.ArrayList;
import java.util.List;

import entity.EventoEntity;
import entity.MenuConsoleEntity;

public class EventoRepository implements Repository<EventoEntity> {

	List<EventoEntity> eventoBD;
	MenuConsoleEntity menuConsoleEntity;

	public EventoRepository() {
		this.eventoBD = new ArrayList<EventoEntity>();

		final List<String> opcoes = new ArrayList<String>();
		opcoes.add("1 - Cadastrar evento");
		opcoes.add("2 - Consultar evento");
		opcoes.add("3 - Consultar evento por código");
		opcoes.add("4 - Consultar evento por nome");
		opcoes.add("5 - Alterar evento");
		opcoes.add("6 - Excluir evento");
		opcoes.add("7 - Voltar");

		this.menuConsoleEntity = new MenuConsoleEntity("Evento", opcoes);

	}

	@Override
	public void incluir(final EventoEntity eventoEntity) {
		this.eventoBD.add(eventoEntity);

	}

	@Override
	public List<EventoEntity> consultarTodos() {
		return this.eventoBD;
	}

	@Override
	public EventoEntity consultarPorCodigo(final int codigo) {

		for (final EventoEntity eventoEntity : this.eventoBD) {
			if (codigo == eventoEntity.getCodigo()) {
				return eventoEntity;
			}
		}
		return null;
	}

	public EventoEntity consultarPorNome(final String nome) {
		for (final EventoEntity eventoEntity : this.eventoBD) {

			if (nome.equals(eventoEntity.getNome())) {
				return eventoEntity;
			}

		}
		return null;
	}

	@Override
	public void excluir(final EventoEntity eventoEntity) {

		if (eventoEntity != null) {
			this.eventoBD.remove(eventoEntity);
		}

	}

	@Override
	public void alterar(final EventoEntity eventoEntity) {
		if (eventoEntity != null) {
			this.eventoBD.add(eventoEntity);
		}
	}

	@Override
	public MenuConsoleEntity consultarMenu() {

		return this.menuConsoleEntity;
	}

}
