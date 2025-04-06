import java.util.Comparator;

/**
 * Metodo que nos permite comparar la potencia de las raquetas.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
class PotenciaComparator implements Comparator<Raqueta> {

	/**
	 * Metodo que nos permite comprar si la potencia de las dos raquetas son iguales
	 * o no.
	 * 
	 * @param r1 (Primera raqueta)
	 * @param r2 (Segunda raqueta)
	 * 
	 * @return si la potencia de las dos raquetas son iguales
	 * @return -1 si la potencia de la r1 es menor a r2
	 * @return 1 si la potencia de r1 es mayor a r2
	 */
	public int compare(Raqueta r1, Raqueta r2) {
		if (r1.calcularPotencia().equals(r2.calcularPotencia()))
			return r1.getModelo().compareTo(r2.getModelo());
		else if (r1.calcularPotencia().compareTo(r2.calcularPotencia()) > 0)
			return 1;
		else
			return -1;
	}

}
