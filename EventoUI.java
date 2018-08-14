package ui;

import java.util.List;
import java.util.Scanner;

import entity.EventoEntity;
import entity.MenuConsoleEntity;
import service.EventoService;

public class EventoUI {
	EventoService eventoService;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public EventoUI(final MenuConsoleUIStyle menuConsoleUIStyle) {
		this.eventoService = new EventoService();
		this.menuConsoleUIStyle = menuConsoleUIStyle;
	}

	public int consultarMenu() {
		final MenuConsoleEntity menuConsoleEntity = this.eventoService.consultarMenu();
		final MenuConsoleUITemplate menuConsoleUITemplate = new MenuConsoleUITemplate(menuConsoleEntity,
				this.menuConsoleUIStyle);
		menuConsoleUITemplate.desenharMenu();
		return menuConsoleUITemplate.receberOpcaoUsuario();
	}

	public void cadastrar() {

		final Scanner leitorEvento = new Scanner(System.in);
		System.out.println("************Cadastro Evento**************");

		System.out.println("Informe o c�digo do evento:");
		final int codigo = leitorEvento.nextInt();
		System.out.println("Informe o nome do Evento:");
		final String nome = leitorEvento.next();
		System.out.println("Informe a data do evento:");
		final String data = leitorEvento.next();
		System.out.println("Informe o local do evento:");
		final String local = leitorEvento.next();
		System.out.println("Informe o horário do evento:");
		final String horario = leitorEvento.next();
		System.out.println("Informe o custo do evento:");
		final Double custo = leitorEvento.nextDouble();

		final EventoEntity eventoEntity = new EventoEntity(codigo, nome, data, local, horario, custo);

		final String mensagem = this.eventoService.cadastrar(eventoEntity);

		System.out.println(mensagem + "\n");

	}

	public void consultarTodos() {
		final List<EventoEntity> eventos = this.eventoService.consultarTodos();

		if (eventos.isEmpty()) {
			System.out.println("Não existe eventos cadastrados!");
		} else {
			for (int i = 0; i < eventos.size(); i++) {

				System.out.println("******Consulta Evento********");
				System.out.println("********  Dados do Evento ********");
				System.out.println("Nome do evento: " + eventos.get(i).getNome());
				System.out.println("Data:" + eventos.get(i).getData());
				System.out.println("Local:" + eventos.get(i).getLocal());
				System.out.println("Horário: " + eventos.get(i).getHorario());
				System.out.println("Custo: " + eventos.get(i).getCusto());
				System.out.println("**********************************");

			}
		}

	}

	public void consultarPorNome() {

		final Scanner leitorEvento = new Scanner(System.in);

		System.out.println("************Consultar por nome do evento**************");

		System.out.println("Informe o nome:");
		final String nome = leitorEvento.next();

		final EventoEntity eventos = this.eventoService.consultarPorNome(nome);

		if (eventos == null) {
			System.out.println("Não existe eventos cadastrados!");
		} else {
			System.out.println("******Consulta Evento********");
			System.out.println("********  Dados do Evento ********");
			System.out.println("Nome do evento: " + eventos.getNome());
			System.out.println("Data:" + eventos.getData());
			System.out.println("Local:" + eventos.getLocal());
			System.out.println("Horário: " + eventos.getHorario());
			System.out.println("Custo: " + eventos.getCusto());
			System.out.println("**********************************");

		}
	}

	public void consultarPorCodigo() {

		final Scanner leitorEvento = new Scanner(System.in);

		System.out.println("************Consultar por nome do evento**************");

		System.out.println("Informe o código:");
		final int codigo = leitorEvento.nextInt();

		final EventoEntity eventos = this.eventoService.consultarPorCodigo(codigo);

		if (eventos == null) {
			System.out.println("Não existe eventos cadastrados!");
		} else {
			System.out.println("******Consulta Evento********");
			System.out.println("********  Dados do Evento ********");
			System.out.println("Nome do evento: " + eventos.getNome());
			System.out.println("Data:" + eventos.getData());
			System.out.println("Local:" + eventos.getLocal());
			System.out.println("Horário: " + eventos.getHorario());
			System.out.println("Custo: " + eventos.getCusto());
			System.out.println("**********************************");

		}
	}

	public void excluir() {
		String mensagem = null;
		final Scanner leitorEvento = new Scanner(System.in);
		System.out.println("****************Exclusão do evento********************");
		System.out.println("Informe o c�digo do evento que deseja excluir:");
		final int codigo = leitorEvento.nextInt();
		mensagem = this.eventoService.excluir(codigo);

		System.out.println(mensagem);

	}

	public void alterar() {
		System.out.println("****************Alteração do evento********************");
		final Scanner leitorEvento = new Scanner(System.in);

		System.out.println("Informe o código:");
		final int codigo = leitorEvento.nextInt();
		System.out.println("Informe o novo nome:");
		final String nome = leitorEvento.next();
		System.out.println("Informe a data:");
		final String data = leitorEvento.next();
		System.out.println("Informe o local:");
		final String local = leitorEvento.next();
		System.out.println("Informe o horário:");
		final String horario = leitorEvento.next();
		System.out.println("Informe o custo :");
		final Double custo = leitorEvento.nextDouble();
		final EventoEntity eventoEntity = new EventoEntity(codigo, nome, data, local, horario, custo);
		final String mensagem = this.eventoService.alterar(eventoEntity);
		System.out.println(mensagem);
	}

}
