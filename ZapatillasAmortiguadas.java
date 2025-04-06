/**
 * Subclase que define un tipo de zapatillas como es la amortiguada.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public class ZapatillasAmortiguadas extends Zapatillas {

	/**
	 * 
	 * Constructor parametrizado de la clase ZapatillasAmortiguadas
	 * 
	 * @param modeloA (Modelo de la zapatilla)
	 * @param numeroA (Numero de pie de la zapatilla)
	 * @param valorA  (Valor asocSiado al modelo de zapatilla)
	 */
	public ZapatillasAmortiguadas(String modeloA, Double numeroA, Double valorA) {
		super(modeloA, numeroA, valorA);
	}

	/**
	 * Metodo de sobreescritura (@override) para realizar el calculo del valor de
	 * saque.
	 * 
	 * @return devuelve el calculo de valor de saque multiplicado por la constante
	 *         asociada a las zapatillas amortiguadas(1.8)
	 */
	@Override
	public Double calcularValorSaque() {
		return super.calcularValorSaque() * 1.8;
	}

}
