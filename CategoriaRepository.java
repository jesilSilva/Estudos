package repository;

import java.util.ArrayList;
import java.util.List;

import entity.CategoriaEntity;
import entity.MenuConsoleEntity;

public class CategoriaRepository implements Repository<CategoriaEntity> {

	List<CategoriaEntity> categoriaBD;
	MenuConsoleEntity menuConsoleEntity;

	public CategoriaRepository() {

		this.categoriaBD = new ArrayList<CategoriaEntity>();

		final List<String> opcoes = new ArrayList<String>();
		opcoes.add("1 - Cadastrar categoria");
		opcoes.add("2 - Consultar categoria");
		opcoes.add("3 - Consultar categoria por codigo");
		opcoes.add("4 - Alterar categoria");
		opcoes.add("5 - Excluir categoria");
		opcoes.add("6 - Voltar");

		this.menuConsoleEntity = new MenuConsoleEntity("Categoria", opcoes);

	}

	@Override
	public void incluir(final CategoriaEntity categoriaEntity) {
		this.categoriaBD.add(categoriaEntity);
	}

	@Override
	public List<CategoriaEntity> consultarTodos() {
		return this.categoriaBD;
	}

	@Override
	public CategoriaEntity consultarPorCodigo(final int codigo) {

		for (final CategoriaEntity categoriaEntity : this.categoriaBD) {
			if (codigo == categoriaEntity.getCodigo()) {
				return categoriaEntity;
			}
		}

		return null;
	}

	@Override
	public void excluir(final CategoriaEntity categoriaEntity) {
		if (categoriaEntity != null) {
			this.categoriaBD.remove(categoriaEntity);
		}
	}

	@Override
	public void alterar(final CategoriaEntity categoriaEntity) {
		// TODO - Revisar
		this.categoriaBD.add(categoriaEntity);
	}

	@Override
	public MenuConsoleEntity consultarMenu() {
		return this.menuConsoleEntity;
	}

}