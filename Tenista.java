import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Clase en la que se define el Tenista que participara en el Campeonato.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public abstract class Tenista {

	private String nombre;
	private Zapatillas zapa;
	private Double saque;
	private Double resto;
	private Integer ranking;
	private String pais;
	private Double puntosAcumulados;
	private Integer posEliminado;
	private Double numeroPie;
	private Raqueta raqueta;

	/**
	 * Contrustor por defecto de la clase Tenista.
	 */
	public Tenista() {
		nombre = "";
		saque = 0.0;
		resto = 0.0;
		ranking = 0;
		pais = "";
		puntosAcumulados = 0.0;
		posEliminado = 0;
		numeroPie = 0.0;
	}

	/**
	 * Constructor parametrizado de la clase Tenista.
	 * 
	 * @param nombre    (Nombre del tenista)
	 * @param zapa      (zapatillas del tenista)
	 * @param saque     (Saque del tenista)
	 * @param resto     (Resto del tenista)
	 * @param ranking   (Ranquing del tenista)
	 * @param pais      (Pais de origen del tenista)
	 * @param numeroPie (Numero de pie del tenista)
	 */
	public Tenista(String nombre, Zapatillas zapa, Double saque, Double resto, Integer ranking, String pais,
			Double numeroPie) {
		this.nombre = nombre;
		this.zapa = zapa;
		this.saque = saque;
		this.resto = resto;
		this.ranking = ranking;
		this.pais = pais;
		this.puntosAcumulados = 0.0;
		this.numeroPie = numeroPie;
	}

	/**
	 * Metodo que nos devuelve el nombre del Tenista.
	 * 
	 * @return devuelve el nombre del tenista
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que nos modifica el valor del atributo nombre por el indicado por
	 * parametro.
	 * 
	 * @param nombre (nombre del tenista (Lo modifica))
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que nos devuelve las zapatillas del Tenista. (Metodo SET)
	 * 
	 * @return devuelve las zapatillas asociadas al tenista
	 */
	public Zapatillas getZapa() {
		return zapa;
	}

	/**
	 * Metodo que nos modifica el valor del atributo zapa por el indicado por
	 * parametro.
	 * 
	 * @param zapa (zapatillas del tenista)
	 */
	public void setZapa(Zapatillas zapa) {
		this.zapa = zapa;
	}

	/**
	 * Metodo que nos devuelve el valor del saque del Tenista.
	 * 
	 * @return devuelve el valor del saque del tenista
	 */
	public Double getSaque() {
		return saque;
	}

	/**
	 * Metodo que nos modifica el valor del atributo saque por el indicado por
	 * parametro.
	 * 
	 * @param saque valor de saque del tenista
	 */
	public void setSaque(Double saque) {
		this.saque = saque;
	}

	/**
	 * Metodo que nos devuelve el valor del resto del Tenista.
	 * 
	 * @return devuelve el valor del resto del tenista
	 */
	public Double getResto() {
		return resto;
	}

	/**
	 * Metodo que nos modifica el valor del atributo resto por el indicado por
	 * parametro.
	 * 
	 * @param resto (valor del resto del tenista.)
	 */
	public void setResto(Double resto) {
		this.resto = resto;
	}

	/**
	 * Metodo que nos devuelve el puesto en el ranking del Tenista.(Metodo GET)
	 * 
	 * @return devuelve la posicion en el ranking del tenista
	 */
	public Integer getRanking() {
		return ranking;
	}

	/**
	 * Metodo que nos modifica el valor del atributo ranking por el indicado por
	 * parametro.
	 * 
	 * @param ranking (posicion en el ranking del tenista)
	 */
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	/**
	 * Metodo que nos devuelve el pais del Tenista.
	 * 
	 * @return devuelve el pais de origen del tenista
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Metodo que nos modifica el valor del atributo pais por el indicado por
	 * parametro.
	 * 
	 * @param pais de origen del tenista
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Metodo que nos devuelve los puntos acumulados del Tenista.
	 * 
	 * @return devuelve los puntos acumulados por el tenista
	 */
	public Double getPuntosAcumulados() {
		return puntosAcumulados;
	}

	/**
	 * Metodo que nos modifica el valor del atributo puntos acumulados por el
	 * indicado por parametro.
	 * 
	 * @param puntosAcumulados (puntos acumulados por el tenista)
	 */
	public void setPuntosAcumulados(Double puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	/**
	 * Metodo que nos devuelve la posicion en la que ha sido elminado el Tenista.
	 * 
	 * @return devuelve la posicion del tenista eliminado
	 */
	public Integer getPosEliminado() {
		return posEliminado;
	}

	/**
	 * Metodo que nos modifica el valor del atributo posicion eliminado por el
	 * indicado por parametro.
	 * 
	 * @param posEliminado (Posicion del tenista eliminado)
	 */
	public void setPosEliminado(Integer posEliminado) {
		this.posEliminado = posEliminado;
	}

	/**
	 * Metodo que nos devuelve el numero de pie del Tenista.(Metodo GET)
	 * 
	 * @return devuelve el numero de pie del Tenista
	 */
	public Double getNumeroPie() {
		return numeroPie;
	}

	/**
	 * Metodo que nos modifica el valor del numero de pie por el indicado por
	 * parametro.
	 * 
	 * @param numeroPie (Numero de pie del Tenista)
	 */
	public void setNumeroPie(Double numeroPie) {
		this.numeroPie = numeroPie;
	}

	/**
	 * Metodo que nos devuelve la raqueta del Tenista.
	 * 
	 * @return Devuelve la raqueta que usa el tenista
	 */
	public Raqueta getRaqueta() {
		return raqueta;
	}

	/**
	 * Metodo que nos modifica la raqueta que usa el tenista por la indicada por
	 * parametro.
	 * 
	 * @param raqueta (Raqueta del tenista)
	 */
	public void setRaqueta(Raqueta raqueta) {
		this.raqueta = raqueta;
	}

	/**
	 * Metodo de sobreescritura (@override) que nos permite la salida por pantalla
	 * en un formato determinado de la clase Tenista. En esta salida por pantalla se
	 * muestran los campos Nombre, Saque, Resto, Ranking y Pais del Tenista.
	 * 
	 * @return devuelve los datos generales de asociados a los tenistas para
	 *         mostrarlos por pantalla
	 */
	@Override
	public String toString() {
		return "   ** Tenista (" + getClass().getName() + ") [nombre=" + this.getNombre() + ", saque=" + this.getSaque()
				+ ", resto=" + this.getResto() + ", ranking=" + this.getRanking() + ", pais=" + this.getPais()
				+ ", numero pie=" + this.getNumeroPie() + "] ";

	}

	/**
	 * Metodo que le permite a un tenista realizar una inscripcion a un campeonato.
	 * 
	 * @throws IOException (excepcion)
	 */
	public void realizarInscripcion() throws IOException {
		Campeonato.getInstance().inscribirTenista(this);

	}

	/**
	 * Metodo que nos devueve el resultado de la suma del saque y del resto de un
	 * tenista.
	 * 
	 * @return sumVel (Devuelve el resultado de realizar la suma de los puntos
	 *         asociados al tenista por su saque y su resto)
	 */
	public Double SumaVelocidades() {
		double sumVel = 0.0;
		sumVel = getSaque() + getResto();
		return sumVel;
	}

	/**
	 * Metodo que nos devuelve el resultado del valor del saque total. El valor del
	 * saque del tenista mas el resultado del calculado por las zapatillas.
	 * 
	 * @return Devuelve el resultado de realizar la multiplicacion de los puntos de
	 *         saque, por el valor asociado a las zapatillas para sacar,
	 *         multiplicado por el valor asociado a la potencia de la raqueta y
	 *         multiplicado por el valor asociado de la velocidad de la raqueta de
	 *         un tenista
	 */
	public Double calcularSaque() {

		double saque = 0.0;
		saque = getSaque() * zapa.calcularValorSaque() * raqueta.calcularPotencia() * raqueta.calcularVelocidad();
		return saque;

	}

	/**
	 * Metodo que nos devuelve el resultado del valor del resto total. El valor del
	 * resto del tenista mas el resultado del calculado por las zapatillas.
	 * 
	 * @return Devuelve el resultado de multiplicar el valor del resto por el valor
	 *         asociado a las zapatillas para restar, multiplicado por el valor
	 *         asociado al control de la raqueta, multiplicado por el valor asociado
	 *         a la velocidad de la raqueta de un tenista
	 */
	public Double calcularResto() {

		double resto = 0.0;
		resto = getResto() * zapa.calcularValorResto() * raqueta.calcularControl() * raqueta.calcularVelocidad();
		return resto;
	}

	/**
	 * Metodo que realiza la accion de sacar de un tenista y modifica sus puntos
	 * acumulados por los obtenidos despues de sacar.
	 */
	private void sacar() {
		setPuntosAcumulados(this.getPuntosAcumulados() + calcularSaque());
	}

	/**
	 * Metodo que realiza la accion de restar de un tenista y modifica sus puntos
	 * acumulados despues de restar, si el tenista que resta obtiene mas puntos que
	 * el tenista que saca
	 */
	private void restar(Tenista t1) {

		Double saque1 = t1.calcularSaque();
		Double resto2 = this.calcularResto();

		if (resto2 > saque1) {
			this.setPuntosAcumulados(this.puntosAcumulados + calcularResto());
		}

	}

	/**
	 * Solo se implementa en las subclases
	 */
	protected abstract void golpear();

	/**
	 * Obtener primera raqueta que almacena el campeonato Cambiar esa raqueta por la
	 * actual Pasar por parametro las raquetas? TEMPLATE
	 * 
	 * @throws IOException
	 */
	protected void cambiarRaqueta() throws IOException {

		Campeonato C = Campeonato.getInstance();
		TreeSet<Raqueta> r = new TreeSet<Raqueta>();
		r = ((TreeSet<Raqueta>) C.getRaquetasCampeonato());

		if (!r.isEmpty()) {
			Raqueta r1 = r.first();
			this.setRaqueta(r1);
			r.remove(r1);
			C.getFichero().write("       " + this.getNombre() + " cambia su raqueta por: " + r1.getClass().getName()
					+ " modelo=" + r1.getModelo() + " velocidad=" + r1.calcularVelocidad() + "\n");
		}
	}

	/**
	 * Metodo que realiza la accion de jugar de un tenista. Es decir realiza la
	 * simulacion de un juego, en el que se produce un saque del Tenista 1 y se
	 * realiza un resto del Tenista 1 al saque del Tenista 2.
	 * 
	 * @param t2 (Tenista rival)
	 * @throws IOException (excepcion)
	 */
	public void jugar(Tenista t2) throws IOException {
		sacar();
		t2.restar(this);
		golpear();
		cambiarRaqueta();
	}

	/**
	 * Metodo que nos permite elegir unas zapatillas para un tenista, esto siempre
	 * que el numero de pie sea el mismo que el numero de la zapatilla. El tenista
	 * se le asignara la primera zapatilla que se encuentre con su mismo numero de
	 * pie.
	 * 
	 * 
	 * @return getZapa Devuelve la zapatilla del campeonato que se asigna al tenista
	 *         para despues ser eliminada de la lista en la clase campeonato
	 * @throws IOException (excepcion)
	 */
	public Zapatillas elegirZapatillas() throws IOException {

		Campeonato C = Campeonato.getInstance();
		ArrayList<Zapatillas> z = new ArrayList<Zapatillas>();
		z = ((ArrayList<Zapatillas>) C.getZapatillasCampeonato());
		boolean encontrado = false;
		int i = 0;
		while (i < z.size() && !encontrado) {
			if (this.getNumeroPie().equals(z.get(i).getNumero())) {
				this.setZapa(z.get(i));
				C.getFichero().write("       Zapatillas asignadas: " + getZapa().toString() + "\n");
				encontrado = true;
			}
			i++;
		}

		return getZapa();
	}
}
