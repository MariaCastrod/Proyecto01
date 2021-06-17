package model;

/**
 * @ClassName Genero
 *
 * @author Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */

public enum Genero {

	ACTION(1), ADVENTURE(2), FIGHTING(3), MISC(4), PLATFORM(5), PUZZLE(6), RACING(7), ROLE_PLAYING(8), SHOOTER(9),
	SIMULATION(10), SPORTS(11), STRATEGY(12);

	/**
	 * Atributo codigo
	 */
	private final int codigo;

	/**
	 * Constructor de la clase Genero
	 *
	 * @param codigo
	 */
	private Genero(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * M�todo getter del atributo codigo
	 *
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Atributo Array de values
	 * 
	 * 
	 */
	private static Genero[] values = null;

	/**
	 * M�todo que devuelve el g�nero tras recibir el value como par�metro
	 * 
	 * @param val
	 * @return
	 */
	public static Genero dimeGenero(int val) {
		if (Genero.values == null) {
			Genero.values = Genero.values();
		}
		return Genero.values[val - 1];
	}

	/**
	 * M�todo para mostrar todos los generos por consola
	 */
	public static void mostrarGenero() {
		StringBuilder sb;
		for (Genero gen : Genero.values()) {
			sb = new StringBuilder();
			sb.append("(").append(gen.codigo).append(")").append(gen).append("|");
			System.out.println(sb);
		}
	}

}