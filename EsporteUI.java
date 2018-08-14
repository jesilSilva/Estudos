package ui;

import java.util.List;
import java.util.Scanner;

import entity.EsporteEntity;
import entity.MenuConsoleEntity;
import service.EsporteService;

public class EsporteUI {

	EsporteService esporteService;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public EsporteUI(final MenuConsoleUIStyle menuConsoleUIStyle) {
		this.esporteService = new EsporteService();
		this.menuConsoleUIStyle = menuConsoleUIStyle;
	}

	public int consultarMenu() {
		final MenuConsoleEntity menuConsoleEntity = this.esporteService.consultarMenu();
		final MenuConsoleUITemplate menuConsoleUITemplate = new MenuConsoleUITemplate(menuConsoleEntity,
				this.menuConsoleUIStyle);
		menuConsoleUITemplate.desenharMenu();

		return menuConsoleUITemplate.receberOpcaoUsuario();
	}

	public void cadastrar() {
		final Scanner leitorEsporte = new Scanner(System.in);
		System.out.println("************Cadastro esporte**************");

		System.out.println("Informe o nome do esporte:");
		final String nome = leitorEsporte.next();
		System.out.println("Informe a quantidade de participantes:");

		final int qtdParticipantes = leitorEsporte.nextInt();
		System.out.println("Informe o código do esporte:");
		final int codigoEsporte = leitorEsporte.nextInt();
		System.out.println("Informe a regra do esporte:");
		final String regra = leitorEsporte.next();
		System.out.println("Informe a data de criação:");
		final String dataCriacao = leitorEsporte.next();

		final EsporteEntity esporteEntity = new EsporteEntity(nome, qtdParticipantes, codigoEsporte, regra,
				dataCriacao);
		final String mensagem = this.esporteService.cadastrar(esporteEntity);

		System.out.println(mensagem + "\n");

	}

	public void consultarTodos() {
		final List<EsporteEntity> esportes = this.esporteService.consultarTodos();

		if (esportes.isEmpty()) {
			System.out.println("Não existe esportes cadastrados!");
		} else {
			for (int i = 0; i < esportes.size(); i++) {

				System.out.println("********  Dados do esporte ********");
				System.out.println("Nome da esporte: " + esportes.get(i).getNome());
				System.out.println("Qtd participantes:" + esportes.get(i).getQtdParticipantes());
				System.out.println("código do esporte:" + esportes.get(i).getCodigo());
				System.out.println("Regra: " + esportes.get(i).getRegra());
				System.out.println("Data de criação: " + esportes.get(i).getDataCriacao());
				System.out.println("**********************************");

			}
		}

	}

	public void consultarPorCodigo() {

		final Scanner leitorEsporte = new Scanner(System.in);
		System.out.println("************Consultar por c�digo do esporte**************");

		System.out.println("Informe o código:");
		final int codigo = leitorEsporte.nextInt();

		final EsporteEntity esporte = this.esporteService.consultarPorCodigo(codigo);

		if (esporte == null) {
			System.out.println("Não existe esportes cadastrados!");
		} else {
			System.out.println("******Consulta Esporte********");
			System.out.println("********  Dados do esporte ********");
			System.out.println("Nome da esporte: " + esporte.getNome());
			System.out.println("Qtd participantes:" + esporte.getQtdParticipantes());
			System.out.println("código do esporte:" + esporte.getCodigo());
			System.out.println("Regra: " + esporte.getRegra());
			System.out.println("Data de criação: " + esporte.getDataCriacao());
			System.out.println("**********************************");
		}
	}

	public void excluir() {
		final Scanner leitorEsporte = new Scanner(System.in);

		System.out.println("****************Exclusão do Esporte********************");
		System.out.println("Informe o código do esporte que deseja excluir:");
		final int codigo = leitorEsporte.nextInt();

		final String mensagem = this.esporteService.excluir(codigo);
		System.out.println(mensagem);
	}

	public void alterar() {
		System.out.println("****************Alteração do esporte********************");
		final Scanner leitorEsporte = new Scanner(System.in);
		System.out.println("Informe o código do esporte:");
		final int codigo = leitorEsporte.nextInt();
		System.out.println("Informe o novo nome:");
		final String nome = leitorEsporte.next();
		System.out.println("Informe a quantidade de participantes:");
		final int qtdParticipantes = leitorEsporte.nextInt();
		System.out.println("Informe a regra:");
		final String regra = leitorEsporte.next();
		System.out.println("Informe a data de criação :");
		final String dataCriacao = leitorEsporte.next();

		final EsporteEntity esporteEntity = new EsporteEntity(nome, qtdParticipantes, codigo, regra, dataCriacao);
		final String mensagem = this.esporteService.alterar(esporteEntity);

		System.out.println(mensagem);
	}
}
