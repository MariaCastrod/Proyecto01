package model;

/**
 * @ClassName Plataforma
 *
 * @author Patricia Garc�a, Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public enum Plataforma {

	_2600(1), _3DS(2), DC(3), DS(4), GB(5), GBA(6), GC(7), GEN(8), N64(9), NES(10), PC(11), PS(12), PS2(13), PS3(14),
	PS4(15), PSP(16), PSV(17), SAT(18), SNES(19), WII(20), WIIU(21), X360(22), XB(23), XONE(24);

	/**
	 * Atributo codigo
	 */
	private final int codigo;

	/**
	 * Constructor de la clase Plataforma
	 *
	 * @param plataforma
	 */
	private Plataforma(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * M�todo getter del atributo plataforma
	 *
	 * @return plataforma
	 */
	public int getPlataforma() {
		return codigo;
	}

	/**
	 * Atributo array de values
	 * 
	 * 
	 */
	private static Plataforma[] values = null;

	/**
	 * M�todo que devuelve la plataforma tras recibir el value como par�metro
	 * 
	 * @param val
	 * @return
	 */
	public static Plataforma dimePlataforma(int val) {
		if (Plataforma.values == null) {
			Plataforma.values = Plataforma.values();
		}
		return Plataforma.values[val - 1];
	}

	/**
	 * M�todo para mostrar todas las Plataformas por pantalla
	 */
	public static void mostrarPlataforma() {
		StringBuilder sb;
		for (Plataforma pla : Plataforma.values()) {
			sb = new StringBuilder();
			sb.append("(").append(pla.codigo).append(")").append(pla).append("|");
			System.out.println(sb);
		}
	}

}
