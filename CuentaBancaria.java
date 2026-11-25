
public class CuentaBancaria {

    protected String numeroCuenta;
    protected double saldo;
    protected String titular;

    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: $" + monto);
        } else {
            System.out.println("El monto debe ser mayor a cero.");
        }
    }

    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Extracción realizada: $" + monto);
        } else {
            System.out.println("Saldo insuficiente o monto inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
