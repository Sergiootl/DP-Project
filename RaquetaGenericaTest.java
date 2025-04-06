import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias de Junit de la clase RaquetaGenerica. En especifico de los
 * metodos calcularPotencia(), calcularControl() y calcularVelocidad().
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 * 
 */
public class RaquetaGenericaTest {

	private Raqueta r1;
	private Raqueta r2;
	private Raqueta r3;

	@BeforeEach
	public void setUp() {

		r1 = new RaquetaPotente("Head Radical", 260.0, 680.0, 680.0, EstiloEncordado.ABIERTO);
		r2 = new RaquetaPotente("Wilson Blade", 260.0, 690.0, 680.0, EstiloEncordado.ABIERTO);
		r3 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, EstiloEncordado.CERRADO);
	}

//--------------------------------------------TEST PARA CALCULAR POTENCIA------------------------------------------------------------------	
//-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testCalcularPotencia1() {

		ValoresRaquetas.iniciarMapas();
		Double resultado = r1.calcularPotencia();

		Double esperado = 4.0;
		assertEquals(resultado, esperado, 0.01);
	}

	@Test
	public void testCalcularPotencia2() {

		ValoresRaquetas.iniciarMapas();
		Double resultado2 = r2.calcularPotencia();
		Double esperado2 = 8.0;
		assertEquals(resultado2, esperado2, 0.01);
	}

	@Test
	public void testCalcularPotencia3() {

		ValoresRaquetas.iniciarMapas();
		Double resultado3 = r3.calcularPotencia();
		Double esperado3 = 10.0;
		assertEquals(resultado3, esperado3, 0.01);
	}

//--------------------------------------------TEST PARA CALCULAR CONTROL--------------------------------------------------------------------	
//-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testCalcularControl1() {

		ValoresRaquetas.iniciarMapas();
		Double resultado = r1.calcularControl();
		Double esperado = 4.0;
		assertEquals(resultado, esperado, 0.01);
	}

	@Test
	public void testCalcularControl2() {

		ValoresRaquetas.iniciarMapas();
		Double resultado2 = r2.calcularControl();
		Double esperado2 = 4.0;
		assertEquals(resultado2, esperado2, 0.01);
	}

	@Test
	public void testCalcularControl3() {

		ValoresRaquetas.iniciarMapas();
		Double resultado3 = r3.calcularControl();
		Double esperado3 = 25.0;
		assertEquals(resultado3, esperado3, 0.01);
	}

//--------------------------------------------TEST PARA CALCULAR VELOCIDAD--------------------------------------------------------------------	
//-------------------------------------------------------------------------------------------------------------------------------		

	@Test
	public void testCalcularVelocidad1() {

		ValoresRaquetas.iniciarMapas();
		Double resultado = r1.calcularVelocidad();
		Double esperado = 12.0;
		assertEquals(resultado, esperado, 0.01);
	}

	@Test
	public void testCalcularVelocidad2() {

		ValoresRaquetas.iniciarMapas();
		Double resultado2 = r2.calcularVelocidad();
		Double esperado2 = 12.0;
		assertEquals(resultado2, esperado2, 0.01);
	}

	@Test
	public void testCalcularVelocidad3() {

		ValoresRaquetas.iniciarMapas();
		Double resultado3 = r3.calcularVelocidad();
		Double esperado3 = 2.4;
		assertEquals(resultado3, esperado3, 0.01);
	}
}
