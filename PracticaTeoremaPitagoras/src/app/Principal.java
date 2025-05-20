package app;

import clases.TrianguloRectangulo;

public class Principal extends TrianguloRectangulo{
    // Triángulo con catetos aleatorios entre 1 y 10
    int cateto1 = + 1;
    int cateto2 = + 1;

TrianguloRectangulo t1 = new TrianguloRectangulo(cateto1, cateto2);

// Triángulo por defecto
TrianguloRectangulo t2 = new TrianguloRectangulo();

// Calcular área y perímetro de los 2  triángulos
double area1 = t1.area();
double perimetro1 = t1.perimetro();

double area2 = t2.area();
double perimetro2 = t2.perimetro();

// Lo de Depurar no se como hacerlo 

}
