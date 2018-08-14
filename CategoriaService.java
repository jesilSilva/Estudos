package service;

import java.util.List;

import entity.CategoriaEntity;
import entity.MenuConsoleEntity;
import repository.CategoriaRepository;

public class CategoriaService {

	CategoriaRepository categoriaRepository;

	public CategoriaService() {
		this.categoriaRepository = new CategoriaRepository();
	}

	public MenuConsoleEntity consultarMenu() {

		final MenuConsoleEntity menu = this.categoriaRepository.consultarMenu();
		return menu;
	}

	// public MenuConsoleEntity menuConsulta() {
	//
	// final MenuConsoleEntity menu = this.categoriaRepository.menuConsulta();
	// return menu;
	// }

	public String cadastrar(final CategoriaEntity categoriaEntity) {

		this.categoriaRepository.incluir(categoriaEntity);

		return "Categoria cadastrada com sucesso!";
	}

	public List<CategoriaEntity> consultarTodos() {

		final List<CategoriaEntity> categorias = this.categoriaRepository.consultarTodos();

		return categorias;
	}

	public CategoriaEntity consultarPorCodigo(final int codigo) {

		final CategoriaEntity categoria = this.categoriaRepository.consultarPorCodigo(codigo);

		return categoria;
	}

	public String excluir(final int codigo) {

		final CategoriaEntity categoriaEntity = this.categoriaRepository.consultarPorCodigo(codigo);

		String mensagem = null;

		if (categoriaEntity != null) {
			this.categoriaRepository.excluir(categoriaEntity);
			mensagem = "O registro foi deletado com sucesso!";
		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;
	}

	public String alterar(final CategoriaEntity categoriaEntity) {
		String mensagem = null;

		if (categoriaEntity != null) {

			this.categoriaRepository.alterar(categoriaEntity);

			mensagem = "O registro foi alterado com sucesso!";

		} else {
			mensagem = "Não existe registro com esse código.";
		}
		return mensagem;
	}
}