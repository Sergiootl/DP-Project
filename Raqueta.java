/**
 * Interface de raqueta
 *
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public interface Raqueta {

	/**
	 * Metodo para obtener el modelo de la raqueta
	 * 
	 * @return devuelve el modelo de la raqueta
	 */
	String getModelo();

	/**
	 * Metodo para escribir el modelo de la raqueta
	 * 
	 * @param modelo (Modelo de la raqueta)
	 */
	void setModelo(String modelo);

	/**
	 * Metodo para obtener el peso de a raqueta
	 * 
	 * @return devuelve el peso de la raqueta
	 */
	Double getPeso();

	/**
	 * Metodo para escribir el peso de la raqueta
	 * 
	 * @param peso (Peso de la raqueta)
	 */
	void setPeso(Double peso);

	/**
	 * Metodo para obtener la longitud de la raqueta
	 * 
	 * @return devuelve la longitud de la raqueta
	 */
	Double getLongitud();

	/**
	 * Metodo para escribir la longitud de la raqueta
	 * 
	 * @param longitud (Longitud de la raqueta)
	 */
	void setLongitud(Double longitud);

	/**
	 * Metodo para obtener el tamano de la cabeza de la raqueta
	 * 
	 * @return devuelve el tamano de la cabeza de la raqueta
	 */
	Double getTamanoCabeza();

	/**
	 * Metodo para escribir el tamano de la cabeza de la raqueta
	 * 
	 * @param tamanoCabeza (Tamano de la cabeza de la raqueta)
	 */
	void setTamanoCabeza(Double tamanoCabeza);

	/**
	 * Metodo para obtener el estilo de encordado de la raqueta
	 * 
	 * @return devuelve el estilo de encordado de la raqueta
	 */
	EstiloEncordado getEstiloEncordado();

	/**
	 * Metodo para escribir el estilo de encordado de la raqueta (Metodo SET)
	 * 
	 * @param estiloEncordado (Estilo del Encordado de la raqueta)
	 */
	void setEstiloEncordado(EstiloEncordado estiloEncordado);

	/**
	 * Metodo que nos permite calcular la potencia a traves del campo longitud
	 * usando los valores del mapaPotenica creado en la clase ValoresRaquetas.
	 * 
	 * @return (potencia asociada a la longitud) (Double)
	 */
	Double calcularPotencia();

	/**
	 * Metodo que nos permite calcular el control a traves del campo tamanoCabeza
	 * usando los valores del mapaControl creado en la clase ValoresRaquetas.
	 * 
	 * @return control asociado al tamano de la cabeza de la raqueta (Double)
	 */
	Double calcularControl();

	/**
	 * Metodo que nos permite calcular la velocidad a traves del campo peso usando
	 * los valores del mapaVelocidad creado en la clase ValoresRaquetas.
	 * 
	 * @return (velocidad asociada al peso) (Double)
	 */
	Double calcularVelocidad();

}
