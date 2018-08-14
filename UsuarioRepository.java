package repository;

import java.util.ArrayList;
import java.util.List;

import entity.MenuConsoleEntity;
import entity.UsuarioEntity;

public class UsuarioRepository implements Repository<UsuarioEntity> {

	List<UsuarioEntity> usuarioBD;
	MenuConsoleEntity menuConsoleEntity;

	public UsuarioRepository() {
		this.usuarioBD = new ArrayList<UsuarioEntity>();

		final List<String> opcoes = new ArrayList<String>();
		opcoes.add("1 - Cadastrar usu�rio");
		opcoes.add("2 - Consultar usu�rio");
		opcoes.add("3 - Consultar usu�rio por c�digo");
		opcoes.add("4 - Alterar usu�rio");
		opcoes.add("5 - Excluir usu�rio");
		opcoes.add("6 - Voltar");

		this.menuConsoleEntity = new MenuConsoleEntity("Usu�rio", opcoes);

	}

	@Override
	public void incluir(final UsuarioEntity usuarioEntity) {
		this.usuarioBD.add(usuarioEntity);
	}

	@Override
	public List<UsuarioEntity> consultarTodos() {
		return this.usuarioBD;
	}

	@Override
	public UsuarioEntity consultarPorCodigo(final int codigo) {
		for (final UsuarioEntity usuarioEntity : this.usuarioBD) {

			if (codigo == usuarioEntity.getCodigo()) {
				return usuarioEntity;
			}

		}
		return null;
	}

	@Override
	public void excluir(final UsuarioEntity usuarioEntity) {

		if (usuarioEntity != null) {
			this.usuarioBD.remove(usuarioEntity);
		}
	}

	@Override
	public void alterar(final UsuarioEntity usuarioEntity) {
		this.usuarioBD.add(usuarioEntity);
	}

	@Override
	public MenuConsoleEntity consultarMenu() {
		return this.menuConsoleEntity;
	}

}