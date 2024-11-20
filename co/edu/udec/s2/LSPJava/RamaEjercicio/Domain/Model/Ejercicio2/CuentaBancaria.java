package Domain.Model.Ejercicio2;

public abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public abstract void retirar(double cantidad);
}
