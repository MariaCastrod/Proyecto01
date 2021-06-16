package service;

import dao.CatalogoJuegos;
import dao.CatalogoJuegosImpl;
import exception.JuegoException;
import model.Juego;

/**
 * @ClassName ServiciosJuego
 * Implementaci�n de la Interface ServiciosJuego
 *
 * @author Mar�a Castro, Patricia Garc�a, Usoa Larrarte,
 * Jennifer P�rez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class ServiciosJuegoImpl implements ServiciosJuego {
	
	private CatalogoJuegos catalogo = new CatalogoJuegosImpl();
	

	/**
	 * M�todo getter del atributo catalogo
	 *
	 * @return catalogo
	 */
	public CatalogoJuegos getCatalogo() {
		return catalogo;
	}

	/**
	 * M�todo setter del atributo catalogo
	 *
	 * @param catalogo to set catalogo 
	 */
	public void setCatalogo(CatalogoJuegos catalogo) {
		this.catalogo = catalogo;
	}

	/**
	 * Implementaci�n del m�todo altaJuego
	 *
	 * @return 
	 * @throws JuegoException
	 */
	
	
	public boolean altaJuego() throws JuegoException {
		Juego juego = new Juego();
		juego.crearJuego();
		return this.altaJuego(juego);
	}
	
	/**
	 * Sobrescritura del m�todo altaJuego
	 *
	 * @param juego
	 * @return 
	 * @throws JuegoException
	 */
	public boolean altaJuego(Juego juego) throws JuegoException {
		return catalogo.altaJuego(catalogo.siguienteId(), juego);
	}
	
	/**
	 * Implementaci�n del m�todo listarJuegos
	 *
	 */
	public void listarJuegos() {
		catalogo.listarJuegos();
	}

}
