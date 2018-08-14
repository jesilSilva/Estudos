package ui;

import java.util.List;
import java.util.Scanner;

import entity.MenuConsoleEntity;
import entity.OrganizadorEntity;
import service.OrganizadorService;

public class OrganizadorUI {

	OrganizadorService organizadorService;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public OrganizadorUI(final MenuConsoleUIStyle menuConsoleUIStyle) {
		this.organizadorService = new OrganizadorService();
		this.menuConsoleUIStyle = menuConsoleUIStyle;
	}

	public int consultarMenu() {
		final MenuConsoleEntity menuConsoleEntity = this.organizadorService.consultarMenu();
		final MenuConsoleUITemplate menuConsoleUITemplate = new MenuConsoleUITemplate(menuConsoleEntity,
				this.menuConsoleUIStyle);

		menuConsoleUITemplate.desenharMenu();

		return menuConsoleUITemplate.receberOpcaoUsuario();
	}

	public void cadastrar() {

		final Scanner leitorOrganizador = new Scanner(System.in);
		System.out.println("************Cadastro Organizador**************");

		System.out.println("Informe o nome do organizador:");
		final String nome = leitorOrganizador.next();
		System.out.println("Informe o c√≥digo do organizador:");
		final int codigo = leitorOrganizador.nextInt();
		System.out.println("Informe o Evento criado:");
		final String evento = leitorOrganizador.next();
		System.out.println("Informe a descricao:");
		final String descricao = leitorOrganizador.next();
		System.out.println("Informe o n√≠vel do organizador:");
		final int nivel = leitorOrganizador.nextInt();
		final OrganizadorEntity organizadorEntity = new OrganizadorEntity(nome, codigo, evento, descricao, nivel);
		final String mensagem = this.organizadorService.cadastrar(organizadorEntity);
		System.out.println(mensagem + "\n");
	}

	public void consultarTodos() {

		final List<OrganizadorEntity> locais = this.organizadorService.consultarTodos();

		if (locais.isEmpty()) {
			System.out.println("Nao existe organizadores cadastrados!");
		} else {

			for (int i = 0; i < locais.size(); i++) {

				System.out.println("******Consulta Organizador********");
				System.out.println("********  Dados do Organizador ********");
				System.out.println("Nome: " + locais.get(i).getNome());
				System.out.println("Codigo:" + locais.get(i).getCodigo());
				System.out.println("Evento:" + locais.get(i).getEventoCriado());
				System.out.println("Descricao: " + locais.get(i).getDescricao());
				System.out.println("Nivel do organizador: " + locais.get(i).getNivelOrganizador());
				System.out.println("**********************************");
			}
		}

	}

	public void consultarPorCodigo() {

		final Scanner leitorOrganizador = new Scanner(System.in);
		System.out.println("************Consultar por cÛdigo**************");
		System.out.println("informe o cÛdigo do organizador:");
		final int codigo = leitorOrganizador.nextInt();

		final OrganizadorEntity organizadores = this.organizadorService.consultarPorCodigo(codigo);

		if (organizadores == null) {
			System.out.println("N„o existe organizadores com esse cÛdigo!");
		} else {
			System.out.println("******Consulta Organizador********");
			System.out.println("********  Dados do Organizador ********");
			System.out.println("Nome: " + organizadores.getNome());
			System.out.println("Codigo:" + organizadores.getCodigo());
			System.out.println("Evento:" + organizadores.getEventoCriado());
			System.out.println("Descricao: " + organizadores.getDescricao());
			System.out.println("Nivel do organizador: " + organizadores.getNivelOrganizador());
			System.out.println("**********************************");
			System.out.println("\n\n\n");

		}

	}

	public void excluir() {
		final Scanner leitorOrganizador = new Scanner(System.in);
		System.out.println("****************Exclus√£o do organizador********************");
		System.out.println("Informe o cÛdigo do organizador que deseja excluir:");
		final int codigo = leitorOrganizador.nextInt();

		final String mensagem = this.organizadorService.excluir(codigo);
		System.out.println(mensagem);
	}

	public void alterar() {
		final Scanner leitorOrganizador = new Scanner(System.in);
		System.out.println("****************Altera√ß√£o do organizador********************");
		System.out.println("Informe o novo nome:");
		final String nome = leitorOrganizador.next();
		System.out.println("Informe o c√≥digo do organizador:");
		final int codigo = leitorOrganizador.nextInt();
		System.out.println("Informe o evento criado:");
		final String evento = leitorOrganizador.next();
		System.out.println("Informe a descricao:");
		final String descricao = leitorOrganizador.next();
		System.out.println("Informe o n√≠vel do organizador :");
		final int nivel = leitorOrganizador.nextInt();

		final OrganizadorEntity organizadorEntity = new OrganizadorEntity(nome, codigo, evento, descricao, nivel);
		this.organizadorService.alterar(organizadorEntity);

	}

}