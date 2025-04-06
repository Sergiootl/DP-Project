import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Metodo que nos permite realizar las acciones sobre el notificador
 *
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public abstract class NotificadorAbstracto implements Notificador {

	List<Suscriptor> suscriptores = new ArrayList<>();

	/**
	 * Metodo para anadir un suscriptor
	 * 
	 * @param suscriptor (Suscriptor de las noticias)
	 */
	public void suscribir(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}

	/**
	 * Metodo para borrar un suscriptor
	 * 
	 * @param suscriptor (Suscriptor de las noticias)
	 */
	public void anularSuscripcion(Suscriptor suscriptor) {
		suscriptores.remove(suscriptor);
	}

	/**
	 * Metodo para notificar una noticia a un suscriptor
	 * 
	 * @param t1    (Tenista 1 que participa)
	 * @param t2    (Tenista 2 que participa)
	 * @param ronda (Ronda del torneo)
	 * @throws IOException (excepcion)
	 **/
	public void notificarSuscriptores(Tenista t1, Tenista t2, int ronda) throws IOException {
		for (Suscriptor suscriptor : suscriptores) {
			suscriptor.actualizar(t1, t2, ronda);
		}
	}
}
