import Domain.Model.Ejercicio3.Bicicleta;
import Domain.Model.Ejercicio3.Coche;
import Domain.Model.Ejercicio3.Transporte;

public class VehiculosLSP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");

        Transporte transporte = new Transporte();
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        transporte.moverse();
        bicicleta.moverse();
        coche.moverse();

        System.out.println("*********************************************");

    }
}
