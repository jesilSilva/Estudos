package service;

import java.util.List;

import entity.LocalEntity;
import entity.MenuConsoleEntity;
import repository.LocalRepository;

public class LocalService {

	LocalRepository localRepository;

	public LocalService() {
		this.localRepository = new LocalRepository();
	}

	public MenuConsoleEntity consultarMenu() {
		final MenuConsoleEntity menu = this.localRepository.consultarMenu();
		return menu;
	}

	public String cadastrar(final LocalEntity localEntity) {

		this.localRepository.incluir(localEntity);

		return "Local cadastrado com sucesso!";
	}

	public List<LocalEntity> consultarTodos() {

		final List<LocalEntity> locais = this.localRepository.consultarTodos();

		return locais;
	}

	public LocalEntity consultarPorCodigo(final int codigo) {

		final LocalEntity locais = this.localRepository.consultarPorCodigo(codigo);
		return locais;
	}

	public LocalEntity consultarPorCep(final int cep) {

		final LocalEntity locais = this.localRepository.consultarPorCep(cep);
		return locais;
	}

	public String excluir(final int codigo) {
		String mensagem = null;
		final LocalEntity localEntity = this.localRepository.consultarPorCodigo(codigo);

		if (localEntity != null) {
			this.localRepository.excluir(localEntity);
			mensagem = "O registro foi deletado com sucesso!";
		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;
	}

	public String alterar(final LocalEntity localEntity) {
		String mensagem = null;

		if (localEntity != null) {
			this.localRepository.alterar(localEntity);
			mensagem = "O registro foi alterado com sucesso!";

		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;
	}

}
