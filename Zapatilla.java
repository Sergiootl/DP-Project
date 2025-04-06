/**
 * 
 * Interface de zapatilla
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public interface Zapatilla {

	/**
	 * Metodo que nos devuelve el modelo y la marca de las Zapatillas.(Metodo GET)
	 * 
	 * @return Devuelve el modelo de la zapatilla
	 */
	String getModelo();

	/**
	 * Metodo que nos modifica el valor del atributo modelo por el indicado por
	 * paremetro.
	 * 
	 * @param modelo (modelo de la zapatilla(Lo modifica))
	 */
	void setModelo(String modelo);

	/**
	 * Metodo que nos devuelve el numero de las Zapatillas.(Metodo GET)
	 * 
	 * @return Devuelve el numero de pie de la zapatilla
	 */
	Double getNumero();

	/**
	 * Metodo que nos modifica el valor del atributo numero por el indicado por
	 * parametro.
	 * 
	 * @param numero (Numero de pie de la zapatilla)
	 */
	void setNumero(Double numero);

	/**
	 * Metodo que nos devuelve el valor de las Zapatillas.
	 * 
	 * @return Devuelve el valor asociado al tipo de zapatilla
	 */
	Double getValor();

	/**
	 * Metodo que nos modifica el valor del atributo valor por el indicado por
	 * parametro.
	 * 
	 * @param valor (Valor de la zapatilla)
	 */
	void setValor(Double valor);

	/**
	 * Metodo que nos calcula el valor decimal del saque segun el tipo de las
	 * Zapatillas.
	 * 
	 * @return Devuelve el resultado de la multiplicacion del valor de saque por la
	 *         constante asociado al saque (1.2)
	 */
	Double calcularValorSaque();

	/**
	 * Metodo que nos calcula el valor decimal del resto segun el tipo de las
	 * Zapatillas.
	 * 
	 * @return Devuelve el resultado de la multiplicacion del valor de resto por la
	 *         constante asociado al resto (1.3)
	 */
	Double calcularValorResto();
}
