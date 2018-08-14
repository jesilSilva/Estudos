package service;

import java.util.List;

import entity.EventoEntity;
import entity.MenuConsoleEntity;
import repository.EventoRepository;

public class EventoService {

	EventoRepository eventoRepository;

	public EventoService() {
		this.eventoRepository = new EventoRepository();
	}

	public MenuConsoleEntity consultarMenu() {
		final MenuConsoleEntity menu = this.eventoRepository.consultarMenu();

		return menu;
	}

	public String cadastrar(final EventoEntity eventoEntity) {

		this.eventoRepository.incluir(eventoEntity);

		return "Evento cadastrado com sucesso!";

	}

	public List<EventoEntity> consultarTodos() {
		final List<EventoEntity> eventos = this.eventoRepository.consultarTodos();
		return eventos;
	}

	public EventoEntity consultarPorNome(final String nome) {

		final EventoEntity eventos = this.eventoRepository.consultarPorNome(nome);

		return eventos;
	}

	public EventoEntity consultarPorCodigo(final int codigo) {
		final EventoEntity eventos = this.eventoRepository.consultarPorCodigo(codigo);

		return eventos;
	}

	public String excluir(final int codigo) {
		String mensagem = null;
		final EventoEntity eventoEntity = this.eventoRepository.consultarPorCodigo(codigo);

		if (eventoEntity != null) {
			this.eventoRepository.excluir(eventoEntity);
			mensagem = "O registro foi deletado com sucesso!";
		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;
	}

	public String alterar(final EventoEntity eventoEntity) {

		String mensagem = null;

		if (eventoEntity != null) {
			this.eventoRepository.alterar(eventoEntity);
			mensagem = "O registro foi alterado com sucesso!";

		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;
	}
}
