package p1Algoritmia;

import java.security.InvalidParameterException;

/**
 * Clase Algorithms
 * @author MariaTeresaFernandezCoro
 */
public class Algorithms {
	
	private static final long SLEEP_TIME = 1;

	/**
	 * Duerme un hilo durante el valor de la constante SLEEP_TIME
	 */
	public static void doNothing() {
		try {
			Thread.sleep(SLEEP_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Potencia de dos a la n
	 * Forma iterativa
	 * @param n, integer
	 * @return pow, long
	 */
	public long pow2Iter(int n) {
		long pow = 0;
	    if (n<0)
	    	throw new InvalidParameterException("No permitidos exponentes negativos como "+ n);
	    else {
	    	pow++;
			for (int i=0; i<n; i++) {
				pow *= 2;
				doNothing();
			}
	    }
	    return pow;
	} 
	
	/**
	 * Algoritmo lineal, O(n)
	 * @param n, integer
	 */
	public void linear(int n) {
		if (n<0)
			throw new InvalidParameterException("No permitidos exponentes negativos como "+ n);
		System.out.println("Linear");
		for (int i = 0; i < n; i++) {
			doNothing();
		}
	}
	
	/**
	 * Algoritmo cuadratico, O(n^2)
	 * @param n, integer
	 */
	public void quadratic(int n) {
		if (n<0)
			throw new InvalidParameterException("No permitidos exponentes negativos como "+ n);
		System.out.println("Quadratic");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				doNothing();
			}
		}
	}
	
	/**
	 * Algoritmo cubico, O(n^3)
	 * @param n, integer
	 */
	public void cubic(int n) {
		if (n<0)
			throw new InvalidParameterException("No permitidos exponentes negativos como "+ n);
		System.out.println("Cubic");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					doNothing();
				}
			}
		}
	}
	
	/**
	 * Algoritmo logaritmico, O(log en base 2 de n)
	 * @param n, integer
	 */
	public void logarithmic(int n) {
		if (n<0)
			throw new InvalidParameterException("No permitidos exponentes negativos como "+ n);
		System.out.println("Logarithmic");
		for (int i = 1; i < n; i*=2) {
			doNothing();
		}
	}

}
