package service;

import java.util.List;

import entity.MenuConsoleEntity;
import entity.UsuarioEntity;
import repository.UsuarioRepository;

public class UsuarioService {

	UsuarioRepository usuarioRepository;

	public UsuarioService() {
		this.usuarioRepository = new UsuarioRepository();
	}

	public MenuConsoleEntity consultarMenu() {

		final MenuConsoleEntity menu = this.usuarioRepository.consultarMenu();

		return menu;
	}

	public String cadastrar(final UsuarioEntity usuarioEntity) {

		this.usuarioRepository.incluir(usuarioEntity);

		return "Usuário cadastrado com sucesso!";
	}

	public List<UsuarioEntity> consultarTodos() {

		final List<UsuarioEntity> usuarios = this.usuarioRepository.consultarTodos();

		return usuarios;
	}

	public UsuarioEntity consultarPorCodigo(final int codigo) {

		final UsuarioEntity usuarios = this.usuarioRepository.consultarPorCodigo(codigo);
		return usuarios;
	}

	public String excluir(final int codigo) {
		String mensagem = null;
		final UsuarioEntity usuarioEntity = this.usuarioRepository.consultarPorCodigo(codigo);

		if (usuarioEntity != null) {
			this.usuarioRepository.excluir(usuarioEntity);

			mensagem = "O registro foi deletado com sucesso!";
		} else {
			mensagem = "Não existe registro com esse código.";
		}

		return mensagem;
	}

	public String alterar(final UsuarioEntity usuarioEntity) {

		String mensagem = null;

		if (usuarioEntity != null) {

			this.usuarioRepository.alterar(usuarioEntity);

			mensagem = "O registro foi alterado com sucesso!";

		} else {
			mensagem = "Não existe registro com esse código.";
		}

		return mensagem;
	}

}