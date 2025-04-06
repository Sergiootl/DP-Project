import java.util.Comparator;

/**
 * Metodo que nos permite comparar la posicion en la que han sido eliminado dos
 * tenistas.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 * @param t1 (Primer tenista)
 * @param t2 (Segundo tenista)
 * 
 * @return retorna que la posicion de los tenistas es la misma
 * @return retorna que la posicion de eliminado de t1 es mayor a la de t2
 * @return retorna que la posicion de eliminados de t1 es menor a la de t2
 */
class EliminadoComparator implements Comparator<Tenista> {
	public int compare(Tenista t1, Tenista t2) {
		if (t1.getPosEliminado().equals(t2.getPosEliminado()))
			return t1.getNombre().compareTo(t2.getNombre());
		else if (t1.getPosEliminado().compareTo(t2.getPosEliminado()) > 0)
			return 1;
		else
			return -1;
	}

}
