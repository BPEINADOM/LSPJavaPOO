package Domain.Model.Ejercicio1;

public class Circulo extends Figura {
    private double radio;

    // Constructor del circulo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementaciones de circulo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

}
