package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import clases.TrianguloRectangulo;

class testTrianguloRectanguloTest {

	@BeforeAll
	static void setup() {
		TrianguloRectangulo tri1 = new TrianguloRectangulo();
	}
	@Test
	void testArea() {
		TrianguloRectangulo tri1 = null;
		double resultadoObtenido = tri1.area();
		double resultadoEsperado = 0.5;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	@Test
	void testHipotenusa() {
		TrianguloRectangulo tri1 = null;
		double resultadoObtenido = tri1.hipotenusa();
		double resultadoEsperado = 1.41;
		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}
	@Test
	void testPerimetro() {
		TrianguloRectangulo tri1 = null;
		double resultadoObtenido = tri1.perimetro();
		double resultadoEsperado = 3.41;
		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}
	@Test
	void testArea2() {
		TrianguloRectangulo tri2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = tri2.area();
		double resultadoEsperado = 4;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	@Test
	void testHipotenusa2() {
		TrianguloRectangulo tri2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = tri2.hipotenusa();
		double resultadoEsperado = 4.47;
		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}
	@Test
	void testPerimetro2() {
		TrianguloRectangulo tri2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = tri2.perimetro();
		double resultadoEsperado = 10.47;
		assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
	}
	@Test
	void testExcepcion() {
		Exception E = assertThrows(IllegalArgumentException.class, () -> new TrianguloRectangulo(-1, -3));
		String mensajeEsperado = "Los catetos NO pueden tener valores negativos";
		String mensajeObtenido = E.getMessage();
		assertEquals(mensajeObtenido, mensajeEsperado);
	}
}
