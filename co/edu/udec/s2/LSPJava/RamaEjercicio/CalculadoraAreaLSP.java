import Domain.Model.Ejercicio1.Circulo;
import Domain.Model.Ejercicio1.Figura;
import Domain.Model.Ejercicio1.Rectangulo;

public class CalculadoraAreaLSP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        // Instancias de las figuras
        Figura circulo = new Circulo(6);
        Figura rectangulo = new Rectangulo(18, 20);

        // Mostrar el area calculada cumpliendo el LSP
        System.out.println("- Circulo:");
        System.out.println("El area de la figura es: " + circulo.calcularArea());
        System.out.println("- Rectangulo:");
        System.out.println("El area de la figura es: " + rectangulo.calcularArea());

        System.out.println("*********************************************");
    }
}


