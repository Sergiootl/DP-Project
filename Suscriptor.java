import java.io.IOException;

/**
 * Interface de un Suscriptor
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public interface Suscriptor {

	/**
	 * Metodo para actualizar las noticias sobre el campeonato
	 * 
	 * @param t1    (Tenista 1 que participa)
	 * @param t2    (Tenista 2 que participa)
	 * @param ronda (Ronda del torneo)
	 * @throws IOException (excepcion)
	 */
	public void actualizar(Tenista t1, Tenista t2, int ronda) throws IOException;

}
