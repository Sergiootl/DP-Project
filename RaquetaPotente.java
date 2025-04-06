/**
 * 
 * Subclase que define un tipo de raqueta como es la potente.
 * 
 * @author Sergio Lobato Terrazas e Ismael Acedo Acedo
 *
 */
public class RaquetaPotente extends RaquetaGenerica {

	/**
	 * Metodo contructor por defecto con la llamada a la superclase
	 */
	public RaquetaPotente() {
		super();
	}

	/**
	 * Constructor parametrizado de la clase RaquetaPotente
	 * 
	 * @param modelo          (Modelo de la raqueta)
	 * @param peso            (Peso de la raqueta)
	 * @param longitud        (Longitud de la raqueta)
	 * @param tamanoCabeza    (Tamano de la cabeza de la raqueta)
	 * @param estiloEncordado (Estilo de encordado de la raqueta)
	 */
	public RaquetaPotente(String modelo, Double peso, Double longitud, Double tamanoCabeza,
			EstiloEncordado estiloEncordado) {
		super(modelo, peso, longitud, tamanoCabeza, estiloEncordado);
	}

	/**
	 * Metodo de sobreescritura (@override) para mostrar los datos especificos de
	 * una raqueta potente
	 * 
	 * @return devuelve los datos especificos de la raqueta potente a la superclase
	 *         para imprimir los datos especificos y generales de dicha raqueta
	 */
	@Override
	public String toString() {
		return getClass().getName() + getEstiloEncordado().toString() + super.toString();
	}

	/**
	 * Metodo de sobreescritura (@override) para calcular la potencia de la raqueta
	 * potente
	 * 
	 * @return devuelve el caulculo de la potencia de la raqueta por el multiplicado
	 *         por el multiplicador asociado al estilo de encordado
	 */
	@Override
	public Double calcularPotencia() {
		return super.calcularPotencia() * this.getEstiloEncordado().getMultPotencia();
	}

	/**
	 * Metodo de sobreescritura (@override) para calcular la velocidad de la raqueta
	 * potente
	 * 
	 * @return devuelve el calculo de la velocidad de la raqueta potente
	 *         multiplicado por la costante asociada a la raqueta potente (1.5)
	 */
	@Override
	public Double calcularVelocidad() {
		return super.calcularVelocidad() * 1.5;
	}
}
