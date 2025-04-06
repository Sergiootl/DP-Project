import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias de Junit de la clase Campeonato. En especifico de los
 * metodos asignarRaquetas() y torneo().
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
class CampeonatoTest {

	private Campeonato camp;
	private Zapatillas z1;
	private Zapatillas z2;
	private Zapatillas z3;

	private Tenista t1;
	private Tenista t2;
	private Tenista t3;

	private Raqueta r1;
	private Raqueta r2;
	private Raqueta r3;

	private Set<Raqueta> rC;
	private List<Tenista> c;

	@BeforeEach
	public void setUp() throws IOException {

		z1 = new ZapatillasConAgarre("Asics Gel-Game", 42.0, 4.5);
		z2 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
		z3 = new ZapatillasAmortiguadas("UberSonic 4K", 40.0, 6.0);

		t1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0);
		t2 = new Golpeadores("Karolina Pliskova", z2, 67.0, 68.5, 3, "Rep Checa", 39.0);
		t3 = new Voleadores("Alexander Zverev", z3, 59.0, 49.5, 4, "Alemania", 42.0);

		r1 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, EstiloEncordado.ABIERTO, 6.0, 2.0);
		r2 = new RaquetaPotente("Dunlop CX200", 300.0, 700.0, 630.0, EstiloEncordado.ABIERTO);
		r3 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, EstiloEncordado.CERRADO);

		rC = new TreeSet<Raqueta>(new PotenciaComparator());// Collections.reverseOrder
		c = new ArrayList<Tenista>();
		camp = Campeonato.getInstance();

	}
//--------------------------------------------TEST PARA ASIGNAR ZAPATILLAS----------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testAsignarRaquetas1() throws IOException {

		ValoresRaquetas.iniciarMapas();

		t1.setRaqueta(r1);

		c.add(t1);

		rC.add(r1);
		rC.add(r2);
		rC.add(r3);

		camp.setCompetidores(c);
		camp.setRaquetasCampeonato(rC);
		camp.asignarRaquetas();

		String resultado = t1.getRaqueta().getModelo();
		String esperado = "Babolat Drive";

		assertEquals(resultado, esperado);
	}

	@Test
	public void testAsignarRaquetas2() throws IOException {

		ValoresRaquetas.iniciarMapas();

		t2.setRaqueta(r2);

		c.add(t2);

		rC.add(r2);
		rC.add(r3);

		camp.asignarRaquetas();

		String resultado = t2.getRaqueta().getModelo();
		String esperado = "Dunlop CX200";

		assertEquals(resultado, esperado);
	}

	@Test
	public void testAsignarRaquetasFuncional() throws IOException {

		ValoresRaquetas.iniciarMapas();

		t2.setRaqueta(r2);

		c.add(t1);
		c.add(t2);

		boolean resultado = camp.asignarRaquetas();
		boolean esperado = false;

		assertEquals(resultado, esperado);
	}

//--------------------------------------------TEST PARA TORNEO----------------------------------------------------------------------	
//-------------------------------------------------------------------------------------------------------------------------------			

	@Test
	public void testTorneo1() throws IOException {

		ValoresRaquetas.iniciarMapas();

		t1.setRaqueta(r1);
		t1.setZapa(z1);
		t2.setRaqueta(r2);
		t2.setZapa(z2);

		c.add(t1);
		c.add(t2);

		camp.setCompetidores(c);
		camp.setRaquetasCampeonato(rC);

		camp.torneo();
		String resultado = camp.getCompetidores().get(0).getNombre();

		String esperado = "Novak Djokovic";
		assertEquals(resultado, esperado);

	}

	@Test
	public void testTorneo2() throws IOException {

		ValoresRaquetas.iniciarMapas();

		t2.setRaqueta(r2);
		t2.setZapa(z1);
		t3.setRaqueta(r3);
		t3.setZapa(z3);

		c.add(t2);
		c.add(t3);

		camp.setCompetidores(c);
		camp.setRaquetasCampeonato(rC);

		camp.torneo();
		String resultado = camp.getCompetidores().get(0).getNombre();
		String esperado = "Karolina Pliskova";

		assertEquals(resultado, esperado);

	}

	@AfterEach
	private void tearDown() {
		camp.resetInstance();

	}
}
