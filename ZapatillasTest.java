import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias de Junit de la clase Zapatillas. En especifico de los
 * metodos calcularValorSaque() y calcularValorResto().
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public class ZapatillasTest {

	private Zapatillas resto1;
	private Zapatillas resto4;
	private Zapatillas resto6;
	private Zapatillas resto7;

	private Zapatillas saque2;
	private Zapatillas saque3;
	private Zapatillas saque5;
	private Zapatillas saque8;

	@BeforeEach
	public void setUp() {

		resto1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
		resto4 = new ZapatillasAmortiguadas("Vapor Lite", 42.0, 3.0);
		resto6 = new ZapatillasAmortiguadas("UberSonic 4K", 40.0, 6.0);
		resto7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 3.5);

		saque2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
		saque3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40.0, 4.0);
		saque5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
		saque8 = new ZapatillasConAgarre("CourtJam Bounce", 42.0, 3.5);
	}

//--------------------------------------------TEST PARA CALCULAR SAQUE--------------------------------------------------------------------	
//-------------------------------------------------------------------------------------------------------------------------------		

	/**
	 * Test method for {@link Zapatillas#calcularValorSaque()}.
	 */
	@Test
	public void testCalcularValorSaque1() {

		Double resultado = saque2.calcularValorSaque();
		Double esperado = 6.0;
		assertEquals(resultado, esperado, 0.01);
	}

	@Test
	public void testCalcularValorSaque2() {

		Double resultado2 = saque3.calcularValorSaque();
		Double esperado2 = 4.8;
		assertEquals(resultado2, esperado2, 0.01);
	}

	@Test
	public void testCalcularValorSaque3() {

		Double resultado3 = saque5.calcularValorSaque();
		Double esperado3 = 3.6;
		assertEquals(resultado3, esperado3, 0.01);
	}

	@Test
	public void testCalcularValorSaque4() {

		Double resultado4 = saque8.calcularValorSaque();
		Double esperado4 = 4.2;
		assertEquals(resultado4, esperado4, 0.01);
	}

// --------------------------------------------TEST PARA CALCULAR RESTO--------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------------------------

	/**
	 * Test method for {@link Zapatillas#calcularValorResto()}.
	 */
	@Test
	public void testCalcularValorResto1() {

		Double resultado = resto1.calcularValorResto();
		Double esperado = 6.5;
		assertEquals(resultado, esperado, 0.01);
	}

	@Test
	public void testCalcularValorResto2() {

		Double resultado2 = resto4.calcularValorResto();
		Double esperado2 = 3.9;
		assertEquals(resultado2, esperado2, 0.01);
	}

	@Test
	public void testCalcularValorResto3() {

		Double resultado3 = resto6.calcularValorResto();
		Double esperado3 = 7.8;
		assertEquals(resultado3, esperado3, 0.01);
	}

	@Test
	public void testCalcularValorResto4() {

		Double resultado4 = resto7.calcularValorResto();
		Double esperado4 = 4.55;
		assertEquals(resultado4, esperado4, 0.01);
	}
}
