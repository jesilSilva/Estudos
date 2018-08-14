package ui;

public class MenuConsoleUIStyleSimples implements MenuConsoleUIStyle {
	private String barraLateralEsquerda = "|";
	private String barraLateralDireitra = "|";
	private String juncaoLateralSuperiorEsquerda = "+";
	private String juncaoLateralSuperiorDireita = "+";
	private String juncaoLateralInferiorEsquerda = "+";
	private String juncaoLateralInferiorDireitra = "+";
	private String JuncaoLateralMedianaDireita = "+";
	private String JuncaoLateralMedianaEsquerda = "+";
	private String linha = "-";
	private int largura = 40;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getBarraLateralEsquerda()
	 */
	@Override
	public final String getBarraLateralEsquerda() {
		return this.barraLateralEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#setBarraLateralEsquerda(java.lang.String)
	 */
	@Override
	public final void setBarraLateralEsquerda(final String barraLateralEsquerda) {
		this.barraLateralEsquerda = barraLateralEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getBarraLateralDireitra()
	 */
	@Override
	public final String getBarraLateralDireitra() {
		return this.barraLateralDireitra;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#setBarraLateralDireitra(java.lang.String)
	 */
	@Override
	public final void setBarraLateralDireitra(final String barraLateralDireitra) {
		this.barraLateralDireitra = barraLateralDireitra;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getJuncaoLateralSuperiorEsquerda()
	 */
	@Override
	public final String getJuncaoLateralSuperiorEsquerda() {
		return this.juncaoLateralSuperiorEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ui.MenuConsoleUIStyle#setJuncaoLateralSuperiorEsquerda(java.lang.String)
	 */
	@Override
	public final void setJuncaoLateralSuperiorEsquerda(final String juncaoLateralSuperiorEsquerda) {
		this.juncaoLateralSuperiorEsquerda = juncaoLateralSuperiorEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getJuncaoLateralSuperiorDireita()
	 */
	@Override
	public final String getJuncaoLateralSuperiorDireita() {
		return this.juncaoLateralSuperiorDireita;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ui.MenuConsoleUIStyle#setJuncaoLateralSuperiorDireita(java.lang.String)
	 */
	@Override
	public final void setJuncaoLateralSuperiorDireita(final String juncaoLateralSuperiorDireita) {
		this.juncaoLateralSuperiorDireita = juncaoLateralSuperiorDireita;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getJuncaoLateralInferiorEsquerda()
	 */
	@Override
	public final String getJuncaoLateralInferiorEsquerda() {
		return this.juncaoLateralInferiorEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ui.MenuConsoleUIStyle#setJuncaoLateralInferiorEsquerda(java.lang.String)
	 */
	@Override
	public final void setJuncaoLateralInferiorEsquerda(final String juncaoLateralInferiorEsquerda) {
		this.juncaoLateralInferiorEsquerda = juncaoLateralInferiorEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getJuncaoLateralInferiorDireitra()
	 */
	@Override
	public final String getJuncaoLateralInferiorDireitra() {
		return this.juncaoLateralInferiorDireitra;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ui.MenuConsoleUIStyle#setJuncaoLateralInferiorDireitra(java.lang.String)
	 */
	@Override
	public final void setJuncaoLateralInferiorDireitra(final String juncaoLateralInferiorDireitra) {
		this.juncaoLateralInferiorDireitra = juncaoLateralInferiorDireitra;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getJuncaoLateralMedianaDireita()
	 */
	@Override
	public final String getJuncaoLateralMedianaDireita() {
		return this.JuncaoLateralMedianaDireita;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ui.MenuConsoleUIStyle#setJuncaoLateralMedianaDireita(java.lang.String)
	 */
	@Override
	public final void setJuncaoLateralMedianaDireita(final String juncaoLateralMedianaDireita) {
		this.JuncaoLateralMedianaDireita = juncaoLateralMedianaDireita;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getJuncaoLateralMedianaEsquerda()
	 */
	@Override
	public final String getJuncaoLateralMedianaEsquerda() {
		return this.JuncaoLateralMedianaEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ui.MenuConsoleUIStyle#setJuncaoLateralMedianaEsquerda(java.lang.String)
	 */
	@Override
	public final void setJuncaoLateralMedianaEsquerda(final String juncaoLateralMedianaEsquerda) {
		this.JuncaoLateralMedianaEsquerda = juncaoLateralMedianaEsquerda;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getLinha()
	 */
	@Override
	public final String getLinha() {
		return this.linha;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#setLinha(java.lang.String)
	 */
	@Override
	public final void setLinha(final String linha) {
		this.linha = linha;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#getLargura()
	 */
	@Override
	public final int getLargura() {
		return this.largura;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.MenuConsoleUIStyle#setLargura(int)
	 */
	@Override
	public final void setLargura(final int largura) {
		this.largura = largura;
	}

}
