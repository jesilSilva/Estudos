package repository;

import java.util.ArrayList;
import java.util.List;

import entity.MenuConsoleEntity;
import entity.OrganizadorEntity;

public class OrganizadorRepository implements Repository<OrganizadorEntity> {

	List<OrganizadorEntity> organizadorBD;
	MenuConsoleEntity menuConsoleEntity;

	public OrganizadorRepository() {
		this.organizadorBD = new ArrayList<OrganizadorEntity>();

		final List<String> opcoes = new ArrayList<String>();

		opcoes.add("1 - Cadastrar organizador");
		opcoes.add("2 - Consultar organizador");
		opcoes.add("3 - Consultar organizador por código");
		opcoes.add("4 - Alterar organizador");
		opcoes.add("5 - Excluir organizador");
		opcoes.add("6 - Voltar");
		this.menuConsoleEntity = new MenuConsoleEntity("Organizador", opcoes);
	}

	@Override
	public void incluir(final OrganizadorEntity organizadorEntity) {

		this.organizadorBD.add(organizadorEntity);
	}

	@Override
	public List<OrganizadorEntity> consultarTodos() {
		return this.organizadorBD;
	}

	@Override
	public OrganizadorEntity consultarPorCodigo(final int codigo) {
		for (final OrganizadorEntity organizadorEntity : this.organizadorBD) {
			if (codigo == organizadorEntity.getCodigo()) {
				return organizadorEntity;
			}
		}
		return null;
	}

	@Override
	public void excluir(final OrganizadorEntity organizadorEntity) {
		if (organizadorEntity != null) {
			this.organizadorBD.remove(organizadorEntity);
		}
	}

	@Override
	public void alterar(final OrganizadorEntity organizadorEntity) {
		if (organizadorEntity != null) {
			this.organizadorBD.add(organizadorEntity);
		}
	}

	@Override
	public MenuConsoleEntity consultarMenu() {

		return this.menuConsoleEntity;
	}
}
