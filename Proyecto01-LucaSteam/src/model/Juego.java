package model;

import java.io.Serializable;
import utilities.Teclado;

/**
 * @ClassName Juego
 *
 * @author Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class Juego implements Serializable {
	private String nombre;
	private Integer fecha;
	private String editor;
	private Genero genero;
	private Plataforma plataforma;
	private Double ventas;

	/**
	 * Constructor de la clase Juego
	 *
	 */
	public Juego() {
		super();
	}

	/**
	 * Constructor de la clase Juego
	 *
	 * @param nombre
	 * @param fecha
	 * @param editor
	 * @param genero
	 * @param plataforma
	 * @param ventas
	 */
	public Juego(String nombre, Integer fecha, String editor, Genero genero, Plataforma plataforma, Double ventas) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.editor = editor;
		this.genero = genero;
		this.plataforma = plataforma;
		this.ventas = ventas;
	}

	/**
	 * M�todo getter del atributo nombre
	 *
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo setter del atributo nombre
	 *
	 * @param nombre to set nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo getter del atributo fecha
	 *
	 * @return fecha
	 */
	public Integer getFecha() {
		return fecha;
	}

	/**
	 * M�todo setter del atributo fecha
	 *
	 * @param fecha to set fecha
	 */
	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}

	/**
	 * M�todo getter del atributo editor
	 *
	 * @return editor
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * M�todo setter del atributo editor
	 *
	 * @param editor to set editor
	 */
	public void setEditor(String editor) {
		this.editor = editor;
	}

	/**
	 * M�todo getter del atributo genero
	 *
	 * @return genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * M�todo setter del atributo genero
	 *
	 * @param genero to set genero
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * M�todo getter del atributo plataforma
	 *
	 * @return plataforma
	 */
	public Plataforma getPlataforma() {
		return plataforma;
	}

	/**
	 * M�todo setter del atributo plataforma
	 *
	 * @param plataforma to set plataforma
	 */
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	/**
	 * M�todo getter del atributo ventas
	 *
	 * @return ventas
	 */
	public Double getVentas() {
		return ventas;
	}

	/**
	 * M�todo setter del atributo ventas
	 *
	 * @param ventas to set ventas
	 */
	public void setVentas(Double ventas) {
		this.ventas = ventas;
	}

	/**
	 * Metodo para crear un nuevo Juego pidiendo los valores por teclado
	 */
	public void crearJuego() {

		try {
			this.nombre = Teclado.tecladoString("Introduce el nombre del Juego");
			this.fecha = Teclado.tecladoInt("Fecha de lanzamiento. Introduce el a�o ");
			System.out.println("Seleccione el g�nero");
			Genero.mostrarGenero();
			this.genero = Genero.dimeGenero(Teclado.tecladoInt());
			System.out.println("Seleccione la plataforma");
			Plataforma.mostrarPlataforma();
			this.plataforma = Plataforma.dimePlataforma(Teclado.tecladoInt());
			this.editor = Teclado.tecladoLinea("Introduce el editor del juego");
			this.ventas = Teclado.tecladoDouble("Introduce el numero de ventas (use la coma decimal)");

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	/**
	 * Implementaci�n/Sobrescritura del m�todo toString
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", fecha=" + fecha + ", editor=" + editor + ", genero=" + genero
				+ ", plataforma=" + plataforma + ", ventas=" + ventas + "]";
	}

}
