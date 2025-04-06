/**
 * Clase en la que se definen las Zapatillas que usara el Tenista.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public abstract class Zapatillas implements Zapatilla {

	String modelo; // Marca y modelo
	Double numero; // Numero de pie
	Double valor; // Valor del tipo

	/**
	 * Constructor por defecto de la clase Zapatillas.
	 */
	public Zapatillas() {
		modelo = "";
		numero = 0.0;
		valor = 0.0;
	}

	/**
	 * Constructor parametrizado de la clase Zapatillas.
	 * 
	 * @param modelo (Modelo de la zapatilla)
	 * @param numero (Numero de pie de la zapatilla)
	 * @param valor  (Valor asociado al tipo de zapatilla)
	 */
	public Zapatillas(String modelo, Double numero, Double valor) {
		this.modelo = modelo;
		this.numero = numero;
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * Metodo compareTo de Zapatillas
	 * 
	 * @param o (Zapatillas a comparar )
	 * 
	 * @return devuelve 1 si es mayor, -1 si es menor y 0 si es igual.
	 */
	public int compareTo(Zapatillas o) {
		int var = 0;
		if (this.compareTo(o) > 0)
			var = 1;
		if (this.compareTo(o) < 0)
			var = -1;
		if (this.equals(o))
			var = 0;
		return var;
	}

	/**
	 * Metodo de sobreescritura (@override) que nos permite la salida por pantalla
	 * en un formato determinado de la clase Zapatillas. En esta salida por pantalla
	 * se muestran los campos Modelo, Numero, Tipo y Valor de las Zapatillas.
	 * 
	 * @return devuelve los datos generales de asociados a las zapatillas para
	 *         mostrarlos por pantalla
	 */
	@Override
	public String toString() {
		return "    " + getClass().getName() + " [modelo=" + this.getModelo() + ", numero=" + this.getNumero()
				+ ", valor=" + this.getValor() + "]";
	}

	public Double calcularValorSaque() {
		return getValor() * 1.2;
	}

	public Double calcularValorResto() {
		return getValor() * 1.3;
	}

}
