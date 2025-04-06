import java.util.HashMap;

/**
 * Metodo para la inicialiazcion del HashMap
 *
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public class ValoresRaquetas {

	private static HashMap<Double, Double> mapaPotencia;
	private static HashMap<Double, Double> mapaControl;
	private static HashMap<Double, Double> mapaVelocidad;

	/**
	 * Inicializacion de los mapas
	 */
	public static void iniciarMapas() {

		mapaPotencia = new HashMap<Double, Double>();
		mapaControl = new HashMap<Double, Double>();
		mapaVelocidad = new HashMap<Double, Double>();
		iniciarPotencia();
		iniciarControl();
		iniciarVelocidad();
	}

	/**
	 * Metodo para escribir los valores de la tabla asociada para el calculo de la
	 * potencia de la raqueta.(Key,Value)
	 */
	public static void iniciarPotencia() {
		mapaPotencia.put(680.0, 2.0);
		mapaPotencia.put(690.0, 4.0);
		mapaPotencia.put(700.0, 6.0);
		mapaPotencia.put(720.0, 8.0);
		mapaPotencia.put(740.0, 10.0);

	}

	/**
	 * Metodo para escribir los valores de la tabla asociada para el calculo del
	 * control de la raqueta.(Key,Value)
	 */
	public static void iniciarControl() {
		mapaControl.put(600.0, 10.0);
		mapaControl.put(630.0, 8.0);
		mapaControl.put(650.0, 6.0);
		mapaControl.put(680.0, 4.0);
		mapaControl.put(720.0, 2.0);
	}

	/**
	 * Metodo para escribir los valores de la tabla asociada para el calculo de la
	 * velocidad de la raqueta.(Key,Value)
	 */
	public static void iniciarVelocidad() {
		mapaVelocidad.put(220.0, 10.0);
		mapaVelocidad.put(260.0, 8.0);
		mapaVelocidad.put(300.0, 6.0);
		mapaVelocidad.put(320.0, 4.0);
		mapaVelocidad.put(340.0, 2.0);
	}

	/**
	 * Metodo que nos devuelve la potencia de una raqueta potente segun los valores
	 * asociados del mapa. (GET)
	 * 
	 * @param p (Raqueta potente)
	 * 
	 * @return Devuelve los valores asociados para el calculo de la potencia, leemos
	 *         el key asociado a la raqueta para poder devolver el value correcto
	 */
	public static Double calcularPotencia(Double p) {
		return mapaPotencia.get(p);
	}

	/**
	 * Metodo que nos devuelve el control de una raqueta controlada segun los
	 * valores asociados del mapa. (GET)
	 * 
	 * @param c (Raqueta controlada)
	 * 
	 * @return Devuelve los valores asociados para el calculo del control, leemos el
	 *         key asociado a la raqueta para poder devolver el value correcto
	 */
	public static Double calcularControl(Double c) {

		return mapaControl.get(c);
	}

	/**
	 * Metodo que nos devuelve la velocidad de una raqueta equilibrada segun los
	 * valores asociados del mapa. (GET)
	 * 
	 * @param v (Raqueta equilibrada)
	 * 
	 * @return Devuelve los valores asociados para el calculo de la velocidad,
	 *         leemos el key asociado a la raqueta para poder devolver el value
	 *         correcto
	 */
	public static Double calcularVelocidad(Double v) {

		return mapaVelocidad.get(v);
	}

}
