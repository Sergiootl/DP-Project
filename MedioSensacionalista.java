import java.io.IOException;

/**
 * Clase que hace referencia a un Medio Sensacionalista.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public class MedioSensacionalista implements Suscriptor {

	String nombre;

	/**
	 * Metodo para inicializar la variable nombre en vacio
	 */
	public MedioSensacionalista() {
		nombre = "";
	}

	/**
	 * Metodo para escribir el nombre del medio deportivo
	 * 
	 * @param nombre (Nombre del medio)
	 */
	public MedioSensacionalista(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para mostrar la noticia perteneciente a este medio
	 */
	public void actualizar(Tenista t1, Tenista t2, int ronda) throws IOException {
		if (t1.getRanking() > 3 && t2.getRanking() < 4) {
			Campeonato.getInstance().getFichero().write("@@@@@@ El medio sensacionalista " + nombre
					+ " destaca en Deportes que ha habido sorpresa en el " + Campeonato.getInstance().getNombre()
					+ " en la ronda " + ronda + " porque se ha impuesto " + t1.getNombre() + " a " + t2.getNombre()
					+ " cuando les separan " + (t1.getRanking() - t2.getRanking()) + " puestos en el ranking.\n");

		}
	}
}
