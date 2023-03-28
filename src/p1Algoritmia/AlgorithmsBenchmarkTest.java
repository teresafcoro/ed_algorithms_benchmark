package p1Algoritmia;

import org.junit.jupiter.api.Test;

/**
 * Clase AlgorithmsBenchmarkTest
 * Creo un archivo .csv para cada tipo de algoritmo
 * @author MariaTeresaFernandezCoro
 */
class AlgorithmsBenchmarkTest {

	@Test
	void test() {
		AlgorithmsBenchmark a = new AlgorithmsBenchmark();
		a.testFinal("2020-pow2Iter.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "pow2Iter");
		a.testFinal("2020-linear.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "linear");
		a.testFinal("2020-quadratic.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "quadratic");
		a.testFinal("2020-cubic.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "cubic");
		a.testFinal("2020-logarithmic.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "logarithmic");
	}

}
