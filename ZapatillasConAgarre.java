/**
 * Subclase que define un tipo de zapatillas como es la ConAgarre.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public class ZapatillasConAgarre extends Zapatillas {

	/**
	 * 
	 * Constructor parametrizado de la clase ZapatillasConAgarre
	 * 
	 * @param modeloCA (Modelo de la zapatilla)
	 * @param numeroCA (Numero de pie de la zapatilla)
	 * @param valorCA  (Valor asociado al modelo de zapatilla )
	 */
	public ZapatillasConAgarre(String modeloCA, Double numeroCA, Double valorCA) {
		super(modeloCA, numeroCA, valorCA);
	}

	/**
	 * Metodo de sobreescritura (@override) para realizar el calculo del valor de
	 * resto.
	 * 
	 * @return devuelve el calculo de resto multiplicado por la constante asociada a
	 *         las zapatillas con agarre (1.7)
	 */
	@Override
	public Double calcularValorResto() {
		return super.calcularValorResto() * 1.7;
	}
}
