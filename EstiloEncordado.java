/**
 * Clase enumerator que nos permite almacenar los tipos de encordados de las
 * raquetas con sus respectivos multiplicadores.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public enum EstiloEncordado {

	ABIERTO("Abierto", 2.0, 2.2), CERRADO("Cerrado", 1.8, 2.5);

	private String nombre;
	private Double multPotencia;
	private Double multControl;

	/**
	 * Constructor parametrizado de la clase EstiloEncordado.
	 * 
	 * @param Nombre       (Estilo de encordado de la raqueta)
	 * @param multPotencia (Multiplicador de potencia asociado al encordado)
	 * @param multControl  (Multiplicador de control asociado al encordado)
	 */
	private EstiloEncordado(String nombre, Double multPotencia, Double multControl) {
		this.nombre = nombre;
		this.multPotencia = multPotencia;
		this.multControl = multControl;
	}

	/**
	 * Metodo para obtener el nombre (Metodo GET)
	 * 
	 * @return devuelve el estilo de encordado de la raqueta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para escribir un nombre (Metodo SET)
	 * 
	 * @param nombre (Nombre de la raqueta)
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el multiplicador de potencia (Metodo GET)
	 * 
	 * @return devuelce el multiplicador de potencia asociado al estilo de encordado
	 */
	public Double getMultPotencia() {
		return multPotencia;
	}

	/**
	 * Metodo para escribir el multiplicador de potencia (Metodo SET)
	 * 
	 * @param multPotencia(Multiplicador de potencia)
	 */
	public void setMultPotencia(Double multPotencia) {
		this.multPotencia = multPotencia;
	}

	/**
	 * Metodo para obtener el multiplicador de control (Metodo GET)
	 * 
	 * @return devuelve el multiplucador de control asociado al estilo de encordado
	 */
	public Double getMultControl() {
		return multControl;
	}

	/**
	 * Metood para escribir el multiplicador de control(Metodo SET)
	 * 
	 * @param multControl(Multiplicador de control)
	 */
	public void setMultControl(Double multControl) {
		this.multControl = multControl;
	}

	/**
	 * Metodo toString que nos sirve para mostrar las caracteristicas del encordado.
	 */
	public String toString() {
		return "(Encordado:" + getNombre() + ")(MultiplicadorDePotencia:" + getMultPotencia()
				+ ")(MultiplicadorDeControl:" + getMultControl() + ")\n";
	}

}
