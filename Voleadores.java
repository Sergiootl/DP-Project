import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Clase en la que se definen los tenistas Voleadores. Es una subclase de
 * tenista.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 */
public class Voleadores extends Tenista {

	/**
	 * Metodo para obtener los datos de un tenista voleador
	 * 
	 * @param nombre    (Nombre del tenista)
	 * @param zapa      (zapatillas del tenista)
	 * @param saque     (Saque del tenista)
	 * @param resto     (Resto del tenista)
	 * @param ranking   (Ranquing del tenista)
	 * @param pais      (Pais de origen del tenista)
	 * @param numeroPie (Numero de pie del tenista)
	 */
	public Voleadores(String nombre, Zapatillas zapa, Double saque, Double resto, Integer ranking, String pais,
			Double numeroPie) {
		super(nombre, zapa, saque, resto, ranking, pais, numeroPie);
	}

	/**
	 * Metodo para calcular los puntos de un tenista voleador
	 */
	@Override
	protected void golpear() {
		setPuntosAcumulados(getPuntosAcumulados() + (((getRaqueta().calcularPotencia()) * 15) / 100));
	}

	/**
	 * Metodo para cambiar la raqueta de un tenista voleador por la primera raqueta
	 * que encuentre.Esta tiene que estaar disponible y tener una velocidad superior
	 * a la que tiene en uso. Si esta se encuentra, la raqueta que estaba usando el
	 * tenista, s desecha
	 * 
	 * Si no hay ninguna raqueta disponible con los requisitos descritos, el tenista
	 * sigue jugando con la misma raqueta.
	 */
	@Override
	protected void cambiarRaqueta() throws IOException {

		boolean encontrado = false;
		Campeonato C = Campeonato.getInstance();
		TreeSet<Raqueta> TreeRa = new TreeSet<Raqueta>();
		TreeRa = ((TreeSet<Raqueta>) C.getRaquetasCampeonato());
		Iterator<Raqueta> it = TreeRa.iterator();

		while (it.hasNext() && !encontrado) {
			Raqueta r = it.next();
			if (r.calcularVelocidad() > this.getRaqueta().calcularVelocidad()) {
				this.setRaqueta(r);
				TreeRa.remove(r);
				encontrado = true;
			}
		}
		if (encontrado) {
			C.getFichero()
					.write("       " + this.getNombre() + " cambia su raqueta por: "
							+ this.getRaqueta().getClass().getName() + " modelo=" + this.getRaqueta().getModelo()
							+ " velocidad=" + this.getRaqueta().calcularVelocidad() + "\n");
		} else {
			C.getFichero().write("       " + this.getNombre() + " no cambia de raqueta " + "\n");
		}
	}

}
