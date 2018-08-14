package repository;

import java.util.ArrayList;
import java.util.List;

import entity.LocalEntity;
import entity.MenuConsoleEntity;

public class LocalRepository implements Repository<LocalEntity> {

	List<LocalEntity> localBD;
	MenuConsoleEntity menuConsoleEntity;

	public LocalRepository() {

		this.localBD = new ArrayList<LocalEntity>();

		final List<String> opcoes = new ArrayList<String>();
		opcoes.add("1 - Cadastrar local");
		opcoes.add("2 - Consultar local");
		opcoes.add("3 - Consultar local por código");
		opcoes.add("4 - Consultar local por cep");
		opcoes.add("5 - Alterar local");
		opcoes.add("6 - Excluir local");
		opcoes.add("7 - Voltar");

		this.menuConsoleEntity = new MenuConsoleEntity("Local", opcoes);
	}

	@Override
	public void incluir(final LocalEntity localEntity) {
		this.localBD.add(localEntity);
	}

	@Override
	public List<LocalEntity> consultarTodos() {
		return this.localBD;
	}

	@Override
	public LocalEntity consultarPorCodigo(final int codigo) {

		for (final LocalEntity localEntity : this.localBD) {
			if (codigo == localEntity.getCodigo()) {
				return localEntity;
			}
		}
		return null;
	}

	public LocalEntity consultarPorCep(final int cep) {
		for (final LocalEntity localEntity : this.localBD) {

			if (cep == localEntity.getCep()) {
				return localEntity;
			}

		}
		return null;
	}

	@Override
	public void excluir(final LocalEntity localEntity) {

		if (localEntity != null) {
			this.localBD.remove(localEntity);
		}
	}

	@Override
	public void alterar(final LocalEntity localEntity) {

		if (localEntity != null) {
			this.localBD.remove(localEntity);

		}
	}

	@Override
	public MenuConsoleEntity consultarMenu() {

		return this.menuConsoleEntity;
	}

}
