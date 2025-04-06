
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

/**
 * Clase en la que se define el Campeonato.
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */
public class  Campeonato extends NotificadorAbstracto {

    String Nombre;
    private List<Tenista> competidores;
    private List<Tenista> eliminados;
    private List<Zapatillas> zapatillasCampeonato;
    private Set<Raqueta> raquetasCampeonato;
    private static Campeonato instanciaCampeonato = null;
    private BufferedWriter bw;

    /**
     * Constructor por defecto de la clase Campeonato.
     * 
     * @throws IOException
     */
    private Campeonato() throws IOException {
        Nombre = "Campeonato de Extremadura";
        competidores = new ArrayList<Tenista>();
        eliminados = new ArrayList<Tenista>();
        zapatillasCampeonato = new ArrayList<Zapatillas>();
        raquetasCampeonato = new TreeSet<Raqueta>(Collections.reverseOrder(new PotenciaComparator()));
        crearFichero();
    }

    /**
     * Constructor parametrizado de la clase Campeonato.
     * 
     * @param Nombre       (Nombre del tenista)
     * @param Competidores (Competidores del torneo)
     * @param Eliminados   (Eliminados del torneo)
     * @throws IOException
     */
    private Campeonato(String Nombre, ArrayList<Tenista> competidores, ArrayList<Tenista> eliminados,
            ArrayList<Zapatillas> zapatillasCampeonato, TreeSet<Raqueta> raquetasCampeonato) throws IOException {
        this.Nombre = Nombre;
        this.competidores = competidores;
        this.eliminados = eliminados;
        this.zapatillasCampeonato = zapatillasCampeonato;
        this.raquetasCampeonato = raquetasCampeonato;
        crearFichero();
    }

    /**
     * Metodo para crear una unica vez una instancia del campeonato
     * 
     * @return nos devuele una instancia del campeonato creada
     * @throws IOException (excepcion)
     */
    public static Campeonato getInstance() throws IOException {
        if (instanciaCampeonato == null) {
            instanciaCampeonato = new Campeonato();
        }
        return instanciaCampeonato;
    }

    /**
     * Metodo que resetea el patron singleton
     */
    public static void resetInstance() {
        instanciaCampeonato = null;
    }

    /**
     * Metodo para detectar si hay una noticia disponible
     * 
     * @param t1    (Primer tenista)
     * @param t2    (Segundo tenista)
     * @param ronda (Ronda del torneo)
     * @throws IOException (excepcion)
     */
    public void noticiaDetectada(Tenista t1, Tenista t2, int ronda) throws IOException {
        notificarSuscriptores(t1, t2, ronda);
    }

    /**
     * Metodo para crear el archivo de salida
     * 
     * @throws IOException (excepcion)
     */
    public void crearFichero() throws IOException {
        String ruta = "archivo.txt";
        File archivo = new File(ruta);
        bw = new BufferedWriter(new FileWriter(archivo));
    }

    /**
     * Metodo que nos devuelve el fichero creado
     * 
     * @return nos devuelve el fichero creado
     */
    public BufferedWriter getFichero() {
        return bw;
    }

    /**
     * Metodo para obtener la lista de los tenistas del campeonato
     * 
     * @return nos devuelve un competidor inscritos en el campeonato
     */
    public List<Tenista> getCompetidores() {
        return competidores;
    }

    /**
     * Metodo para inscribir a los tenistas en la lista de competidores del
     * campeonato
     * 
     * @param competidores (Lista de participantes del torneo)
     */
    public void setCompetidores(List<Tenista> competidores) {
        this.competidores = competidores;
    }

    /**
     * Metodo para obtener el nombre de un tenista
     * 
     * @return nos devuelve el nombre de un tenista
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Metodo para modificar el nombre de un tenista
     * 
     * @param nombre (Nombre del tenista)
     */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /**
     * Metodo para obtener un tenista eliminado
     * 
     * @return nos devuelve el nombre de un tenista eliminado
     */
    public List<Tenista> getEliminados() {
        return eliminados;
    }

