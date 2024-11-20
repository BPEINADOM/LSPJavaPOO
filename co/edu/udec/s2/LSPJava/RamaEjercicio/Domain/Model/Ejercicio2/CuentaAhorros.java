package Domain.Model.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("No hay suficiente saldo para retirar.");
        }
    }

}
