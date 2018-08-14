package service;

import java.util.List;

import entity.EsporteEntity;
import entity.MenuConsoleEntity;
import repository.EsporteRepository;

public class EsporteService {

	EsporteRepository esporteRepository;

	public EsporteService() {
		this.esporteRepository = new EsporteRepository();
	}

	public MenuConsoleEntity consultarMenu() {

		final MenuConsoleEntity menu = this.esporteRepository.consultarMenu();
		return menu;
	}

	public String cadastrar(final EsporteEntity esporteEntity) {

		this.esporteRepository.incluir(esporteEntity);

		return "Esporte cadastrada com sucesso!";
	}

	public List<EsporteEntity> consultarTodos() {
		final List<EsporteEntity> esportes = this.esporteRepository.consultarTodos();

		return esportes;
	}

	public EsporteEntity consultarPorCodigo(final int codigo) {

		final EsporteEntity esporte = this.esporteRepository.consultarPorCodigo(codigo);

		return esporte;
	}

	public String excluir(final int codigo) {

		String mensagem = null;
		final EsporteEntity esporteEntity = this.esporteRepository.consultarPorCodigo(codigo);
		if (esporteEntity != null) {

			this.esporteRepository.excluir(esporteEntity);
			mensagem = "O registro foi deletado com sucesso!";

		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;

	}

	public String alterar(final EsporteEntity esporteEntity) {
		String mensagem = null;

		if (esporteEntity != null) {

			this.esporteRepository.alterar(esporteEntity);
			mensagem = "O registro foi alterado com sucesso!";

		} else {
			mensagem = "Não existe registro com esse código.";
		}

		return mensagem;
	}

}