    /**
     * Metodo que escribe un tenista en la lista de eliminados.
     * 
     * @param eliminados (Lista de eliminados del torneo)
     */
    public void setEliminados(List<Tenista> eliminados) {
        this.eliminados = eliminados;
    }

    /**
     * Metodo que nos devuelve unas zapatillas inscritas en el campeonato
     * 
     * @return nos devuelve una zapatilla inscrita en el campeonato
     */
    public List<Zapatillas> getZapatillasCampeonato() {
        return zapatillasCampeonato;
    }

    /**
     * Metodo para modificar unas zapatillas
     * 
     * @param zapatillasCampeonato (Lista de zapatillas disponibles)
     */
    public void setZapatillasCampeonato(List<Zapatillas> zapatillasCampeonato) {
        this.zapatillasCampeonato = zapatillasCampeonato;
    }

    /**
     * Metodo para obtener una raqueta de campeonato
     * 
     * @return nos devuelve una raqueta inscrita en el campeonato
     */
    public Set<Raqueta> getRaquetasCampeonato() {
        return raquetasCampeonato;
    }

    /**
     * Metodo para inscribir las raquetas en el campeonato
     * 
     * @param raquetasCampeonato (Set de raquetas disponibles)
     */
    public void setRaquetasCampeonato(Set<Raqueta> raquetasCampeonato) {
        this.raquetasCampeonato = raquetasCampeonato;
    }

    /**
     * Metodo hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
        result = prime * result + ((competidores == null) ? 0 : competidores.hashCode());
        result = prime * result + ((eliminados == null) ? 0 : eliminados.hashCode());
        result = prime * result + ((raquetasCampeonato == null) ? 0 : raquetasCampeonato.hashCode());
        result = prime * result + ((zapatillasCampeonato == null) ? 0 : zapatillasCampeonato.hashCode());
        return result;
    }

    /**
     * Metodo equals
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Campeonato other = (Campeonato) obj;
        if (Nombre == null) {
            if (other.Nombre != null)
                return false;
        } else if (!Nombre.equals(other.Nombre))
            return false;
        if (competidores == null) {
            if (other.competidores != null)
                return false;
        } else if (!competidores.equals(other.competidores))
            return false;
        if (eliminados == null) {
            if (other.eliminados != null)
                return false;
        } else if (!eliminados.equals(other.eliminados))
            return false;
        if (raquetasCampeonato == null) {
            if (other.raquetasCampeonato != null)
                return false;
        } else if (!raquetasCampeonato.equals(other.raquetasCampeonato))
            return false;
        if (zapatillasCampeonato == null) {
            if (other.zapatillasCampeonato != null)
                return false;
        } else if (!zapatillasCampeonato.equals(other.zapatillasCampeonato))
            return false;
        return true;
    }

    /**
     * Metodo que nos permite inscribir a un Tenista en el Campeonato.
     * 
     * @param t (Tenista a inscribir)
     */
    public void inscribirTenista(Tenista t) {
        competidores.add(t);
    }

    /**
     * Metodo para insertar raqueta
     * 
     * @param r(Raqueta para insertar)
     */
    public void insertarRaqueta(Raqueta r) {
        raquetasCampeonato.add(r);
    }

    /**
     * Metodo para insertar zapatilla
     * 
     * @param z(Zapatilla para insertar)
     */
    public void insertarZapatillas(Zapatillas z) {
        zapatillasCampeonato.add(z);
    }

    /**
     * Metodo que nos permite mostrar la salida por pantalla de todos los
     * competidores que participan en el campeonato.
     * 
     * @throws IOException (excepcion)
     */
    public void mostrarCompetidores() throws IOException {
        for (int i = 0; i < competidores.size(); i++) {
            bw.write(" " + competidores.get(i).toString() + "\n");
            bw.write("   " + competidores.get(i).getZapa().toString() + "\n");
            bw.write("       " + competidores.get(i).getRaqueta().toString() + "\n" + "\n");
        }
    }

