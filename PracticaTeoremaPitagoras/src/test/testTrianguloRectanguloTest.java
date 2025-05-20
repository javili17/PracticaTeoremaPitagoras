package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.TrianguloRectangulo;

class testTrianguloRectanguloTest {

    @Test
    void testTrianguloPorDefecto() {
        TrianguloRectangulo t1 = new TrianguloRectangulo();

        double areaEsperada = 0.5;
        double perimetroEsperado = 1 + 1 + Math.sqrt(2);
        double hipotenusaEsperada = Math.sqrt(2);

        assertEquals(areaEsperada, t1.area());
        assertEquals(perimetroEsperado, t1.perimetro());
        assertEquals(hipotenusaEsperada, t1.getC());
    }

    @Test
    void testTrianguloValido() {
        TrianguloRectangulo t2 = new TrianguloRectangulo(3, 4);

        double areaEsperada = 6.0;
        double perimetroEsperado = 3 + 4 + 5;
        double hipotenusaEsperada = 5.0;

        assertEquals(areaEsperada, t2.area());
        assertEquals(perimetroEsperado, t2.perimetro());
        assertEquals(hipotenusaEsperada, t2.getC());
    }

  
    }
