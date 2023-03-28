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
	 * Calcula la potencia de dos elevado a n
	 * Forma iterativa
	 * Complejidad: O(n), lineal
	 * @param n, integer
	 * @return pow, long
	 */
	public long pow2Iter(int n) {
		long pow = 0;
	    if (n<0)
	    	throw new InvalidParameterException("No permitido el parámetro introducido");
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
			throw new InvalidParameterException("No permitido el parámetro introducido");
		System.out.println("Linear");
		for (int i = 0; i < n; i++)
			doNothing();
	}
	
	/**
	 * Algoritmo cuadratico, O(n^2)
	 * @param n, integer
	 */
	public void quadratic(int n) {
		if (n<0)
			throw new InvalidParameterException("No permitido el parámetro introducido");
		System.out.println("Quadratic");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				doNothing();
		}
	}
	
	/**
	 * Algoritmo cubico, O(n^3)
	 * @param n, integer
	 */
	public void cubic(int n) {
		if (n<0)
			throw new InvalidParameterException("No permitido el parámetro introducido");
		System.out.println("Cubic");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++)
					doNothing();
			}
		}
	}
	
	/**
	 * Algoritmo logaritmico, O(logn)
	 * @param n, integer
	 */
	public void logarithmic(int n) {
		if (n<0)
			throw new InvalidParameterException("No permitido el parámetro introducido");
		System.out.println("Logarithmic");
		for (int i = 1; i < n; i*=2)
			doNothing();
	}
	
	/**
	 * Calcula el factorial de un numero n
	 * Forma recursiva
	 * Complejidad: O(n-1), lineal
	 * @param n, integer
	 * @return el factorial de n, integer
	 */
	public int factorial(int n) {
		if (n < 0)
			throw new InvalidParameterException("No permitido el parámetro introducido");
		if (n == 0) // Caso Base
			return 1;
		else {	// Caso General
			doNothing();
			return n*factorial(n-1);
		}
	}
	
	/**
	 * Calcula el valor fibonacci de un numero n
	 * Forma recursiva
	 * Complejidad espacial: O(n)
	 * Complejidad temporal: O(2^n-1), exponencial
	 * @param n, integer
	 * @return el valor fibonacci de n, integer
	 */
	public int fibonacci(int n) {
		if (n < 0)
			throw new InvalidParameterException("No permitido el parámetro introducido");
		if (n == 0 || n == 1)
			return n;
		else {
			doNothing();
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	/**
	 * Calcula la potencia de a elevada a b
	 * Forma recursiva
	 * Complejidad: O(n), lineal
	 * @param a, integer
	 * @param b, integer
	 * @return resultado de la potencia, long
	 */
	public long potenciaRec(int a, int b) {
		if (a < 0 || b < 0)
			throw new InvalidParameterException("No permitido alguno de los parámetros introducidos");
		if (b == 0)
			return 1;
		else {
			doNothing();
			return a*potenciaRec(a, b-1);
		}
	}
	
	/**
	 * Calcula el resto de la división a entre b
	 * Forma recursiva
	 * Complejidad: O(n), lineal
	 * @param a, integer
	 * @param b, integer
	 * @return el resto de a/b, integer
	 */
	public int restoDivRec(int a, int b) {
		if (a < 0 || b <= 0)
			throw new InvalidParameterException("No permitido alguno de los parámetros introducidos");
		if (a < b)
			return a;
		else {
			doNothing();
			return restoDivRec(a-b, b);
		}
	}
	
	/**
	 * Calcula la división entera a entre b
	 * Forma recursiva
	 * Complejidad: O(n), lineal
	 * @param a, integer
	 * @param b, integer
	 * @return el resultado de a/b, integer
	 */
	public int divEntRec(int a, int b) {
		if (a < 0 || b <= 0)
			throw new InvalidParameterException("No permitido alguno de los parámetros introducidos");
		if (a < b)
			return 0;
		else {
			doNothing();
			return a/b + divEntRec(a/b, b);
		}
	}

	/**
	 * Calcula la potencia de dos elevado a n
	 * Forma recursiva
	 * Complejidad: O(n), lineal
	 * @param n, integer
	 * @return el resultado de la potencia, long
	 */
	public long pow2Rec1(int n) {
		if (n < 0)
			throw new InvalidParameterException("No permitido el parámetro introducido");
		if (n == 0)
			return 1;
		else {
			doNothing();
			return 2*pow2Rec1(n-1);
		}
	}
	
	/**
	 * Calcula la potencia de dos elevado a n
	 * Forma recursiva
	 * Complejidad: O(2^n), exponencial
	 * @param n, integer
	 * @return el resultado de la potencia, long
	 */
	public long pow2Rec2(int n) {
		if (n < 0)
			throw new InvalidParameterException("No permitido el parámetro introducido");
		if (n == 0)
			return 1;
		else {
			doNothing();
			return pow2Rec2(n-1)+pow2Rec2(n-1);
		}
	}

	/**
	 * Calcula la potencia de dos elevado a n
	 * Forma recursiva
	 * Complejidad: O(logn), logaritmica
	 * @param n, integer
	 * @return el resultado de la potencia, long
	 */
	public long pow2Rec3(int n) {
	    if (n < 0) 
	    	throw new InvalidParameterException("No permitido el parámetro introducido");
		if (n == 0)
			return 1;
		if (n % 2 == 0) {
			doNothing();
			return pow2Rec3(n/2)*pow2Rec3(n/2);
		}
		else {
			doNothing();
			return pow2Rec3(n/2)*pow2Rec3(n/2)*2;
		}
    }
	
	/**
	 * Calcula la potencia de dos elevado a n
	 * Forma recursiva
	 * Complejidad: O(logn), logaritmica
	 * @param n, integer
	 * @return el resultado de la potencia, long
	 */
	public long pow2Rec4(int n) {
		if (n < 0) 
	    	throw new InvalidParameterException("No permitido el parámetro introducido");
		if (n == 0)
			return 1;
		else {
			long pow = pow2Rec4(n/2);
			doNothing();
			if (n%2 == 0)
				return pow*pow;
			else
				return pow*pow*2;
		}
    }

	/**
	 * Calcula el valor invertido de un entero
	 * Forma recursiva
	 * Complejidad: O(n)...
	 * @param n, integer
	 * @return el resultado de invertir n, integer
	 */
	public int invertirEnteroRec(int n) {
		if (n < 0) 
	    	throw new InvalidParameterException("No permitido el parámetro introducido");
		if (n < 10)
			return n;
		else {
			doNothing();
			return Integer.parseInt(String.valueOf(n%10) + invertirEnteroRec(n/10));
		}
	}

	/**
	 * Calcula el valor invertido de un string
	 * Forma recursiva
	 * Complejidad: O(n), lineal
	 * @param l, String
	 * @return el resultado de invertir l, String
	 */
	public String invertirStringRec(String l) {
		if (l.length() == 0) 
	    	throw new InvalidParameterException("No permitido el parámetro introducido");
		if (l.length() == 1)
			return l;
		else {
			doNothing();
			return l.charAt(l.length()-1) + invertirStringRec(l.substring(0, l.length()-1));
		}
	}

}
