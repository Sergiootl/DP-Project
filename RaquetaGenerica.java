/**
 * 
 * Metodo que nos permite declarar la superclase de las raquetas
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 */
public abstract class RaquetaGenerica implements Raqueta {

	String modelo; // Modelo de la raqueta
	Double peso; // Peso de la raqueta en gr.
	Double longitud; // Tamano de la raqueta en cm.
	Double tamanoCabeza; // Tamano de la cabeza de la raqueta en cm2.
	private EstiloEncordado estiloEncordado; // Estilo de encortado

	/**
	 * Constructor por defecto de la clase RaquetaGenerica
	 */
	public RaquetaGenerica() {
		modelo = "";
		peso = 0.0;
		longitud = 0.0;
		tamanoCabeza = 0.0;
	}

	/**
	 * 
	 * Constructor parametrizado de la clase RaquetaGenerica
	 * 
	 * @param modelo          (Modelo de la raqueta)
	 * @param peso            (Peso de la raqueta)
	 * @param longitud        (Longuitud de la raqueta)
	 * @param tamanoCabeza    (Tamano de la cabeza de la raqueta)
	 * @param estiloEncordado (Estilo de encordado de la raqueta)
	 */
	public RaquetaGenerica(String modelo, Double peso, Double longitud, Double tamanoCabeza,
			EstiloEncordado estiloEncordado) {
		this.modelo = modelo;
		this.peso = peso;
		this.longitud = longitud;
		this.tamanoCabeza = tamanoCabeza;
		this.estiloEncordado = estiloEncordado;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getTamanoCabeza() {
		return tamanoCabeza;
	}

	public void setTamanoCabeza(Double tamanoCabeza) {
		this.tamanoCabeza = tamanoCabeza;
	}

	public EstiloEncordado getEstiloEncordado() {
		return estiloEncordado;
	}

	public void setEstiloEncordado(EstiloEncordado estiloEncordado) {
		this.estiloEncordado = estiloEncordado;
	}

	/**
	 * Metodo de sobreescritura(@override) toString
	 * 
	 * @return devuelve la salida de una raqueta con todos sus atributos(toString))
	 */
	@Override
	public String toString() {
		return "        [modelo=" + modelo + "\n" + "        longitud: " + longitud + ",potencia asociada: "
				+ calcularPotencia() + "\n" + "        tamano: " + tamanoCabeza + ",control asociado: "
				+ calcularControl() + "\n" + "        peso: " + peso + ",velocidad asociada: " + calcularVelocidad()
				+ "]";
	}

	public Double calcularPotencia() {

		return ValoresRaquetas.calcularPotencia(getLongitud());
	}

	public Double calcularControl() {

		return ValoresRaquetas.calcularControl(getTamanoCabeza());
	}

	public Double calcularVelocidad() {

		return ValoresRaquetas.calcularVelocidad(getPeso());

	}
}
