package Domain.Model.Ejercicio1;

public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    // Constructor del rectangulo
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementacion
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}