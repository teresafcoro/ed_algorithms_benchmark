package p1Algoritmia;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

/**
 * Clase AlgorithmsTest
 * Pruebas con JUnit de la clase Algorithms
 * @author MariaTeresaFernandezCoro
 */
class AlgorithmsTest {

	/**
	 * Test de prueba al metodo pow2Iter
	 */
	@Test
	void testPow2Iter() { 
		Algorithms a = new Algorithms();
		// Valor negativo
		try {
			assertEquals(0, a.pow2Iter(-1));
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.pow2Iter(0));
		// Valores intermedios
		assertEquals(16, a.pow2Iter(4));
		assertEquals(1073741824, a.pow2Iter(30));
		assertEquals(1.15292150460684698E18, a.pow2Iter(60));
		// Valor grande
		assertEquals(4.6116860184273879E18, a.pow2Iter(62));
	}
	
	/**
	 * Test de prueba al metodo Linear
	 */
	@Test
	void testLinear() { 
		Algorithms a = new Algorithms();
		// Valor negativo
		try {
			a.linear(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		a.linear(0);
		// Valores intermedios
		a.linear(5);
		a.linear(10);
	}
	
	/**
	 * Test de prueba al metodo Quadratic
	 */
	@Test
	void testQuadratic() { 
		Algorithms a = new Algorithms();
		// Valor negativo
		try {
			a.quadratic(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		a.quadratic(0);
		// Valores intermedios
		a.quadratic(5);
		a.quadratic(10);
	}
	
	/**
	 * Test de prueba al metodo Cubic
	 */
	@Test
	void testCubic() { 
		Algorithms a = new Algorithms();
		// Valor negativo
		try {
			a.cubic(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		a.cubic(0);
		// Valores intermedios
		a.cubic(5);
		a.cubic(10);
	}
	
	/**
	 * Test de prueba al metodo Logarithmic
	 */
	@Test
	void testLogarithmic() { 
		Algorithms a = new Algorithms();
		// Valor negativo
		try {
			a.logarithmic(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		a.logarithmic(0);
		// Valores intermedios
//		a.logarithmic(5);
//		a.logarithmic(10);
	}

}
