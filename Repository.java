package repository;

import java.util.List;

import entity.MenuConsoleEntity;

public interface Repository<Entity> {

	public void incluir(final Entity entity);

	public void excluir(final Entity entity);

	public void alterar(final Entity entity);

	public List<Entity> consultarTodos();

	public Entity consultarPorCodigo(final int codigo);

	public MenuConsoleEntity consultarMenu();

}