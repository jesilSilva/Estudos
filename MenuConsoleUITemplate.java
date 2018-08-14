package ui;

import java.util.Scanner;

import entity.MenuConsoleEntity;

public class MenuConsoleUITemplate {

	private static String ESCOLHA_OPCAO = "Escolha sua opção:";

	MenuConsoleEntity menuConsoleEntity;
	MenuConsoleUIStyle menuConsoleUIStyle;

	public MenuConsoleUITemplate(final MenuConsoleEntity menuConsoleEntity,
			final MenuConsoleUIStyle menuConsoleUIStyle) {
		this.menuConsoleEntity = menuConsoleEntity;
		this.menuConsoleUIStyle = menuConsoleUIStyle;
	}

	public void desenharMenu() {

		this.espacoTamanhoLinhaSuperiorMontarMenu();
		this.espacoTituloMontarMenu();
		this.espacoMedianaMontarMenu();
		this.espacoMedianaBarraDireitaMenu();

		for (final String opcao : this.menuConsoleEntity.getOpcao()) {
			this.espacoOpcoesMontarMenu(opcao);
		}
		this.espacoTamanhoLinhaInferiorMontarMenu();
	}

	private void espacoTamanhoLinhaSuperiorMontarMenu() {
		System.out.print(this.menuConsoleUIStyle.getJuncaoLateralSuperiorEsquerda());

		for (int i = 0; i < this.menuConsoleUIStyle.getLargura(); i++) {
			System.out.print(this.menuConsoleUIStyle.getLinha());
		}

		System.out.println(this.menuConsoleUIStyle.getJuncaoLateralSuperiorDireita());
	}

	private void espacoTituloMontarMenu() {

		System.out.print(this.menuConsoleUIStyle.getBarraLateralEsquerda());

		final int tamanhoTitulo = this.menuConsoleEntity.getTitle().length();
		final int centralizar = (this.menuConsoleUIStyle.getLargura() - tamanhoTitulo) / 2;
		for (int i = 0; i < centralizar; i++) {
			System.out.print(" ");

		}
		System.out.print(this.menuConsoleEntity.getTitle());
		for (int j = 0; j < centralizar + ((this.menuConsoleUIStyle.getLargura() - tamanhoTitulo) % 2); j++) {
			System.out.print(" ");
		}

		System.out.println(this.menuConsoleUIStyle.getBarraLateralDireitra());
	}

	private void espacoMedianaMontarMenu() {
		System.out.print(this.menuConsoleUIStyle.getJuncaoLateralMedianaEsquerda());

		for (int i = 0; i < this.menuConsoleUIStyle.getLargura(); i++) {
			System.out.print(this.menuConsoleUIStyle.getLinha());
		}

		System.out.println(this.menuConsoleUIStyle.getJuncaoLateralMedianaDireita());
	}

	private void espacoMedianaBarraDireitaMenu() {
		System.out.print(this.menuConsoleUIStyle.getBarraLateralEsquerda() + ESCOLHA_OPCAO);

		final int tamanho = ESCOLHA_OPCAO.length();

		for (int i = 0; i < (this.menuConsoleUIStyle.getLargura() - tamanho); i++) {
			System.out.print(" ");
		}
		System.out.println(this.menuConsoleUIStyle.getBarraLateralDireitra());
	}

	private void espacoOpcoesMontarMenu(final String opcao) {
		System.out.print(this.menuConsoleUIStyle.getBarraLateralEsquerda() + opcao);

		final int tamanho = opcao.length();

		for (int i = 0; i < (this.menuConsoleUIStyle.getLargura() - tamanho); i++) {
			System.out.print(" ");
		}

		System.out.println(this.menuConsoleUIStyle.getBarraLateralDireitra());
	}

	private void espacoTamanhoLinhaInferiorMontarMenu() {
		System.out.print(this.menuConsoleUIStyle.getJuncaoLateralInferiorEsquerda());

		for (int i = 0; i < this.menuConsoleUIStyle.getLargura(); i++) {
			System.out.print(this.menuConsoleUIStyle.getLinha());
		}

		System.out.println(this.menuConsoleUIStyle.getJuncaoLateralInferiorDireitra());
	}

	public int receberOpcaoUsuario() {

		System.out.print("Digite a opção desejada:");

		final Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		if (leitor.hasNextInt()) {
			opcao = leitor.nextInt();
		} else {
			System.out.println("Valor inválido! É preciso digitar um número.");
			return this.receberOpcaoUsuario();
		}
		System.out.println("\n\n\n\n");
		return opcao;
	}

}