import java.io.IOException;

/**
 * Clase que hace referencia al Notificador del patron Observer.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public interface Notificador {

	/**
	 * Metodo para suscribir a las noticias
	 * 
	 * @param sucriptor (Suscriptor de las noticias)
	 */
	public void suscribir(Suscriptor sucriptor);

	/**
	 * Metodo para anular la suscripcion
	 * 
	 * @param sucriptor (Suscriptor de las noticias)
	 */
	public void anularSuscripcion(Suscriptor sucriptor);

	/**
	 * Metodo para notificar las noticias actuales del campeonato
	 * 
	 * @param t1    (Tenista 1 que participa)
	 * @param t2    (Tenista 2 que participa)
	 * @param ronda (Ronda del torneo)
	 * @throws IOException (excepcion)
	 */
	public void notificarSuscriptores(Tenista t1, Tenista t2, int ronda) throws IOException;

}
