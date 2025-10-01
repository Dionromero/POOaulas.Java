public class Time {
	/*
	 * atributos de objetos privados da classe Time
	 */
	int posicao = 0;
	String nomejogador;
	
	/*
	 * atributos de classe publicos da classe Time
	 */
	static String[] posicoes = {"goleiro", "fixo", "ala direito", "ala esquerdo", "pivô"};
	static String[] jogadores = new String[5];
	
	public Time(String nomejogador) {
		this.nomejogador = nomejogador;
	}
}