import java.io.IOException;

/**
 * Clase que hace referencia a un Medio Generalista.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public class MedioGeneralista implements Suscriptor {

	String nombre;

	/**
	 * Metodo para inicializar la variable nombre en vacio
	 */
	public MedioGeneralista() {
		nombre = "";
	}

	/**
	 * Metodo para escribir el nombre del medio deportivo generalista
	 * 
	 * @param nombre (Nombre del medio)
	 */
	public MedioGeneralista(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para mostrar la noticia perteneciente a este medio
	 */
	public void actualizar(Tenista t1, Tenista t2, int ronda) throws IOException {
		if (t1.getRanking() < 3 || t2.getRanking() < 3) {
			Campeonato.getInstance().getFichero()
					.write("@@@@@@ El medio generalista " + nombre + " destaca en Deportes que en el "
							+ Campeonato.getInstance().getNombre() + " en la ronda " + ronda + " se ha impuesto "
							+ t1.getNombre() + " a " + t2.getNombre() + " por una diferencia de "
							+ (t1.getPuntosAcumulados() - t2.getPuntosAcumulados()) + " puntos." + "\n");

		}
	}
}
