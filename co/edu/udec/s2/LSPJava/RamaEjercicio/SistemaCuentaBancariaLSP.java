import Domain.Model.Ejercicio2.CuentaAhorros;
import Domain.Model.Ejercicio2.CuentaBancaria;

public class SistemaCuentaBancariaLSP {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        CuentaBancaria cuenta = new CuentaAhorros();

        // Depositar dinero
        cuenta.depositar(250000.0);
        System.out.println("Deposito exitoso!");
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

        System.out.println("*********************************************");

        // Retirar dinero
        cuenta.retirar(150000.0);
        System.out.println("Retiro exitoso!");
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());

        System.out.println("*********************************************");

        // Intento de retirar mas de lo que se tiene de saldo actualmente
        cuenta.retirar(200000.0);

        System.out.println("*********************************************");


    }
}
