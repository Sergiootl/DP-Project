import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias de Junit de la clase Tenista. En especifico de los metodos
 * sumaVelocidades(), calcularSaque(),calcularResto(), jugar() y
 * elegirZapatillas().
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public class TenistaTest {

	private Zapatillas z1;
	private Zapatillas z2;
	private Zapatillas z3;

	private Zapatillas p2;
	private Zapatillas p3;

	private Tenista t1;
	private Tenista t2;
	private Tenista t3;

	private Raqueta r1;
	private Raqueta r2;
	private Raqueta r3;

	@BeforeEach
	public void setUp() {

		z1 = new ZapatillasConAgarre("Asics Gel-Game", 42.0, 4.5);
		z2 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
		z3 = new ZapatillasAmortiguadas("UberSonic 4K", 40.0, 6.0);

		p2 = new ZapatillasConAgarre("Adidas", 39.0, 3.0);
		p3 = new ZapatillasAmortiguadas("Nike", 40.0, 6.0);

		t1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0);
		t2 = new Golpeadores("Karolina Pliskova", z2, 67.0, 68.5, 3, "Rep Checa", 39.0);
		t3 = new Voleadores("Alexander Zverev", z3, 59.0, 49.5, 4, "Alemania", 42.0);

		r1 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, EstiloEncordado.ABIERTO, 6.0, 2.0);
		r2 = new RaquetaPotente("Dunlop CX200", 300.0, 700.0, 630.0, EstiloEncordado.ABIERTO);
		r3 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, EstiloEncordado.CERRADO);

	}

//-----------------------------------TEST PARA CALCULAR SUMA DE VELOCIDADES------------------------------------------------------	
//-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testSumaVelocidades() {
		t1.setRaqueta(r1);
		t1.setZapa(z1);
		Double resultado = t1.SumaVelocidades();
		Double esperado = 170.0;
		assertEquals(resultado, esperado, 0.01);
	}

//-------------------------------------------------TEST PARA CALCULAR SAQUE------------------------------------------------------	
//-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testCalcularSaque() {
		t1.setRaqueta(r1);
		ValoresRaquetas.iniciarMapas();
		Double resultado = t1.calcularSaque();
		Double esperado = 46655.99999999999;
		esperado = Math.round(esperado * 100.0) / 100.0;
		resultado = Math.round(t1.calcularSaque() * 100.0) / 100.0;
		assertEquals(resultado, esperado, 0.01);
	}

////-------------------------------------------------TEST PARA CALCULAR RESTO------------------------------------------------------	
////-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testCalcularResto() {
		t1.setRaqueta(r1);
		ValoresRaquetas.iniciarMapas();
		Double resultado = t1.calcularResto();
		Double esperado = 50918.4;
		assertEquals(resultado, esperado, 0.01);
	}

////-----------------------------------------------------TEST PARA JUGAR-----------------------------------------------------------	
////-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testJugar1() throws IOException {

		ValoresRaquetas.iniciarMapas();

		t1.setRaqueta(r1);
		t1.setZapa(z1);

		t2.setRaqueta(r2);
		t2.setZapa(z2);

		t1.jugar(t2);

		Double resultado = t1.getPuntosAcumulados();
		Double esperado = 46656.399999999994;

		assertEquals(resultado, esperado, 0.01);
	}

	@Test
	public void testJugar2() throws IOException {

		ValoresRaquetas.iniciarMapas();

		t2.setRaqueta(r2);
		t2.setZapa(z2);

		t3.setRaqueta(r3);
		t3.setZapa(z3);

		t2.jugar(t3);

		Double resultado = t2.getPuntosAcumulados();
		Double esperado = 26050.5;

		assertEquals(resultado, esperado, 0.01);
	}

////-----------------------------------------------TEST PARA ELEGIR ZAPATILLAS-----------------------------------------------------------	
////-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testElegirZapatillas1() throws IOException {

		t1.setZapa(z1);
		t1.elegirZapatillas();
		t1.setZapa(p2);

		Double resultado = t1.getZapa().getNumero();
		Double esperado = 39.0;

		assertEquals(resultado, esperado, 0.01);
	}

	@Test
	public void testElegirZapatillas2() throws IOException {

		t3.setZapa(z3);
		t3.elegirZapatillas();
		t3.setZapa(p3);

		Double resultado = t3.getZapa().getNumero();
		Double esperado = 40.0;

		assertEquals(resultado, esperado, 0.01);

	}

}
