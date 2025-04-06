/**
 * Clase en la que se definen los tenistas Golpeadores. Es una subclase de
 * tenista.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 */
public class Golpeadores extends Tenista {

	/**
	 * Metodo para obtener los datos de un tenista golepador
	 * 
	 * @param nombre    (Nombre del tenista)
	 * @param zapa      (zapatillas del tenista)
	 * @param saque     (Saque del tenista)
	 * @param resto     (Resto del tenista)
	 * @param ranking   (Ranquing del tenista)
	 * @param pais      (Pais de origen del tenista)
	 * @param numeroPie (Numero de pie del tenista)
	 */
	public Golpeadores(String nombre, Zapatillas zapa, Double saque, Double resto, Integer ranking, String pais,
			Double numeroPie) {
		super(nombre, zapa, saque, resto, ranking, pais, numeroPie);
	}

	/**
	 * Metodo para calcular los puntos de un tenista golpeador
	 */
	@Override
	protected void golpear() {
		setPuntosAcumulados(getPuntosAcumulados() + (((getRaqueta().calcularVelocidad()) * 10) / 100));
	}

}
