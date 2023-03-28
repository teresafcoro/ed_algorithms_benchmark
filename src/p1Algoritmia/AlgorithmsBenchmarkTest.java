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
		a.testFinal("2020-factorial.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "factorial");
		a.testFinal("2020-fibonacci.csv", 0, 20, 5, "p1Algoritmia.Algorithms", "fibonacci");
		a.testFinal("2020-pow2Rec1.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "pow2Rec1");
		a.testFinal("2020-pow2Rec2.csv", 0, 10, 5, "p1Algoritmia.Algorithms", "pow2Rec2");
		a.testFinal("2020-pow2Rec3.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "pow2Rec3");
		a.testFinal("2020-pow2Rec4.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "pow2Rec4");
		a.testFinal("2020-invertirEnteroRec.csv", 0, 150, 5, "p1Algoritmia.Algorithms", "invertirEnteroRec");
		
		// Los siguientes algoritmos poseen más de un parámetro...
//		a.testFinal("2020-potenciaRec.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "potenciaRec");
//		a.testFinal("2020-restoDivRec.csv", 0, 10, 5, "p1Algoritmia.Algorithms", "restoDivRec");
//		a.testFinal("2020-divEntRec.csv", 0, 30, 5, "p1Algoritmia.Algorithms", "divEntRec");
//		a.testFinal("2020-invertirStringRec.csv", 0, 10, 1, "p1Algoritmia.Algorithms", "invertirStringRec");
	}

}
