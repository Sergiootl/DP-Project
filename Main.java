import java.io.IOException;

/**
 * Metodo para el main del proyecto , sin este no podemos realizar la simulacion
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public class Main {

	/**
	 * Metodo que nos permite realizar la simulacion del campeonato con los valores
	 * definidos previamente en la clase Init.
	 * 
	 * @param args (argumentos)
	 * @throws IOException (excepcion)
	 */
	public static void main(String[] args) throws IOException {
		// Creacion del campeonato
		Campeonato C = Campeonato.getInstance();
		// Intancias del patron observer
		MedioGeneralista LaTierrina = new MedioGeneralista("La Tierrina");
		MedioSensacionalista Adios = new MedioSensacionalista("Adios");
		MedioDeportivo Anota = new MedioDeportivo("Anota");
		// Suscribir a cada uno de esos medios a lo que pueda ocurrir en el Campeonato
		C.suscribir(LaTierrina);
		C.suscribir(Adios);
		C.suscribir(Anota);
		// Carga de datos iniciales del campeonato
		Init I = new Init(C);
		// Llamada al metodo que inicia la simulacion del campeonato
		C.torneo();
	}

}
