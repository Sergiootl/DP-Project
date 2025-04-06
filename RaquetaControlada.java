/**
 * 
 * Subclase que define un tipo de raqueta como es la controlada.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public class RaquetaControlada extends RaquetaGenerica {

	/**
	 * Metodo constructor por defecto con la llamada a la superclase
	 */
	public RaquetaControlada() {
		super();
	}

	/**
	 * 
	 * Constructor parametrizado de la clase RaquetaControlada
	 * 
	 * @param modelo          (Modelo de la raqueta controlada)
	 * @param peso            (Peso de la raqueta controlada)
	 * @param longitud        (Longitud de la raqueta controlada)
	 * @param tamanoCabeza    (Tamano de la cabeza de la raqueta controlada)
	 * @param estiloEncordado (Estilo de enconrdado de la raqueta controlada)
	 */
	public RaquetaControlada(String modelo, Double peso, Double longitud, Double tamanoCabeza,
			EstiloEncordado estiloEncordado) {
		super(modelo, peso, longitud, tamanoCabeza, estiloEncordado);
	}

	/**
	 * Metodo de sobreescritura (@override) para mostrar los datos especificos de
	 * una raqueta controlada
	 * 
	 * @return texto (devuelve los datos especificos de la raqueta controlada a la
	 *         superclase para imprimir los datos especificos y generales de dicha
	 *         raqueta)
	 */
	@Override
	public String toString() {
		return getClass().getName() + getEstiloEncordado().toString() + super.toString();
	}

	/**
	 * Metodo de sobreescritura (@override) para realizar el calculo del control de
	 * la raqueta, multiplicandolo por el multiplicador asociado al estilo de
	 * encordado de dicha raqueta.
	 * 
	 * @return devuelve el calculo de control de la raqueta controlada a la
	 *         superclase
	 */
	@Override
	public Double calcularControl() {
		return super.calcularControl() * this.getEstiloEncordado().getMultControl();
	}

	/**
	 * Metodo de sobreescritura (@override) para calcular la velocidad de una
	 * raqueta controlada, multiplicado por la constante 1.2 correspondiente a una
	 * raqueta controlada
	 * 
	 * @return devuelve el calculo de velocidad de la raqueta controlada a la
	 *         superclase
	 */
	@Override
	public Double calcularVelocidad() {
		return super.calcularVelocidad() * 1.2;
	}
}
