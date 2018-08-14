package repository;

import java.util.ArrayList;
import java.util.List;

import entity.EsporteEntity;
import entity.MenuConsoleEntity;

public class EsporteRepository implements Repository<EsporteEntity> {

	List<EsporteEntity> esporteBD;
	MenuConsoleEntity menuConsoleEntity;

	public EsporteRepository() {
		this.esporteBD = new ArrayList<EsporteEntity>();

		final List<String> opcoes = new ArrayList<String>();
		opcoes.add("1 - Cadastrar esporte");
		opcoes.add("2 - Consultar todos esportes");
		opcoes.add("3 - Consultar esporte por código ");
		opcoes.add("4 - Alterar esporte");
		opcoes.add("5 - Excluir esporte");
		opcoes.add("6 - Voltar");

		this.menuConsoleEntity = new MenuConsoleEntity("Esporte", opcoes);

	}

	@Override
	public void incluir(final EsporteEntity esporteEntity) {
		this.esporteBD.add(esporteEntity);
	}

	@Override
	public List<EsporteEntity> consultarTodos() {
		return this.esporteBD;
	}

	@Override
	public EsporteEntity consultarPorCodigo(final int codigo) {

		for (final EsporteEntity esporteEntity : this.esporteBD) {
			if (codigo == esporteEntity.getCodigo()) {
				return esporteEntity;
			}
		}
		return null;
	}

	@Override
	public void excluir(final EsporteEntity esporteEntity) {

		if (esporteEntity != null) {
			this.esporteBD.remove(esporteEntity);
		}
	}

	@Override
	public void alterar(final EsporteEntity esporteEntity) {
		this.esporteBD.add(esporteEntity);
	}

	@Override
	public MenuConsoleEntity consultarMenu() {
		return this.menuConsoleEntity;
	}
}