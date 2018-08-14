package ui;

import java.util.List;
import java.util.Scanner;

import entity.MenuConsoleEntity;
import entity.UsuarioEntity;
import service.UsuarioService;

public class UsuarioUI {

	UsuarioService usuarioService;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public UsuarioUI(final MenuConsoleUIStyle menuConsoleUIStyle) {
		this.usuarioService = new UsuarioService();
		this.menuConsoleUIStyle = menuConsoleUIStyle;
	}

	public int consultarMenu() {
		final MenuConsoleEntity menuConsoleEntity = this.usuarioService.consultarMenu();
		final MenuConsoleUITemplate menuConsoleUITemplate = new MenuConsoleUITemplate(menuConsoleEntity,
				this.menuConsoleUIStyle);

		menuConsoleUITemplate.desenharMenu();

		return menuConsoleUITemplate.receberOpcaoUsuario();
	}

	public void cadastrar() {

		final Scanner leitorUsuario = new Scanner(System.in);
		System.out.println("************Cadastro Usuário**************");
		System.out.println("Informe o nome do usuário:");
		final String nome = leitorUsuario.next();
		System.out.println("Informe o e-mail:");
		final String email = leitorUsuario.next();
		System.out.println("Informe o código do usuário:");
		final int codigo = leitorUsuario.nextInt();
		System.out.println("Informe a senha:");
		final String senha = leitorUsuario.next();
		System.out.println("Informe o telefone do usuário:");
		final int telefone = leitorUsuario.nextInt();
		System.out.println("Informe a idade do usuário:");
		final int idade = leitorUsuario.nextInt();
		final UsuarioEntity usuarioEntity = new UsuarioEntity(nome, email, codigo, senha, telefone, idade);
		final String mensagem = this.usuarioService.cadastrar(usuarioEntity);
		System.out.println(mensagem + "\n");

	}

	public void consultarTodos() {

		final List<UsuarioEntity> usuarios = this.usuarioService.consultarTodos();

		if (usuarios.isEmpty()) {
			System.out.println("Não existe usuários cadastrados!");
			System.out.println("\n\n\n");
		} else {

			for (int i = 0; i < usuarios.size(); i++) {

				System.out.println("******Consulta Usuário********");
				System.out.println("********  Dados do Usuário ********");
				System.out.println("Nome: " + usuarios.get(i).getNome());
				System.out.println("E-mail:" + usuarios.get(i).getEmail());
				System.out.println("Código do usuário:" + usuarios.get(i).getCodigo());
				System.out.println("Senha: " + usuarios.get(i).getSenha());
				System.out.println("Telefone: " + usuarios.get(i).getTelefone());
				System.out.println("Idade:" + usuarios.get(i).getIdade());
				System.out.println("**********************************");
			}
		}

	}

	public void consultarPorCodigo() {

		final Scanner leitorUsuario = new Scanner(System.in);
		System.out.println("************Consultar por c�digo**************");

		System.out.println("informe o c�digo do usu�rio:");
		final int codigo = leitorUsuario.nextInt();

		final UsuarioEntity usuarios = this.usuarioService.consultarPorCodigo(codigo);

		if (usuarios == null) {
			System.out.println("N�o existe usu�rios com esse c�digo!");
		} else {
			System.out.println("******Consulta Usuário********");
			System.out.println("********  Dados do Usuário ********");
			System.out.println("Nome: " + usuarios.getNome());
			System.out.println("E-mail:" + usuarios.getEmail());
			System.out.println("Código do usuário:" + usuarios.getCodigo());
			System.out.println("Senha: " + usuarios.getSenha());
			System.out.println("Telefone: " + usuarios.getTelefone());
			System.out.println("Idade:" + usuarios.getIdade());
			System.out.println("**********************************");

		}

	}

	public void excluir() {
		final Scanner leitorUsuario = new Scanner(System.in);
		System.out.println("****************Exclusão do usuário********************");
		System.out.println("Informe o c�digo do usu�rio que deseja excluir:");
		final int codigo = leitorUsuario.nextInt();

		final String mensagem = this.usuarioService.excluir(codigo);
		System.out.println(mensagem);
	}

	public void alterar() {
		final Scanner leitorUsuario = new Scanner(System.in);
		System.out.println("****************Alteração do usu�rio********************");
		System.out.println("Informe o código do usuário:");
		final int codigo = leitorUsuario.nextInt();
		System.out.println("Informe o novo nome:");
		final String nome = leitorUsuario.next();
		System.out.println("Informe o e-mail:");
		final String email = leitorUsuario.next();
		System.out.println("Informe a senha:");
		final String senha = leitorUsuario.next();
		System.out.println("Informe o telefone:");
		final int telefone = leitorUsuario.nextInt();
		System.out.println("Informe a idade:");
		final int idade = leitorUsuario.nextInt();
		final UsuarioEntity usuarioEntity = new UsuarioEntity(nome, email, codigo, senha, telefone, idade);
		final String mensagem = this.usuarioService.alterar(usuarioEntity);
		System.out.println(mensagem);
	}

}