    /**
     * Metodo que nos permite mostrar todos los eliminados del Campeonato.
     * 
     * @throws IOException (excepcion)
     */
    public void mostrarEliminados() throws IOException {
        for (int i = eliminados.size() - 1; i >= 0; i--) {
            bw.write(" " + eliminados.get(i).toString() + "\n");
            bw.write("   " + eliminados.get(i).getZapa().toString() + "\n");
            bw.write("       " + eliminados.get(i).getRaqueta().toString() + "\n");
        }
    }

    /**
     * Metodo con el que mostramos todas las raquetas disponibles del campeonato
     * 
     * @throws IOException (excepcion)
     */
    public void mostrarRaquetasDisp() throws IOException {
        int i = 0;
        Iterator<Raqueta> it = raquetasCampeonato.iterator();
        while (it.hasNext() && i < raquetasCampeonato.size()) {
            Raqueta r = it.next();
            bw.write("      " + r.toString() + "\n");
        }
    }

    /**
     * Metodo para realizar la llamada para poder iniciar la asignacion de raquetas
     * para cada tenista y mostramos por pantalla la raqueta asignada a cada
     * competidor
     * 
     * @return bandera
     * @throws IOException (excepcion)
     */
    public boolean salidaPantallaInicio() throws IOException {
        boolean bandera;
        bw.write("***** Inicio del campeonato: " + getNombre() + " *****" + "\n" + "\n");
        bandera = asignarRaquetas();
        if (bandera != false) {
            bw.write("\n");
            bw.write("***** Listado de competidores: " + "\n");
            mostrarCompetidores();
            bw.write("***** Listado de raquetas disponibles: " + "\n");
            mostrarRaquetasDisp();
        }
        return bandera;
    }

    /**
     * Metodo para mostrar por pantalla el ganador de la competicion y la lista de
     * los tenistas eliminados
     * 
     * @throws IOException (excepcion)
     */
    public void salidaPantallaEliminados() throws IOException {
        bw.write("---->>>>  Gana la competicion:" + competidores.get(0).toString() + "\n");
        bw.write("   " + competidores.get(0).getZapa().toString() + "\n" + "       "
                + competidores.get(0).getRaqueta().toString() + "\n" + "\n" + "  <<<<----" + "\n");
        bw.write("***** Listado de eliminados: " + "\n");
        mostrarEliminados();
    }

    /**
     * Metodo que nos recrea la accion de jugar entre dos tenistas.
     * 
     * @param t1 (Primer tenista para sacar y restar)
     * @param t2 (Segundo tenista para sacar y restar)
     * @throws IOException (excepcion)
     */
    public void jugar(Tenista t1, Tenista t2) throws IOException {
        t1.jugar(t2);
        t2.jugar(t1);
    }

    /**
     * Metodo para insertar a la lista de eliminados el participante que no consiga
     * pasar de ronda y borrarlo de la lista competidores.
     * 
     * @param j (Tenista eliminado del torneo)
     */
    public void ganaTenista1(int j) {
        eliminados.add(competidores.get(j));
        competidores.remove(competidores.get(j));
    }

    /**
     * Metodo para insertar en la lista de eliminados el participante que no consiga
     * pasar de ronda , se borra de la lista competidores y se borra del torneo al
     * eliminado.
     * 
     * @param i (Tenista ganador)
     * @param j (Tenista eliminado)
     */
    public void ganaTenista2(int i, int j) {
        eliminados.add(competidores.get(i));
        competidores.set(i, competidores.get(j));
        competidores.remove(j);
    }

    /**
     * Metodo que nos permite gestionar la eleccion de las zapatillas de cada
     * tenista. Cada tenista elige la zapatilla de su numero sino se queda con las
     * de por defecto.
     * 
     * @param i (Posicion del Tenista en la lista)
     * @throws IOException (excepcion)
     */
    public void asignacionZapatillas(int i) throws IOException {
        Zapatillas z;
        z = competidores.get(i).elegirZapatillas();
        zapatillasCampeonato.remove(z);
    }

