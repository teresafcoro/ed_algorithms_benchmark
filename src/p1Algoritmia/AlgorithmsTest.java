package p1Algoritmia;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

/**
 * Clase AlgorithmsTest
 * Pruebas con JUnit de los algoritmos de la clase Algorithms
 * @author MariaTeresaFernandezCoro
 */
class AlgorithmsTest {
	
	Algorithms a = new Algorithms();

	/**
	 * Test de prueba para Pow2Iter
	 */
	@Test
	void testPow2Iter() { 
		// Valor negativo
		try {
			assertEquals(0, a.pow2Iter(-1));
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.pow2Iter(0));
		// Rango de valores posibles
		for (int i = 0; i < 62; i++)
			assertEquals(Math.pow(2, i), a.pow2Rec1(i));
	}
	
	/**
	 * Test de prueba al metodo Linear
	 */
	@Test
	void testLinear() { 
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
		a.linear(60);
	}
	
	/**
	 * Test de prueba al metodo Quadratic
	 */
	@Test
	void testQuadratic() { 
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
		a.quadratic(25);
	}
	
	/**
	 * Test de prueba al metodo Cubic
	 */
	@Test
	void testCubic() { 
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
		a.cubic(8);
	}
	
	/**
	 * Test de prueba al metodo Logarithmic
	 */
	@Test
	void testLogarithmic() { 
		// Valor negativo
		try {
			a.logarithmic(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		a.logarithmic(0);
		// Valores intermedios
		a.logarithmic(5);
		a.logarithmic(20);
	}
	
	/**
	 * Test de prueba al metodo Factorial
	 */
	@Test
	void testFactorial() {
		// Valor negativo
		try {
			a.factorial(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.factorial(0));
		// Valores intermedios
		assertEquals(6, a.factorial(3));
		assertEquals(479001600, a.factorial(12));
	}
	
	/**
	 * Test de prueba al metodo Fibonacci
	 */
	@Test
	void testFibonacci() {
		// Valor negativo
		try {
			a.fibonacci(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(0, a.fibonacci(0));
		// Valores intermedios
		assertEquals(2, a.fibonacci(3));
		assertEquals(144, a.fibonacci(12));
	}
	
	/**
	 * Test de prueba al metodo PotenciaRec
	 */
	@Test
	void testPotenciaRec() {
		// Valor negativo
		try {
			a.potenciaRec(3, -1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.potenciaRec(3, 0));
		// Otros valores
		assertEquals(64, a.potenciaRec(4, 3));
		assertEquals(2.05891132094649E14, a.potenciaRec(3, 30));
		// Rango de valores posibles con base 2
		for (int i = 0; i < 40; i++)
			assertEquals(Math.pow(2, i), a.potenciaRec(2, i));
	}
	
	/**
	 * Test de prueba al metodo RestoDivRec
	 */
	@Test
	void testRestoDivRec() {
		// Valor negativo
		try {
			a.restoDivRec(3, -1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// a < b
		assertEquals(1, a.restoDivRec(1, 3));
		// a > b
		assertEquals(0, a.restoDivRec(3, 3));
		assertEquals(0, a.restoDivRec(30, 3));
		assertEquals(2, a.restoDivRec(522, 5));
	}
	
	/**
	 * Test de prueba al metodo DivEntRec
	 */
	@Test
	void testDivEntRec() {
		// Valor negativo
		try {
			a.divEntRec(3, -1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// a < b
		assertEquals(0, a.divEntRec(1, 3));
		// a > b
		assertEquals(1, a.divEntRec(3, 3));
		assertEquals(14, a.divEntRec(30, 3));
		assertEquals(128, a.divEntRec(520, 5));
	}
	
	/**
	 * Test de prueba al metodo pow2Rec1
	 */
	@Test
	void testPow2Rec1() {
		// Valor negativo
		try {
			a.pow2Rec1(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.pow2Rec1(0));
		// Rango de valores posibles
		for (int i = 0; i < 62; i++)
			assertEquals(Math.pow(2, i), a.pow2Rec1(i));
	}
	
	/**
	 * Test de prueba al metodo pow2Rec2
	 */
	@Test
	void testPow2Rec2() {
		// Valor negativo
		try {
			a.pow2Rec2(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.pow2Rec2(0));
		// Rango de valores posibles
		for (int i = 0; i < 10; i++)
			assertEquals(Math.pow(2, i), a.pow2Rec2(i));
	}
	
	/**
	 * Test de prueba al metodo pow2Rec3
	 */
	@Test
	void testPow2Rec3() {
		// Valor negativo
		try {
			a.pow2Rec3(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.pow2Rec3(0));
		// Rango de valores posibles
		for (int i = 0; i < 20; i++)
			assertEquals(Math.pow(2, i), a.pow2Rec3(i));
	}
	
	/**
	 * Test de prueba al metodo pow2Rec4
	 */
	@Test
	void testPow2Rec4() {
		// Valor negativo
		try {
			a.pow2Rec4(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// Valor más pequeño posible
		assertEquals(1, a.pow2Rec4(0));
		// Rango de valores posibles
		for (int i = 0; i < 20; i++)
			assertEquals(Math.pow(2, i), a.pow2Rec4(i));
	}
	
	/**
	 * Test de prueba al metodo InvertirEnteroRec
	 */
	@Test
	void testInvertirEnteroRec() {
		// Valor negativo
		try {
			a.invertirEnteroRec(-1);
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// numero < 10
		assertEquals(7, a.invertirEnteroRec(7));
		// Otro valor
		assertEquals(21, a.invertirEnteroRec(12));
		assertEquals(321, a.invertirEnteroRec(123));
		assertEquals(4321, a.invertirEnteroRec(1234));
	}
	
	/**
	 * Test de prueba al metodo InvertirStringRec
	 */
	@Test
	void testInvertirStringRec() {
		// Valor negativo
		try {
			a.invertirStringRec("");
		} catch(InvalidParameterException ipe) {
//			ipe.printStackTrace();
		}
		// string con tamaño = 1
		assertEquals("a", a.invertirStringRec("a"));
		// Otro valor
		assertEquals("dcba", a.invertirStringRec("abcd"));
	}
	
}
