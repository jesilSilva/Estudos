package ui;

import java.util.List;
import java.util.Scanner;

import entity.LocalEntity;
import entity.MenuConsoleEntity;
import service.LocalService;

public class LocalUI {
	LocalService localService;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public LocalUI(final MenuConsoleUIStyle menuConsoleUIStyle) {
		this.localService = new LocalService();
		this.menuConsoleUIStyle = menuConsoleUIStyle;

	}

	public int consultaMenu() {

		final MenuConsoleEntity menuConsoleEntity = this.localService.consultarMenu();

		final MenuConsoleUITemplate menuConsoleUITemplate = new MenuConsoleUITemplate(menuConsoleEntity,
				this.menuConsoleUIStyle);
		menuConsoleUITemplate.desenharMenu();

		return menuConsoleUITemplate.receberOpcaoUsuario();
	}

	public void cadastrar() {

		final Scanner leitorLocal = new Scanner(System.in);
		System.out.println("************Cadastro Local**************");

		System.out.println("Informe o c�digo do local:");
		final int codigo = leitorLocal.nextInt();
		System.out.println("Informe o endereço do local:");
		final String endereco = leitorLocal.next();
		System.out.println("Informe o número:");
		final int numero = leitorLocal.nextInt();
		System.out.println("Informe o bairro:");
		final String bairro = leitorLocal.next();
		System.out.println("Informe o complemento:");
		final String complemento = leitorLocal.next();
		System.out.println("Informe o CEP:");
		final int cep = leitorLocal.nextInt();
		final LocalEntity localEntity = new LocalEntity(codigo, endereco, numero, bairro, complemento, cep);
		final String mensagem = this.localService.cadastrar(localEntity);
		System.out.println(mensagem + "\n");
	}

	public void consultarTodos() {

		final List<LocalEntity> locais = this.localService.consultarTodos();

		if (locais.isEmpty()) {
			System.out.println("Não existe locais cadastrados!");
		} else {
			for (int i = 0; i < locais.size(); i++) {

				System.out.println("******Consulta Local********");
				System.out.println("********  Dados do Local ********");
				System.out.println("Endereço: " + locais.get(i).getEndereco());
				System.out.println("Número:" + locais.get(i).getNumero());
				System.out.println("Bairro:" + locais.get(i).getBairro());
				System.out.println("Complemento: " + locais.get(i).getComplemento());
				System.out.println("CEP: " + locais.get(i).getCep());
				System.out.println("**********************************");

			}
		}

	}

	public void consultarPorCodigo() {
		final Scanner leitorLocal = new Scanner(System.in);
		System.out.println("************Consultar por CEP**************");
		System.out.println("informe o c�digo do local:");
		final int codigo = leitorLocal.nextInt();

		final LocalEntity locais = this.localService.consultarPorCodigo(codigo);

		if (locais == null) {
			System.out.println("Não existe locais cadastrados com esse c�digo!");
		} else {
			System.out.println("******Consulta Local********");
			System.out.println("********  Dados do Local ********");
			System.out.println("Endereço: " + locais.getEndereco());
			System.out.println("Número:" + locais.getNumero());
			System.out.println("Bairro:" + locais.getBairro());
			System.out.println("Complemento: " + locais.getComplemento());
			System.out.println("CEP: " + locais.getCep());
			System.out.println("**********************************");

		}
	}

	public void consultarPorCep() {
		final Scanner leitorLocal = new Scanner(System.in);
		System.out.println("************Consultar por CEP**************");
		System.out.println("informe o cep do local:");
		final int cep = leitorLocal.nextInt();

		final LocalEntity locais = this.localService.consultarPorCep(cep);

		if (locais == null) {
			System.out.println("Não existe locais cadastrados com esse cep!");
		} else {
			System.out.println("******Consulta Local********");
			System.out.println("********  Dados do Local ********");
			System.out.println("Endereço: " + locais.getEndereco());
			System.out.println("Número:" + locais.getNumero());
			System.out.println("Bairro:" + locais.getBairro());
			System.out.println("Complemento: " + locais.getComplemento());
			System.out.println("CEP: " + locais.getCep());
			System.out.println("**********************************");

		}
	}

	public void excluir() {
		final Scanner leitorLocal = new Scanner(System.in);
		System.out.println("****************Exclusão do Local********************");
		System.out.println("Informe o c�digo do endere�o que deseja excluir:");
		final int codigo = leitorLocal.nextInt();

		final String mensagem = this.localService.excluir(codigo);
		System.out.println(mensagem);
	}

	public void alterar() {
		final Scanner leitorLocal = new Scanner(System.in);
		System.out.println("****************Alteração do local********************");

		System.out.println("Informe o c�digo:");
		final int codigo = leitorLocal.nextInt();
		System.out.println("Informe o novo endereço:");
		final String endereco = leitorLocal.next();
		System.out.println("Informe o número:");
		final int numero = leitorLocal.nextInt();
		System.out.println("Informe o bairro:");
		final String bairro = leitorLocal.next();
		System.out.println("Informe o complemento:");
		final String complemento = leitorLocal.next();
		System.out.println("Informe o CEP :");
		final int cep = leitorLocal.nextInt();
		final LocalEntity localEntity = new LocalEntity(codigo, endereco, numero, bairro, complemento, cep);
		final String mensagem = this.localService.alterar(localEntity);
		System.out.println(mensagem);
	}
}
