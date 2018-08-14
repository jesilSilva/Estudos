package ui;

import java.util.List;
import java.util.Scanner;

import entity.CategoriaEntity;
import entity.MenuConsoleEntity;
import service.CategoriaService;

public class CategoriaUI {

	CategoriaService categoriaService;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public CategoriaUI(final MenuConsoleUIStyle menuConsoleUIStyle) {
		this.categoriaService = new CategoriaService();
		this.menuConsoleUIStyle = menuConsoleUIStyle;
	}

	public int consultarMenu() {
		final MenuConsoleEntity menuConsoleEntity = this.categoriaService.consultarMenu();
		final MenuConsoleUITemplate menuConsoleUITemplate = new MenuConsoleUITemplate(menuConsoleEntity,
				this.menuConsoleUIStyle);
		menuConsoleUITemplate.desenharMenu();
		return menuConsoleUITemplate.receberOpcaoUsuario();
	}

	public void cadastrar() {

		final Scanner leitorCategoria = new Scanner(System.in);
		new MenuConsoleUITemplate(null, this.menuConsoleUIStyle);
		System.out.println("Informe o c�digo:");
		final int codigo = leitorCategoria.nextInt();

		System.out.println("Informe o nome da categoria:");
		final String nome = leitorCategoria.next();

		System.out.println("Informe caracteristica");
		final String caracteristica = leitorCategoria.next();

		System.out.println("Informe o esporte:");
		final String esporte = leitorCategoria.next();

		System.out.println("Informe a restrição:");
		final String restricao = leitorCategoria.next();

		final CategoriaEntity categoriaEntity = new CategoriaEntity(codigo, nome, caracteristica, esporte, restricao);

		final String mensagem = this.categoriaService.cadastrar(categoriaEntity);

		System.out.println(mensagem + "\n");

	}

	public void consultarTodos() {

		final List<CategoriaEntity> categorias = this.categoriaService.consultarTodos();

		if (categorias.isEmpty()) {
			System.out.println("Não existe categorias cadastradas!");
		} else {
			for (int i = 0; i < categorias.size(); i++) {

				System.out.println("******Consulta Categoria********");
				System.out.println("********  Dados da Categoria ********");
				System.out.println("Código da categoria:" + categorias.get(i).getCodigo());
				System.out.println("Nome da categoria: " + categorias.get(i).getNome());
				System.out.println("Caracteristicas:" + categorias.get(i).getCaracteristicas());
				System.out.println("Categoria: " + categorias.get(i).getEsporte());
				System.out.println("Restrição: " + categorias.get(i).getRestricao());
				System.out.println("**********************************");
			}
		}
	}

	public void consultarPorCodigo() {

		final Scanner leitorCategoria = new Scanner(System.in);
		System.out.println("************Consultar por c�digo da categoria**************");

		System.out.println("Informe o código:");
		final int codigo = leitorCategoria.nextInt();

		final CategoriaEntity categoria = this.categoriaService.consultarPorCodigo(codigo);

		if (categoria == null) {
			System.out.println("Não existe categorias cadastradas!");
		} else {

			System.out.println("******Consulta Categoria********");
			System.out.println("********  Dados da Categoria ********");
			System.out.println("Código da categoria:" + categoria.getCodigo());
			System.out.println("Nome da categoria: " + categoria.getNome());
			System.out.println("Caracteristicas:" + categoria.getCaracteristicas());
			System.out.println("Categoria: " + categoria.getEsporte());
			System.out.println("Restrição: " + categoria.getRestricao());
			System.out.println("**********************************");

		}
	}

	public void excluir() {
		final Scanner leitorCategoria = new Scanner(System.in);

		System.out.println("****************Exclusão da Categoria********************");
		System.out.println("Informe o código da categoria que deseja excluir:");

		final int codigo = leitorCategoria.nextInt();

		final String mensagem = this.categoriaService.excluir(codigo);
		System.out.println(mensagem);
	}

	public void alterar() {

		final Scanner leitorCategoria = new Scanner(System.in);

		System.out.println("****************Alteração da categoria********************");

		System.out.println("Informe o c�digo:");
		final int codigo = leitorCategoria.nextInt();

		System.out.println("Informe o nome da categoria:");
		final String nome = leitorCategoria.next();

		System.out.println("Informe caracteristica");
		final String caracteristica = leitorCategoria.next();

		System.out.println("Informe o esporte:");
		final String esporte = leitorCategoria.next();

		System.out.println("Informe a restrição:");
		final String restricao = leitorCategoria.next();

		final CategoriaEntity categoriaEntity = new CategoriaEntity(codigo, nome, caracteristica, esporte, restricao);

		final String mensagem = this.categoriaService.alterar(categoriaEntity);

		System.out.println(mensagem);

	}

}