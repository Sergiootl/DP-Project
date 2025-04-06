import java.io.IOException;

/**
 * Clase que hace referencia a un Medio Deportivo.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public class MedioDeportivo implements Suscriptor {

	String nombre;

	/**
	 * Metodo para inicializar la variable nombre en vacio
	 * 
	 */
	public MedioDeportivo() {
		nombre = "";
	}

	/**
	 * Metodo para escribir el nombre del medio deportivo
	 * 
	 * @param nombre (Nombre del medio)
	 */
	public MedioDeportivo(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para dar las noticias mas actuales sobre el ranking
	 */
	public void actualizar(Tenista t1, Tenista t2, int ronda) throws IOException {
		Campeonato.getInstance().getFichero()
				.write("@@@@@@ El medio deportivo " + nombre + " destaca que en el campeonato "
						+ Campeonato.getInstance().getNombre() + " en la ronda " + ronda + " se ha impuesto "
						+ t1.getNombre() + " que ocupa la posicion " + t1.getRanking() + " en el ranking a "
						+ t2.getNombre() + " que ocupa la posicion " + t2.getRanking() + " con un marcador de "
						+ t1.getPuntosAcumulados() + "-" + t2.getPuntosAcumulados() + ".\n");

	}
}