    /**
     * Metodo que nos permite asignar una raqueta a cada participante sabiendo que
     * si no hay raquetas suficientes para todos, el torneo sera pausado
     * 
     * @return bandera
     * @throws IOException (excepcion)
     * 
     */

    public boolean asignarRaquetas() throws IOException {
        bw.write("***** Asignando raquetas a tenistas *****" + "\n");
        int i = 0;
        boolean bandera = true;
        Tenista t;
        Iterator<Raqueta> it = raquetasCampeonato.iterator();
        if (raquetasCampeonato.size() >= competidores.size() && competidores.size() > 0) {
            while (it.hasNext() && i < competidores.size()) {
                Raqueta r = it.next();
                t = competidores.get(i);
                t.setRaqueta(r);
                bw.write("   **     " + r.toString() + " asignada a -->> " + t.getNombre() + "\n");
                it.remove();
                i++;
            }
        } else {
            bandera = false;
            bw.write("CAMPEONATO PAUSADO - NO HAY RAQUETAS PARA TODOS LOS TENISTAS\n");
        }
        return bandera;
    }

    /**
     * Metodo principal que nos permite la simulacion del Campeonato. En este metodo
     * se realiza todas la acciones para que los tenistas se vayan enfrentando y se
     * realice correctamente la competicion.
     * 
     * @throws IOException (excepcion)
     */
    public void torneo() throws IOException {
        if (salidaPantallaInicio() != false) {
            int contadorRondas = 1;
            int Telim = 1;
            for (int l = 0; l <= competidores.size(); l++) {
                int i = 0;
                int juego = 0;
                int j = competidores.size() - 1;
                bw.write("***** Ronda---->>>: " + contadorRondas + "\n");

                for (int k = 0; k < competidores.size(); k++) {
                    competidores.get(i).setPuntosAcumulados(0.0);
                    competidores.get(j).setPuntosAcumulados(0.0);
                    bw.write("  #### Juego ----------->>>: " + juego + "\n");
                    bw.write("    ## Tenista1 (" + competidores.get(i).getClass().getName() + ")---->>>: "
                            + competidores.get(i).getNombre() + "\n");
                    asignacionZapatillas(i);
                    bw.write("    ## Tenista2 (" + competidores.get(j).getClass().getName() + ")---->>>: "
                            + competidores.get(j).getNombre() + "\n");
                    asignacionZapatillas(j);
                    jugar(competidores.get(i), competidores.get(j));
                    if (competidores.get(i).getPuntosAcumulados() > competidores.get(j).getPuntosAcumulados()) {
                        ganaTenista1(j);
                    } else {
                        if (competidores.get(i).getPuntosAcumulados()
                                .equals(competidores.get(j).getPuntosAcumulados())) {
                            if (competidores.get(i).SumaVelocidades() > competidores.get(j).SumaVelocidades()) {
                                ganaTenista2(i, j);
                            } else {
                                ganaTenista1(j);
                            }

                        } else {
                            ganaTenista2(i, j);
                        }
                    }

                    noticiaDetectada(competidores.get(i), eliminados.get(eliminados.size() - 1), contadorRondas);
                    bw.write("    ## Gana este juego: " + competidores.get(i).getNombre() + " con: "
                            + competidores.get(i).getPuntosAcumulados() + " puntos acumulados." + "\n");
                    bw.write("    ## Se elimina: " + eliminados.get(eliminados.size() - 1).getNombre() + " con: "
                            + eliminados.get(eliminados.size() - 1).getPuntosAcumulados() + " puntos acumulados."
                            + " Tenista eliminado num: " + Telim + "\n");

                    juego++;
                    j--;
                    i++;
                    Telim++;
                }
                contadorRondas++;
            }
            salidaPantallaEliminados();
        }
        bw.close();
    }
}
