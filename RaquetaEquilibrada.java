/**
 * 
 * Subclase que define un tipo de raqueta como es la equilibrada.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public class RaquetaEquilibrada extends RaquetaGenerica {
	Double multPotencia;
	Double multControl;

	/**
	 * 
	 * Metodo constructor por defecto con la llamada a la superclase
	 * 
	 * @param multPotencia (Potencia de la raqueta equilibrada)
	 * @param multControl  (Control de la raqueta equilibrada)
	 */
	public RaquetaEquilibrada(Double multPotencia, Double multControl) {
		super();
		this.multPotencia = multPotencia;
		this.multControl = multControl;
	}

	/**
	 * 
	 * Constructor parametrizado de la clase RaquetaEquilibrada
	 * 
	 * @param modelo          (Modelo de la raqueta equilibrada)
	 * @param peso            (Peso de la raqueta equilibrada)
	 * @param longitud        (Longitud de la raqueta equilibrada)
	 * @param tamanoCabeza    (Tamano de la cabeza de la raqueta equilibrada)
	 * @param estiloEncordado (Estilo de enconrdado de la raqueta equilibrada)
	 * @param multPotencia    (Multiplicador de potencia de la raqueta equilibrada)
	 * @param multControl     (Multiplicador de control de la raqueta equilibrada)
	 */
	public RaquetaEquilibrada(String modelo, Double peso, Double longitud, Double tamanoCabeza,
			EstiloEncordado estiloEncordado, Double multPotencia, Double multControl) {
		super(modelo, peso, longitud, tamanoCabeza, estiloEncordado);
		this.multPotencia = multPotencia;
		this.multControl = multControl;
	}

	/**
	 * Metodo para obtener el multiplicador de potencia de la la raqueta equilibrada
	 * (Metodo GET)
	 * 
	 * @return devuelve el multiplicador de potencia asociado a la raqueta
	 *         equilibrada
	 */
	public Double getMultPotencia() {
		return multPotencia;
	}

	/**
	 * Metodo para escribir el multiplicador de potencia de la raqueta equilibrada
	 * (Metodo SET)
	 * 
	 * @param multPotencia (Multiplicador de potencia de la raqueta equilibrada)
	 */
	public void setMultPotencia(Double multPotencia) {
		this.multPotencia = multPotencia;
	}

	/**
	 * Metodo para obtener el multiplicador de control de la raqueta equilibrada
	 * 
	 * @return devuelve el multiplicador de control asoicado a la raqueta
	 *         equilibrada
	 */
	public Double getMultControl() {
		return multControl;
	}

	/**
	 * Metodo para escribir el multiplicador de control de la raqueta equilibrada
	 * 
	 * @param multControl (Multuplicador de control de la raqueta equilibrada)
	 */
	public void setMultControl(Double multControl) {
		this.multControl = multControl;
	}

	/**
	 * Metodo de sobreescritura (@override) para mostrar los datos especificos de
	 * una raqueta equilibrada
	 * 
	 * @return devuelve los datos especificos de asociados a la raqueta equilibarada
	 *         para mostrarlos por pantalla
	 */
	@Override
	public String toString() {
		return getClass().getName() + "(MultiplicadorDePotencia:" + this.getMultPotencia() + ")(MultiplicadorDeControl:"
				+ this.getMultControl() + ")\n" + super.toString();
	}

	/**
	 * Metodo de sobreescritura (@override) para realizar el calculo de la potencia
	 * de la raqueta.
	 * 
	 * @return devuelve el calculo de la potencia de la raqueta equilibrada
	 */
	@Override
	public Double calcularPotencia() {
		return super.calcularPotencia() * getMultPotencia();
	}

	/**
	 * Metodo de sobreescritura (@override) para realizar el calculo del control de
	 * la raqueta.
	 * 
	 * @return devuelve el calculo de control de la raqueta equilibrada
	 */
	@Override
	public Double calcularControl() {
		return super.calcularControl() * getMultControl();
	}

}
