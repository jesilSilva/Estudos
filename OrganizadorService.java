package service;

import java.util.List;

import entity.MenuConsoleEntity;
import entity.OrganizadorEntity;
import repository.OrganizadorRepository;

public class OrganizadorService {

	OrganizadorRepository organizadorRepository;

	public OrganizadorService() {
		this.organizadorRepository = new OrganizadorRepository();
	}

	public MenuConsoleEntity consultarMenu() {
		final MenuConsoleEntity menu = this.organizadorRepository.consultarMenu();

		return menu;
	}

	public String cadastrar(final OrganizadorEntity organizadorEntity) {

		this.organizadorRepository.incluir(organizadorEntity);

		return "Organizador cadastrado com sucesso";
	}

	public List<OrganizadorEntity> consultarTodos() {

		final List<OrganizadorEntity> locais = this.organizadorRepository.consultarTodos();

		return locais;
	}

	public OrganizadorEntity consultarPorCodigo(final int codigo) {

		final OrganizadorEntity organizadores = this.organizadorRepository.consultarPorCodigo(codigo);

		return organizadores;
	}

	public String excluir(final int codigo) {

		final OrganizadorEntity organizadorEntity = this.organizadorRepository.consultarPorCodigo(codigo);
		String mensagem = null;
		if (organizadorEntity != null) {
			this.organizadorRepository.excluir(organizadorEntity);
			mensagem = "O registro foi deletado com sucesso!";
		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;
	}

	public String alterar(final OrganizadorEntity organizadorEntity) {

		String mensagem = null;
		if (organizadorEntity != null) {
			this.organizadorRepository.alterar(organizadorEntity);

			mensagem = "O registro foi alterado com sucesso!";

		} else {
			mensagem = "Não existe organizador com esse código.";
		}

		return mensagem;
	}

}
